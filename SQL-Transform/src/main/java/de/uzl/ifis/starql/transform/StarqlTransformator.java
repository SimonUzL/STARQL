package de.uzl.ifis.starql.transform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import de.uzl.ifis.starql.parser.StarqlLexer;
import de.uzl.ifis.starql.parser.StarqlParser;
import de.uzl.ifis.starql.parser.StarqlTreeWalker;
import de.uzl.ifis.starql.query.Aggregator;
import de.uzl.ifis.starql.query.Binding;
import de.uzl.ifis.starql.query.Pulse;
import de.uzl.ifis.starql.query.QueryInfo;
import de.uzl.ifis.starql.query.Stream;
import de.uzl.ifis.starql.query.QueryHead.HeadType;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.StarqlVar;

public abstract class StarqlTransformator implements StarqlTransformatorInterface{
	
	private String starql;
	private QueryInfo qinfo = new QueryInfo();
	protected Set<String> constraints = new HashSet<String>();
	private Unfolder unf = null;
	protected Set<String> streamSet = new HashSet<String>();	
	protected Set<String> streamSet2 = new HashSet<String>();	
	private Set<String> inputStreamSet = new HashSet<String>();	
	private Set<String> inputStaticSet = new HashSet<String>();	
	protected ArrayList<Aggregator> aggSet = new ArrayList<Aggregator>();
	protected Integer outNum = 0;
	private Parameters param = null;
	private Boolean select = false;
	public int ontopStrm = 0;
	
	public Set<String> getInputStreamSet() {
		return inputStreamSet;
	}

	public void setInputStreamSet(Set<String> inputStreamSet) {
		this.inputStreamSet = inputStreamSet;
	}

	public Set<String> getInputStaticSet() {
		return inputStaticSet;
	}

	public void setInputStaticSet(Set<String> inputStaticSet) {
		this.inputStaticSet = inputStaticSet;
	}
	
	public QueryInfo getQueryInfo(String qry) throws RecognitionException {
		QueryInfo qinfo = new QueryInfo();
		CharStream charStream = new ANTLRStringStream(qry);
		StarqlLexer lexer = new StarqlLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		StarqlParser parser = new StarqlParser(tokenStream);
		StarqlParser.query_return ret = parser.query();
		//printTree((CommonTree)ret.getTree());
		CommonTreeNodeStream ctns = new CommonTreeNodeStream(ret.getTree());
		StarqlTreeWalker walker = new StarqlTreeWalker(ctns);
		qinfo = walker.query();
		for (Map.Entry<String, Pulse> entry : qinfo.getPulse().entrySet()) {
		    String key = entry.getKey().toString();
		    Pulse value = entry.getValue();
		    //system.out.println("Stream, " + key + " Pulse " + value.getName());
		}
		return qinfo;
	}
	
	public Boolean isHistorical() throws RuntimeException{
		for(Stream s : qinfo.getStreamList()){
			if(s.getPulse() == null)
				throw new RuntimeException(
							"No pulse declaration for Stream: "
									+ s.getName());
			if(qinfo.getPulse(s.getPulse()) == null)
			throw new RuntimeException(
						"No pulse declaration for Stream: "
								+ s.getName());
			Boolean hasIntDate = qinfo.getPulse(s.getPulse()).hasIntegerDate;
			if(!hasIntDate && (qinfo.getPulse(s.getPulse()).getStart() == null || qinfo.getPulse(s.getPulse()).getEnd() == null)) {
				  return false;
			}
		}
		return true;
	}
	
	public void setSelect(Boolean select) {
		this.select = select;
	}

	public String getStarql() {
		return starql;
	}

	public void setStarql(String starql) {
		this.starql = starql;
	}

	public QueryInfo getQinfo() {
		return qinfo;
	}

	public void setQinfo(QueryInfo qinfo) {
		this.qinfo = qinfo;
	}

	public Unfolder getUnf() {
		return unf;
	}

	public void setUnf(Unfolder unf) {
		this.unf = unf;
	}

	public Parameters getParam() {
		return param;
	}

	public void setParam(Parameters param) {
		this.param = param;
	}
	
	public Boolean getSelect() {
		return select;
	}
	
