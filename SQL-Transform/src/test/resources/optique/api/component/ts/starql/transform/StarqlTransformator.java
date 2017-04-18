/**
 * StarQL Transformation
 *
 * @author Christian Neuenstadt
 */

package eu.optique.api.component.ts.starql.transform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import eu.optique.api.component.ts.starql.parser.*;
import eu.optique.api.component.ts.starql.query.main.*;
import eu.optique.api.component.ts.starql.query.base.*;
import eu.optique.api.component.ts.starql.query.having.HvgTreeElem;
import eu.optique.api.component.ts.starql.query.having.IndexedTriple;
import eu.optique.api.component.ts.starql.query.having.StarqlVar;
import eu.optique.api.component.ts.starql.query.having.StarqlVar.StarqlVarType;
import eu.optique.api.component.ts.starql.query.having.TreeFunctions;
import eu.optique.api.component.ts.starql.transform.MappingResult.MappingType;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class StarqlTransformator {
	private Boolean isHistorical = false;
	private String starql;
	private String genTableStr = "CREATE STREAM ";
	private String adp = "";
	private QueryInfo qinfo = new QueryInfo();
//	private DBMetadata dbData = new DBMetadata();
	private Set<String> constraints = new HashSet<String>();
	private Integer numWid = null;
	private Unfolder unf = null;
	private Set<String> streamSet = new HashSet<String>();	
	private Set<String> streamSet2 = new HashSet<String>();	
	private ArrayList<Triple> aggSet = new ArrayList<Triple>();
	private Integer outNum = 0;
	private Parameters param = null;
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
	private PostgresData pgData = null;
	
	public StarqlTransformator(String starql, Unfolder unf, Parameters param, PostgresData pgData) {
		this.starql = starql;
		this.unf = unf;
		this.param = param;
		this.pgData = pgData;
		try {
			this.qinfo = getQueryInfo(starql);
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		unf.setPrefixList(qinfo.getPrefixList());
		this.adp = transformToADP();
	}

	private QueryInfo getQueryInfo(String qry) throws RecognitionException {
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
		return qinfo;
	}

	private static void printTree(CommonTree ast) {
        print(ast, 0);
}

	private static void print(CommonTree tree, int level) {
        //indent level
        for (int i = 0; i < level; i++)
                System.out.print("--");

        //print node description: type code followed by token text
        //system.out.println(" " + tree.getType() + " " + tree.getText());
        
        //print all children
        if (tree.getChildren() != null)
                for (Object ie : tree.getChildren()) {
                        print((CommonTree) ie, level + 1);
                }
}
	
	public String getAdpQuery() {
		return this.adp;
	}
	
	public Boolean isHistorical(){
		if(qinfo.getPulse().getStart() != null || qinfo.getPulse().getEnd() != null){
			return true;
		}else{
			return false;
		}
	}
	
	public String getStart(){
		return  df.format(qinfo.getPulse().getStart());
	}
	
	public String getEnd(){
		return  df.format(qinfo.getPulse().getEnd());
	}

	private String buildViewString(String name, int range, int frequency,
			int granularity, int column) {
		String viewString = genTableStr+name;
		if(isHistorical)
			viewString += "_stream ";
		viewString += " AS WCACHE SELECT * FROM \r\n(newtimeslidingwindow timecolumn:"
				+ column + " timewindow:" + range + " frequency:" + frequency
				+ " " + "granularity:" + granularity
				+ " equivalence:floor SELECT DISTINCT cast(strftime('%s', timestamp) as int), * FROM (";
		if(!isHistorical){
			if(pgData == null){
					viewString += "streamdata '"+param.getStreamPath() + name
					+ ".csv' ";
					if(param.getStream(name) != null){
						if(param.getStream(name).getRatio() > 1)
							viewString += "ratio:"+param.getStream(name).getRatio()+ " ";
						if(param.getStream(name).getOutputSame() == true)
							viewString += "output:same ";
						if(param.getStream(name).getStartTimestamp() != "now")
							viewString += "starttimestamp:"+ param.getStream(name).getStartTimestamp() +" ";
					}
			}else{
					viewString += "newstreamdata ";
					if(param.getStream(name) != null){
						if(param.getStream(name).getRatio() > 1)
							viewString += "ratio:"+param.getStream(name).getRatio()+ " ";
						if(param.getStream(name).getOutputSame() == true)
							viewString += "output:same ";
						if(param.getStream(name).getStartTimestamp() != "now")
							viewString += "starttimestamp:"+ param.getStream(name).getStartTimestamp() +" ";
					}
					viewString += "select * from (";
					viewString += "postgres h:"+pgData.getIp()+" port:"+pgData.getPort()+" u:"+pgData.getUsr()+" p:"+pgData.getPw()+" db:"+pgData.getDb()+" select * from "+name;
					viewString += ")";
			}
			}else {
				viewString += "SELECT * FROM "+name+" WHERE ";
				if(qinfo.getPulse().getStart() != null){
					viewString += "timestamp > '" + df.format(qinfo.getPulse().getStart())+"'";
					if(qinfo.getPulse().getEnd() != null)
						viewString += " AND ";
				}
				if(qinfo.getPulse().getEnd() != null){
					viewString += "timestamp < '" + df.format(qinfo.getPulse().getEnd())+"'";
				}
			}
		viewString += "));\r\n";
		return viewString;
	}

	private String constructView(Stream strm) {
		String view = "";
		//if(qinfo.getPulse() != null){
		//	view = buildViewString("pulse", 0, 1, qinfo.getPulse().getFreq(), 0);			
		//}
		for (Stream stream : qinfo.getStreamList()) {
				streamSet.add(stream.getName());
		}
			for (Window win : strm.getFrom().getList()) {
				if (!streamSet.contains(win.getName())) {
					view += buildViewString(win.getName(), win.getTimewindow(),
							win.getSlide(), 1, 0);
				}
			}
		return view;
	}

	private Set<String> cleanUpConstraints(Set<String> constraints){
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
					orStr += " OR ";
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
	
	private String addConstraints(Set<String> constraints, Boolean first) {
		String str = "";		
		constraints = cleanUpConstraints(constraints);
		for (String constr : constraints) {
			constr = constr.trim();
			if (!first && !constr.equals(""))
				str += "\r\nAND ";
			first = false;
			str += constr;
		}		
		return str;
	}

	private Set<Triple> getTripleList(Stream strm, StarqlVar sVar) {
		Set<Triple> trples = new HashSet<Triple>();
		Set<IndexedTriple> iTriples = strm.getHvg().getLowerIndTriples(false);
		iTriples.addAll(strm.getWhere().getiTriples());
		for (IndexedTriple iTriple : iTriples) {
			trples.addAll(iTriple.getVarTriple(sVar));
		}
		return trples;
	}

	private Set<Triple> getTripleList(Set<IndexedTriple> iTriples,
			StarqlVar sVar) {
		Set<Triple> trples = new HashSet<Triple>();
		for (IndexedTriple iTriple : iTriples) {
			trples.addAll(iTriple.getVarTriple(sVar));
		}
		return trples;
	}

	private Set<String> arrangeResColumns(Set<String> resColumns){
		String lastColumn = "";		
		Map<String,Set<String>> constrMap = new HashMap<String, Set<String>>();
		Set<String> tmpSet = new HashSet<String>();
		
		for (String column : resColumns) {
			if (lastColumn.equals(""))
				lastColumn = column;
			if (!lastColumn.equals(column)) {
				//column = column.substring(0, column.length()-1);
				if(constrMap.get(lastColumn) != null)
					tmpSet.addAll(constrMap.get(lastColumn));
				tmpSet.add(column);
				Set<String> tmpSet2 = new HashSet<String>();
				tmpSet2.addAll(tmpSet);
				constrMap.put(lastColumn, tmpSet2);
				tmpSet.clear();
			}
			lastColumn = column;
		}											
			
		for (Map.Entry<String, Set<String>> entry : constrMap.entrySet())
		{
		    Boolean first = true;
			String orStr = "";
			for(String str : entry.getValue()){
				if(!first){
					orStr += " OR ";
				}else{
					first = false;
				}
				orStr += str;				
			}
			orStr += ")";
			tmpSet.add("("+entry.getKey() + " = "+ orStr);
		}	
		return tmpSet;
	}
	/*public MappingResult findMappingColumns_where(StarqlVar sVar, Triple trple) {
		MappingResult mRes = new MappingResult();
		Unfolding unfold = new Unfolding();
		String resColumn = "";
		unfold = unf.unfold(sVar, trple);					
		resColumn = unfold.getResColumn();	
		mRes.addConstraint(unfold.getWhereConstraints());
		mRes.addResColumn(resColumn);
		if(!unfold.isDynamic() && !unfold.isStatic() ){
			mRes.setmType(MappingType.TIME);
		}else{
			if(unfold.isDynamic())
				mRes.setmType(MappingType.DYNAMIC);
			if(unfold.isStatic())
				mRes.setmType(MappingType.STATIC);
		}
		return mRes;
	}*/

	/*public MappingResult findMappingColumns(StarqlVar sVar, Stream strm) {
		MappingResult mRes = new MappingResult();
		Unfolding unfold = new Unfolding();
		Set<String> resColumns = new HashSet<String>();
		String resColumn = "", selColumn = "", tmpColumn = "";
		Set<Triple> trples = strm.getWhere().getVarTriple(sVar);
		////system.out.println(constraints);
		for (Triple trple : trples) {
			unfold = unf.unfold(sVar, trple);			
			tmpColumn = unfold.getResColumn();	//where clause with higher priority			
			resColumn = unfold.getResColumn();
			selColumn = unfold.getSelStmt();
			resColumns.add(unfold.getResColumn());		
			mRes.addConstraint(unfold.getWhereConstraints());
			mRes.setSource(trple.toStringSQL());
			mRes.addResTriple(trple);
			mRes.addResColumn(resColumn);
		}
			
		if (strm.getHvg() != null) {	
			trples = getTripleList(strm.getHvg().getLowerIndTriples(false), sVar);
			for (Triple trple : trples) {
				////system.out.println("finde: "+sVar+ " in: "+trple);
				unfold = unf.unfold(sVar, trple);
				if (!unfold.isDynamic()) {
					resColumn = unfold.getResColumn();
					selColumn = unfold.getSelStmt();
				}else{
					if(tmpColumn.isEmpty())
						tmpColumn = trple.getPos(sVar);
				}
				mRes.addResColumn(unfold.getResColumn());
				mRes.addConstraint(unfold.getWhereConstraints());
				mRes.setSource(trple.toStringSQL());
				mRes.addResTriple(trple);
				mRes.setSelStmt(unfold.getSelStmt());
			}
		}
		////system.out.println(constraints);
		if(isHistorical){
			mRes.addConstraint(toHistorical(arrangeResColumns(resColumns)));
		}else{
			mRes.addConstraint(arrangeResColumns(resColumns));
		}
		if(unfold.isDynamic()){
			mRes.addResColumn(tmpColumn);
			mRes.setSelStmt(tmpColumn);
			//constraints.addAll(mRes.getConstraints());
			return mRes;
		}
		resColumn = unfold.getResColumn();
		if(isHistorical){
			for(String stream : streamSet ){
				if(resColumn.toLowerCase().contains(stream.toLowerCase().replace("_stream", ""))){					
					resColumn =  resColumn.replace(".", "_stream.");
				}
			}
		}
		//constraints.addAll(mRes.getConstraints());
		mRes.setSelStmt(selColumn);
		mRes.addResColumn(resColumn);
		mRes.setTarget(unfold.getTargetColumn());
		//system.out.println("----------------- "+ sVar + "--------------");
		//system.out.println("resColumns: " + mRes.getResColumn());
		//system.out.println("source: " + mRes.getSource());
		//system.out.println("target: " + mRes.getTarget());
		//system.out.println("triple: " + mRes.getResTriple());
		//system.out.println("constraints: " + mRes.getConstraints());
		//system.out.println("select: " + mRes.getSelStmt());
		return mRes;
	}
	
	public MappingResult findMappingColumns(StarqlVar sVar, Triple trple) {
		MappingResult mRes = new MappingResult();
		Unfolding unfold = new Unfolding();
		Set<String> resColumns = new HashSet<String>();
		String resColumn = "", selColumn = "", tmpColumn = "";
		
			unfold = unf.unfold(sVar, trple);			
			tmpColumn = unfold.getResColumn();	//where clause with higher priority			
			resColumn = unfold.getResColumn();
			selColumn = unfold.getSelStmt();
			resColumns.add(unfold.getResColumn());		
			mRes.addConstraint(unfold.getWhereConstraints());
			mRes.setSource(trple.toStringSQL());
			mRes.addResTriple(trple);
			mRes.addResColumn(resColumn);			
		
		////system.out.println(constraints);
		if(isHistorical){
			mRes.addConstraint(toHistorical(arrangeResColumns(resColumns)));
		}else{
			mRes.addConstraint(arrangeResColumns(resColumns));
		}
		if(unfold.isDynamic()){
			mRes.addResColumn(tmpColumn);
			mRes.setSelStmt(tmpColumn);
			constraints.addAll(mRes.getConstraints());
			return mRes;
		}
		resColumn = unfold.getResColumn();
		if(isHistorical){
			for(String stream : streamSet ){
				if(resColumn.toLowerCase().contains(stream.toLowerCase().replace("_stream", ""))){					
					resColumn =  resColumn.replace(".", "_stream.");
				}
			}
		}
		//constraints.addAll(mRes.getConstraints());
		mRes.setSelStmt(selColumn);
		mRes.addResColumn(resColumn);
		mRes.setTarget(unfold.getTargetColumn());
		for(String source : mRes.getResColumn()){
			if(source != "a_static" && source != "t_static" )
				mRes.setIsStatic(false);
		}
		return mRes;
	}*/

	private Set<String> toHistorical(Set<String> constraints){
		Set<String> tempConstraints = new HashSet<String>();
		for(String constr : constraints){
			tempConstraints.add(constr.replace(".","_stream."));                     
		}
		return tempConstraints;
	}
	
	/*private String constructWhere(Stream strm){	
		if(strm.getWhere().getTriple().size() == 0)
			return "";
		String str = "";
		String selStr = "";
		Set<StarqlVar> varSet = new HashSet<StarqlVar>();
		Set<MappingResult> mapRes = new HashSet<MappingResult>();
		MappingResult mRes = new MappingResult();
		Set<String> where_constraints = new HashSet<String>();
		Set<String> where_sources = new HashSet<String>();
		int triple_cnt = 0;
		for(Triple trple : strm.getWhere().getTriple()){
			where_constraints.clear();
			mapRes.clear();
			varSet.clear();
			selStr = "";
			varSet.addAll(trple.getUnboundValues());			
			str += genTableStr + strm.getName() + "_where"+triple_cnt+" AS WCACHE \r\n";
			int var_cnt = 1;
			for(StarqlVar var : varSet) {				
				mRes = findMappingColumns_where(var, trple);
				where_constraints.addAll(mRes.getConstraints());
				where_sources.add(mRes.getResColumn().toArray()[0].toString().substring(0, mRes.getResColumn().toArray()[0].toString().indexOf(".")));
				mapRes.add(mRes);
				selStr += mRes.getResColumn();
				selStr += " AS "+ var.toStringSQL() + "_where"+triple_cnt;
				if(var_cnt < varSet.size())
					selStr += ", ";
				var_cnt++;
			}
			if(!mRes.getmType().equals(MappingType.STATIC)){		
				str += "SELECT wid as wid"+triple_cnt+", abox as abox"+triple_cnt+", ";
				numWid = triple_cnt;
			}else{
				str += "SELECT ";
			}
			str += selStr;
			str += "\r\nFROM ";
			where_sources.remove("a_static");
			where_sources.remove("a_temporal");
			where_sources.remove("t_static");
			for(String m : where_sources){
					str += m;
			}
			if(!where_sources.isEmpty()){
				str += addExternal(strm);
			}else{
				str += addExternal(strm).substring(2);
			}
			str += "\r\nWHERE ";
			str += addConstraints(where_constraints, true);
			str += ";\r\n\r\n";
			triple_cnt++;
		}
		return str;
	}
	
	private String constructWhereJoin(Stream strm){
		String str = "";		
		if(strm.getWhere().getTriple().size() == 0)
			return "";
		Map<String,String> selectMap = new HashMap<String,String>();
		Map<String,Set<Integer>> varMap = new HashMap<String,Set<Integer>>();
		int triple_cnt = 0;
		for(Triple trple : strm.getWhere().getTriple()){
			for(StarqlVar sVar : trple.getUnboundValues()){
				selectMap.put(sVar.toStringSQL(), sVar.toStringSQL()+"_where"+triple_cnt+" AS "+sVar.toStringSQL()+"_where");
				varMap = HelperFunctions.mapToSet(varMap, sVar.toStringSQL(), triple_cnt);
			}
			triple_cnt++;
		}	
		str += genTableStr + strm.getName() + "_where_join AS WCACHE \r\n";
		if(numWid != null){
			str += "SELECT wid"+numWid+" as wid, abox0 as abox";	
		}else{
			str += "SELECT ";
		}
		Iterator it_sel = selectMap.entrySet().iterator();
		while (it_sel.hasNext()) {
	        Map.Entry pair = (Map.Entry)it_sel.next();
	        if(numWid != null)
	        	str += ", "; 
	        str += pair.getValue();
	        it_sel.remove(); // avoids a ConcurrentModificationException
	    }
	    str += "\r\nFROM ";
	    triple_cnt = 0;
	    //if(strm.getWhere().getTriple().size() > 1)
	    //	str += "(WCACHE SELECT * FROM";
	    for(Triple trple : strm.getWhere().getTriple()){
	    	str += strm.getName() + "_where"+triple_cnt;
	    	triple_cnt++;
	    	if(triple_cnt < strm.getWhere().getTriple().size())
	    		str += ", ";
	    }
	    if(strm.getWhere().getTriple().size() > 1)
	    	str += "\r\nWHERE ";
	    triple_cnt = 0;
	    for(Triple trple : strm.getWhere().getTriple()){	    	
	    	if(triple_cnt < strm.getWhere().getTriple().size() - 1)
	    		str += "wid"+triple_cnt+" = wid"+(triple_cnt+1)+" AND abox"+triple_cnt+" = abox"+(triple_cnt+1);
	    	triple_cnt++;
	    }
	    Iterator it_var = varMap.entrySet().iterator();
		while (it_var.hasNext()) {
	        Map.Entry pair = (Map.Entry)it_var.next();
	        if(((Set<Integer>)pair.getValue()).size() > 1){
	        	int last_num = 99999;
	        	for(Integer where_num : ((Set<Integer>)pair.getValue())){
	        		if( last_num != 99999 )
	        			str += " AND " + pair.getKey() + "_where" + last_num + " = " + pair.getKey() + "_where" + where_num;
	        		last_num = where_num;
	        	}	
	        }
	        it_var.remove(); // avoids a ConcurrentModificationException
	    }
	    str += ";\r\n";
		return str;
	}*/

	private String constructHaving(Stream strm) {
		Set<String> tmpSet = new HashSet<String>();
		HavingTreeWalker hWalker = new HavingTreeWalker(strm, unf, this);
		//if(streamSet.toArray()[0].toString().contains("_strminfo"))
		//	now = "timestamp";
		String str = genTableStr + strm.getName() + "_having AS WCACHE \r\n";	
		ArrayList<StarqlVar> sVars = new ArrayList<StarqlVar>(strm.getVars());
		Set<Triple> trples = new HashSet<Triple>();
		if(strm.getWhere() != null)
			for(IndexedTriple iTriple: strm.getWhere().getiTriples()){
				trples.addAll(iTriple.getTriple());
			}
		str += "SELECT DISTINCT "+ "wid";
		//for(StarqlVar sVar : sVars){
		//	findMappingColumns(sVar, strm); // receive constraints from variables not returned.
		//}
		for (StarqlVar sVar : strm.getReturns().getUnboundValues()) {
			if(sVar.hasAgg()){
				for(String var :sVar.getVarAgg().getColumns())
					tmpSet.add(var);
			}else{
				tmpSet.add(sVar.toStringSQL());
			}
		}
		str += HelperFunctions.getSetAsString(tmpSet, false, ", ");
		str += "\r\n" + "FROM\r\n (\r\n";
		Set <String> strSet = new HashSet<String>();
		String fromStr = "";
		for(Triple trple : trples){
			strSet.add("(\r\n" + unf.unfoldDirect(trple, false).replaceAll("(?m)^", "\t") + ") SUB_TRIPLE");
		}
		if(!strSet.isEmpty())
			fromStr += "(\r\n " + HelperFunctions.getSetAsString(strSet, true, "\r\nNATURAL JOIN\r\n").replaceAll("(?m)^", "\t") + "\r\n) SUB_WHERE";// + " AS "+trple.toStringSQL();
		//str += HelperFunctions.getSetAsString(toSubquery(trples), true, " NATURAL JOIN\r\n");// + " AS "+trple.toStringSQL();
		if(!trples.isEmpty() && (hWalker.getString() != null)){
			fromStr += "\r\nNATURAL JOIN\r\n";
		}
		if(hWalker.getString() != null){
			fromStr += " ("+hWalker.getString() + "\r\n) SUB_HAVING";
		}
		str += fromStr.replaceAll("(?m)^", "\t");
		str += "\r\n) SUB_FROM;\r\n";
		
		return str;
	}
	
	
	
	/*private Set<String> toSubquery(Set<Triple> triples) {
		Set<String> subs = new HashSet<String>();
		String tString = "";
		Unfolding unfold = new Unfolding();
		Set<String> localConstraints = new HashSet<String>();
		Set<String> localSource = new HashSet<String>();
		for(Triple trple : triples){	
			tString += "(SELECT ";
			if(!checkStatic(trple))
				tString += "wid, timestamp, ";
			Set<String> tmpSet = new HashSet<String>();
			for(StarqlVar sVar : trple.getUnboundValues()){
				unfold = unf.unfold(sVar, trple);
					if(unfold.isDynamic()){
						tmpSet.add(unfold.getResColumn() + " AS "+sVar.toStringSQL());					
						localSource.add(unfold.getTable());
					}else{			
						tmpSet.add(HelperFunctions.toVarColumn(unfold.getSelStmt(), trple.toStringSQL())  + " as "+sVar.toStringSQL());																
						localSource.add(unfold.getResColumn() + " AS " + trple.toStringSQL());
					}
					localConstraints.addAll(unfold.getWhereConstraints());	
			}
			tString += HelperFunctions.getSetAsString(tmpSet, true, ", ");
			tString += " FROM "+ HelperFunctions.getSetAsString(localSource,true,", ");
			if(!localConstraints.isEmpty()){
				tString += " WHERE "+ HelperFunctions.getSetAsString(localConstraints,true," AND ");
			}
			tString	+=") as "+trple.toStringSQL();
			localSource.clear();
			localConstraints.clear();
			subs.add(tString);
			tString = "";
		}
		return subs;
	}*/

	/*private boolean checkStatic(Triple trple) {
		Unfolding unfold = new Unfolding();
		for(StarqlVar sVar : trple.getUnboundValues()){
			unfold = unf.unfold(sVar, trple);
			if(unfold.isStatic())
				return true;
		}
		return false;
	}*/

	private String addExternal(Stream strm) {
		String str = "";
		if (strm.getResList() != null)
			for (Resource res : strm.getResList().getRes()) {		
				str += ", ";
				str += res.getResourceIri()
						.substring(res.getResourceIri().lastIndexOf("/") + 1)
						.replaceAll("<", "").replaceAll(">", "")
						+ " as ";
				if (res.getResourceType().equals("STATIC ABOX"))
					str += "a_static";
				if (res.getResourceType().equals("TEMPORAL ABOX"))
					str += "a_temporal";
				if (res.getResourceType().equals("TBOX"))
					str += "t_static";			
			}
		return str;
	}

	private String buildSelectOut(Stream strm) {
		String str = "";
		boolean firstTriple = true;
		for (Triple triple : strm.getReturns().getTriple()) {			
			outNum++;
			if(strm.getReturns().getTriple().size() > 1){
				str += genTableStr + strm.getName() + "_starqlout_"+outNum+" AS WCACHE\r\n";
			}else{
				str += genTableStr + strm.getName() + "_starqlout AS WCACHE\r\n";
			}
			str += "SELECT DISTINCT ";
			if (strm.getReturns().getTime().toString().toLowerCase()
					.contains("now")) {
				str += "timestamp";
			} else {
				str += "'"+strm.getReturns().getTime().toString()+"'";
			}
			str += " AS timestamp, ";
			if (triple.getSubject().toString().contains("?")) {
				str += triple.getSubject().toStringSQL() + " AS Subject, ";
			} else {
				str += "'" + triple.getSubject() + "' AS Subject, ";
			}
			str += "'" + triple.getPredicate() + "' AS Predicate, ";
			if(!triple.hasAgg()){	
				if (triple.getObject().toString().contains("?")) {
					str += triple.getObject().toStringSQL() + " AS Object ";
				} else {
					str += "'" + triple.getObject() + "' AS Object ";
				}			
			}else{				
				str += triple.getAgg().getName() + " AS Object ";				
			}
			str += " FROM " + strm.getName() + "_tJoin;\r\n\r\n";
		}
		return str;
	}

	private String buildAggStream(Triple triple, Stream strm){
		String str = "";
		String grpVar = "";
		String wid = "wid";
		if(triple.getSubject().getsType() == StarqlVarType.VALUE){
			grpVar += triple.getSubject().toStringSQL() +", ";
		}
		Set<IndexedTriple> trples = new HashSet<IndexedTriple>();
		Set<Triple> varTriples = new HashSet<Triple>();
		Set<String> setString = new HashSet<String>();
		str += genTableStr + strm.getName()+triple.getAgg().getName()+" AS WCACHE\r\n";
		str += "SELECT "+wid+", "+grpVar+triple.getAgg().getAggType()+"("+triple.getAgg().getColumns().toString().substring(1, triple.getAgg().getColumns().toString().length()-1)+") as "+triple.getAgg().getName()+"\r\nFROM\r\n";
		
		trples.add(strm.getWhere());
		if (strm.getHvg() != null)	
			trples.addAll(strm.getHvg().getLowerIndTriples(false));
		for(String var : triple.getAgg().getColumns()){
			StarqlVar sVar = new StarqlVar(StarqlVarType.VALUE, var.substring(1));
			for(IndexedTriple iTriple : trples)
				varTriples.addAll(iTriple.getVarTriple(sVar));
		}
		for(Triple trple : varTriples){
			setString.add("   (\r\n" + unf.unfoldDirect(trple, true).replaceAll("(?m)^", "\t") + "   ) SUB_TRIPLE");
		}
		str += "(\r\n " + HelperFunctions.getSetAsString(setString, true, "\r\nNATURAL JOIN\r\n") + "\r\n) SUB_FROM";
		str += "\r\n GROUP BY wid";
		if(!grpVar.isEmpty())
			str += ", "+triple.getSubject().toStringSQL();
		str +=";\r\n";
		return str;
	}
	
	/*private String buildAggStream(Triple triple, Stream strm, boolean multi){
		String str = "";
		String grpVar = "";
		String wid = "wid";
		if(triple.getSubject().getsType() == StarqlVarType.VALUE){
			grpVar += triple.getSubject().toStringSQL() +", ";
		}
		str += genTableStr + strm.getName()+triple.getAgg().getName()+" AS\r\n";
		str += "SELECT "+wid+", "+grpVar+triple.getAgg().getAggType()+"("+triple.getAgg().getColumns().toString().substring(1, triple.getAgg().getColumns().toString().length()-1)+") as "+triple.getAgg().getName()+"\r\nFROM ";
		if(multi){
			str += strm.getName() + triple.getAgg().getName() + "_join";
		}else{
			str += strm.getName() + "_having";
		}
		str += "\r\nGROUP BY wid";
		if(!grpVar.isEmpty())
			str += ", "+triple.getSubject().toStringSQL();
		str += ";\r\n";
		
		return str;
	}*/
	
	private String buildAggregators(Stream strm){
		String str = "";
		boolean multi = false;
		for (Triple triple : strm.getReturns().getTriple()) {
			if(triple.hasAgg()){
				aggSet.add(triple);
				str += buildAggStream(triple, strm) + "\r\n";
				multi = false;
			}
		}
		return str;
	}
	
	private String buildUnionOut(Stream strm){
		Integer i = 0;
		String str = genTableStr + strm.getName() + "_starqlout"+" AS WCACHE\r\n";
		str += "select * from (mergeunion '";
		while (i < outNum){
			i++;
			str += strm.getName() + "_starqlout_"+i;			
			if(i < outNum)
				str += ",";
		}
		str += 	"' cols:timestamp);\r\n";
		return str;
	}
	
	private String constructOut(Stream strm) {
		String str = "";
		str += buildSelectOut(strm) + "\r\n";
		if(strm.getReturns().getTriple().size() > 1){
			str += buildUnionOut(strm) + "\r\n";
		}
		return str;
	}

	private String addStaticDB() {
		String stat = "";
		stat += "CREATE TEMP TABLE IF NOT EXISTS Astatic (domain VARCHAR(32), range VARCHAR(32));\r\n";
		stat += "INSERT INTO Astatic (domain, range) VALUES('TC255', 'TempSensor');\r\n";
		stat += "INSERT INTO Astatic (domain, range) VALUES('TC260', 'TempSensor');\r\n\r\n";
		stat += "CREATE TEMP TABLE Tbox (domain VARCHAR(32), range VARCHAR(32));\r\n";
		stat += "INSERT INTO Tbox (domain, range) VALUES('TempSensor', 'MainSensor');\r\n\r\n";
		return stat;
	}

	/*private void addWhereConstraints(Stream strm) {
		Unfolding unfold = new Unfolding();
		for (StarqlVar sVar : strm.getWhere().getUnboundValues()) {
			for (Triple trple : strm.getWhere().getVarTriple(sVar)) {
				unfold = unf.unfold(sVar, trple);				
				constraints.addAll(unfold.getWhereConstraints());		
			}
		}
	}*/

	private String joinStreamInfo(Stream stream) {
		String str = "";
		Boolean first = true;		
		
		for (Window win : stream.getFrom().getList()) {
			if (streamSet.contains(win.getName())) {
				str += "\r\n"+genTableStr + win.getName()
						+ "_starqlout_w AS WCACHE\r\n";	
				str += "select * from \r\n(ordered timeslidingwindow timecolumn:0"
						+ " timewindow:" + win.getTimewindow() + " frequency:" + win.getSlide()
						+ " " + "granularity:1"
						+ " equivalence:floor select * from ("+win.getName()+"_starqlout));\r\n";
			}
		}
		
		for (Window win : stream.getFrom().getList()) {
			if (streamSet.contains(win.getName())) {
				if (!first) {
					str += "\r\nUNION\r\n";
				} else {
					str += "\r\n"+genTableStr + stream.getName()
							+ "_strminfo AS WCACHE\r\n";				
				}
				str += "SELECT * FROM " + win.getName() + "_starqlout_w";
				first = false;
				streamSet2.add(stream.getName()+"_strminfo");
			}			
		}		
		if(first == false)
			str += ";\r\n";
		return str;
	}

	private String joinedStream(Stream strm) {
		String str = "";
		String hist = "";
		str += joinStreamInfo(strm);
		Map<String, Set<String>> joinSet = new HashMap<String, Set<String>>();
		Set<String> newVal = new HashSet<String>();
		for (Window win : strm.getFrom().getList()) { //All streamwindows used in the current stream
			if(streamSet.contains(win.getName()))
				continue; //if stream is generated by starql -> skip
			if(!win.getName().contains("_")){
				if(isHistorical)
					hist = "_stream";
				streamSet2.add(win.getName()+hist);
				continue;
			}
			String key = win.getName().substring(0,
					win.getName().lastIndexOf("_"));
			if (joinSet.containsKey(key)) {
				newVal = joinSet.get(key);
				newVal.add(win.getName().substring(
						win.getName().lastIndexOf("_")));
			} else {
				newVal.add(win.getName().substring(
						win.getName().lastIndexOf("_")));
			}
			joinSet.put(key, new HashSet<String>(newVal)); //Map with key: streamname and value: occuring indizes
			newVal.clear();
		}
		
		streamSet.clear();
		streamSet.addAll(joinSet.keySet());
		streamSet.addAll(streamSet2);
		if(!joinSet.isEmpty()){	
			Iterator it = joinSet.entrySet().iterator();
			while (it.hasNext()) {				
				Map.Entry mapEntry = (Map.Entry) it.next();				
				str += "\r\n"+genTableStr + mapEntry.getKey() + " AS WCACHE  \r\n";
				str += "SELECT * FROM\r\n ";
				boolean first2 = true;
				for (String val : (Set<String>) mapEntry.getValue()) {
					if(((Set<String>) mapEntry.getValue()).size() == 1){
						str += mapEntry.getKey() + val;
					}else{
						if (first2) {
							str += "(mergeunion '"+mapEntry.getKey() + val;
						}else{
							str += ", "+mapEntry.getKey() + val;
						}
						first2 = false;
					}
				}
				if(((Set<String>) mapEntry.getValue()).size() > 1)
					str += 	"' cols:timestamp)";
				str += ";\r\n";
				it.remove(); // avoids a ConcurrentModificationException
			}			
		}	
		//str += nowVal(strm, hasNative);
		return str;
	}

	private String nowVal(Stream strm, Boolean hasNative) {
		String nowStream = "";
		nowStream += genTableStr + strm.getName() + "_joined_pulse AS WCACHE \r\n";
		nowStream += "select * from \r\n";
		nowStream += " (select * from pulse)";
		if(hasNative){
			nowStream += "\r\nNATURAL JOIN\r\n";
			nowStream += "(select * from " + strm.getName() + "_joined ); \r\n";
		}else{
			nowStream += ";\r\n";
		}
		return nowStream;
	}

	private String addTime(){
		String str = "";
		str += genTableStr + streamSet.toArray()[0] + "_time AS WCACHE \r\n";
		str += "select wid, max(timestamp) as timestamp\r\n";
		str	+= "from "+streamSet.toArray()[0]+"\r\n";
		str	+= "group by wid;\r\n";
		return str;
	}
	
	private String addTimeJoin(Stream strm){
		String str = "";
		Integer i = 0;
		Set<String> sources = new HashSet<String>();
		Set<String> constraints = new HashSet<String>();
		sources.add(streamSet.toArray()[0]+"_time");
		for(Triple agg : aggSet){
			sources.add(strm.getName()+agg.getAgg().getName());
		}
		aggSet.clear();
		str += genTableStr +strm.getName()+"_tJoin AS WCACHE\r\n"
					+"SELECT DISTINCT * \r\nFROM "
				    +strm.getName()+"_having";
		for(String src : sources){
			str += " NATURAL JOIN "+src;
		}
		str += addConstraints(constraints, false);
		str += ";\r\n";	
		return str;
	}
	
	private String addIndex(){
		String str = "CREATE INDEX  measurements_stream_index ON measurements_stream(timestamp,wid, abox);\r\n";
		return str;
	}
	
	private String constructWhereHaving(Stream strm) {
		String str = "";		
		str += genTableStr + strm.getName() + "_wherehaving AS WCACHE \r\n";
		str += "SELECT wid_hvg, now";
		for(StarqlVar sVar : strm.getReturns().getUnboundValues()){
			str += ", "+sVar.toStringSQL();
		}
		if(strm.getWhere().getTriple().size() == 0) {
			str += "\r\nFROM "+strm.getName() + "_having";
		}else{
			str += "\r\nFROM " + strm.getName() + "_having, "+strm.getName() + "_where_join";
			if(numWid != null){
				str += "\r\nWHERE wid_hvg = wid AND abox_hvg = abox";
			}else{
				str += "\r\nWHERE ";
			}
			for(StarqlVar sVar : strm.getReturns().getUnboundValues()){
				if(numWid != null)
					str += " AND ";
				str += sVar.toStringSQL()+" = "+sVar.toStringSQL()+"_where";
			}
		}
		str += ";\r\n";
		return str;
	}
	
	private String transformToADP() {
		String adp = "";
		String lastName = "";
		adp += addStaticDB();
		if(qinfo.getPulse().getStart() != null || qinfo.getPulse().getEnd() != null){
			isHistorical = true;
			genTableStr = "CREATE TEMP TABLE ";
		}
		unf.setIsHistorical(isHistorical);
		for (Stream strm : qinfo.getStreamList()) {
			if(!strm.isSafe())
			{
				adp += "The Variables in stream "+strm.getName()+" are not safe, please reformulate.\r\n";
				adp += TreeFunctions.printHavingTreeSimple(strm.getHvg(), 1);
				break;
			}
			unf.setName(strm.getName());
			adp += constructView(strm) + "\r\n";
			if(isHistorical)
				adp += addIndex();
			adp += joinedStream(strm) + "\r\n";
			adp += addTime()+ "\r\n";
			adp += constructHaving(strm) + "\r\n";
			adp += buildAggregators(strm) + "\r\n";
			adp += addTimeJoin(strm) + "\r\n";
			adp += constructOut(strm);
			lastName = strm.getName();
			constraints.clear();
			streamSet2.clear();
		}
		
		adp += "SELECT * FROM "+lastName+"_starqlout;";
		return adp;
	}

}