	private Set<String> cleanUpConstraints(Set<String> constraints, String disjStr){
		Map<String,Set<String>> constrMap = new HashMap<String, Set<String>>();
		Set<String> tmpSet = new HashSet<String>();
		Set<String> newConstraints = new HashSet<String>();
		String firstStr = "", secondStr = "";
		
		for (String constr : constraints) {			
			if(!constr.contains("=") || constr.contains("SELECT") || constr.startsWith("(wid")){
				newConstraints.add(constr);
				continue;
			}				
			firstStr = constr.split("=")[0].trim();
			String tmpStr = constr.split("=")[1].trim();
			secondStr = tmpStr.substring(0, tmpStr.length()-1);
			if(constrMap.get(firstStr) != null)
				tmpSet.addAll(constrMap.get(firstStr));
			tmpSet.add(secondStr);
			Set<String> tmpSet2 = new HashSet<String>();
			tmpSet2.addAll(tmpSet);
			constrMap.put(firstStr, tmpSet2);
			tmpSet.clear();
		}	
		for (Map.Entry<String, Set<String>> entry : constrMap.entrySet())
		{
		    Boolean first = true;
			String orStr = "";
			for(String str : entry.getValue()){
				if(!first){
					orStr += " "+disjStr+" ";
				}else{
					first = false;
				}
				orStr += str;				
			}
			orStr += ")";
			newConstraints.add(entry.getKey() + " = "+ orStr);
		}
		return newConstraints;
	}
	
	public String addConstraints(Set<String> constraints, Boolean first, String conjStr, String disjStr) {
		String str = "";		
		constraints = cleanUpConstraints(constraints, disjStr);
		for (String constr : constraints) {
			constr = constr.trim();
			if (!first && !constr.equals(""))
				str += "\r\n"+conjStr+" ";
			first = false;
			str += constr;
		}		
		return str;
	}
	
	public String buildAggregators(Stream strm){
		String str = "";
		if(strm.getGrpby() != null)
			for(StarqlVar svar : strm.getGrpby().getGrpVars()){
				if(strm.getHvg() != null)
					if(strm.getHvg().getSafeVars().getVars().contains(svar))
						continue;
				if(strm.getWhere() != null)
					if(strm.getWhere().getSafeVars().getVars().contains(svar) )
						continue;
				throw new RuntimeException("NO FREE AND SAFE GROUP VARIABLE: "+ svar.toString());
			}
		if(strm.getReturn().gethType().equals(HeadType.SELECT)){
			Set<StarqlVar> checkVars = new HashSet<StarqlVar>();
			for(Binding bind : strm.getReturn().getVars())
				for(StarqlVar svar : bind.getAex().getVars())
					checkVars.add(svar);
			if(strm.getHvgAggregate() != null)
				checkVars.addAll(strm.getHvgAggregate().getUnboundValues());
			for(StarqlVar svar : checkVars)
				if(svar.hasAgg()){
					aggSet.add(svar.getVarAgg());
					str += buildAggStream(svar, strm) + "\r\n";
				}
		}
		else
		for (Triple triple : strm.getReturn().getiTriple().getTriple()) {
			if(triple.hasAgg()){
				aggSet.add(triple.getAgg());
				str += buildAggStream(triple, strm) + "\r\n";
			}
		}
		return str;
	}
	
	protected String transform() {
		String resultStr = "";
		String lastName = "";
		unf.setIsHistorical(isHistorical());
		QueryInfo qinfo = getQinfo();
		unf.setPrefixList(qinfo.getPrefixList());
		for (Stream strm : qinfo.getStreamList()) {
			if(!strm.isSafe())
			{
				throw new RuntimeException("THE VARIABLES IN STREAM "+strm.getName()+" ARE NOT SAFE, PLEASE REFORMULATE.");
			}
			unf.setName(strm.getName());
			resultStr += constructView(strm) + "\r\n";
			if(isHistorical())
				resultStr += addIndex(strm);
			resultStr += joinedStream(strm) + "\r\n";
			resultStr += addTime(strm)+ "\r\n";
			resultStr += constructHaving(strm) + "\r\n";
			resultStr += buildAggregators(strm) + "\r\n";
			resultStr += addTimeJoin(strm) + "\r\n";
			resultStr += constructOut(strm);
			lastName = strm.getName();
			constraints.clear();
			streamSet2.clear();
		}
		resultStr = finalTouch(resultStr, lastName);
		
		return resultStr;
	}

	


}
