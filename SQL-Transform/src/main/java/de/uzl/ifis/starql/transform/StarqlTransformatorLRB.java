/**
streamqueryinfo * StarQL Transformation
 *
 * @author Max Berndt
 */

package de.uzl.ifis.starql.transform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import de.uzl.ifis.starql.parser.*;
import de.uzl.ifis.starql.query.*;
import de.uzl.ifis.starql.query.QueryHead.HeadType;
import de.uzl.ifis.starql.query.base.*;
import de.uzl.ifis.starql.query.having.HvgTreeElem;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
import de.uzl.ifis.starql.query.having.TreeFunctions;
import it.unibz.krdb.sql.DBMetadata;
import it.unibz.krdb.sql.DBMetadataExtractor;
import it.unibz.krdb.sql.DatabaseRelationDefinition;
import it.unibz.krdb.sql.QuotedIDFactory;
import net.sf.jsqlparser.JSQLParserException;

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

public class StarqlTransformatorLRB extends StarqlTransformator implements StarqlTransformatorInterface{
	
	private String genTableStr = "CREATE TEMP VIEW ";
	private String adp = "";
	private String havingViewName = "";
	
//	private DBMetadata dbData = new DBMetadata();
	
	private static String DATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss'+00:00'";
	private DateFormat df = new SimpleDateFormat(DATEFORMAT);
	private PostgresData pgData = null;
	
	private static DatabaseRelationDefinition defTollTable(DBMetadata md, String name){
		QuotedIDFactory idfac = md.getQuotedIDFactory();
		DatabaseRelationDefinition tableDefinition = md.createDatabaseRelation(idfac.createRelationID(null, name));
		tableDefinition.addAttribute(idfac.createAttributeID("wid"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("abox"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("VID"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Time"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("AvgSpd"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Toll"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("XWay"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Dir"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Seg"), java.sql.Types.NUMERIC, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Day"), java.sql.Types.NUMERIC, "integer", false);
		return tableDefinition;
	}
	
	private static DatabaseRelationDefinition defCarTable(DBMetadata md, String name){
		QuotedIDFactory idfac = md.getQuotedIDFactory();
		DatabaseRelationDefinition tableDefinition = md.createDatabaseRelation(idfac.createRelationID(null, name));
		tableDefinition.addAttribute(idfac.createAttributeID("VID"), java.sql.Types.INTEGER, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Cartype"), java.sql.Types.INTEGER, "integer", false);
		return tableDefinition;
	}
	
	private static DatabaseRelationDefinition defFeatureTable(DBMetadata md, String name){
		QuotedIDFactory idfac = md.getQuotedIDFactory();
		DatabaseRelationDefinition tableDefinition = md.createDatabaseRelation(idfac.createRelationID(null, name));
		tableDefinition.addAttribute(idfac.createAttributeID("Cartype"), java.sql.Types.INTEGER, "integer", false);
		tableDefinition.addAttribute(idfac.createAttributeID("Subfeature"), java.sql.Types.NUMERIC, "integer", false);
		return tableDefinition;
	}
	
	static DBMetadata getMeta(){
		DBMetadata dbMetadata = DBMetadataExtractor.createDummyMetadata("org.h2.Driver");
		defTollTable(dbMetadata, "TollStr");
		defCarTable(dbMetadata, "Car");
		defFeatureTable(dbMetadata, "Type2Feature");
		return dbMetadata;
	}
	
	public StarqlTransformatorLRB(String starql, Unfolder unf) {
		setStarql(starql);
		setUnf(unf);
		try {
			setQinfo(getQueryInfo(starql));
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		if(isHistorical()){
			genTableStr = "CREATE TEMP VIEW ";
		}
		this.adp = transform();
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
		//system.out.println(qinfo.getPulse().toString());
		return qinfo;
	}
	
	public String getResultQuery() {
		return this.adp;
	}
	
	public int getStart(String name){
		if(getQinfo() == null)
			System.out.println("null");
		if(getQinfo().getPulse(name) == null)
			System.out.println("null" + name);
		return  getQinfo().getPulse(name).getStartInteger();
	}
	
	public int getEnd(String name){
		return  getQinfo().getPulse(name).getEndInteger();
	}
	
	/* 
	 * Import stream from sql server
	 */
	private String buildViewString(Stream strm, String name, int range, int frequency,
			int granularity, int column) {
		String viewString = genTableStr+name;
		if(isHistorical())
			viewString += "_stream AS ";
		else
			viewString += " AS WCACHE ";
		viewString += "SELECT * FROM \r\n(newtimeslidingwindow timecolumn:"
				+ column + " timewindow:" + range + " frequency:" + frequency
				+ " " + "granularity:" + granularity
				//+ " equivalence:floor SELECT cast(strftime('%s', timestamp) as float) as epoch, * FROM " + generateStreamData(strm, name) + ");\r\n";
				+ " equivalence:floor SELECT * FROM " + generateStreamData(strm, name) + ");\r\n";
		return viewString;
	}
	/*getQinfo().getFrom()
	 * Include static table from sql server
	 */
	private String buildStaticViewString(Stream strm, String name) {
		String viewString = genTableStr + name;
		viewString += " AS ";
		viewString += "SELECT * FROM " + generateStreamData(strm, name) + ";\r\n";
		return viewString;
	}

	public String constructView(Stream strm) {
		ArrayList<Window> lst = strm.getFrom().getList();
		String strmName = strm.getFrom().getList().get(0).getName();
		// For non-window queries
		String view = "";
		//String view = genTableStr + strmName +"_stream AS SELECT Time AS wid, 0 AS abox, * FROM " + strmName + ";";
		Set<Window> baseStreams = new HashSet<Window>();
		
		//if(getQinfo().getPulse() != null){
		//	view = buildViewString("pulse", 0, 1, getQinfo().getPulse().getFreq(), 0);			
		//}
		for (Stream stream : getQinfo().getStreamList()) {
				streamSet.add(stream.getName());
		}
		if(strm.getResList() != null && pgData != null)
			for(Resource res : strm.getResList().getRes()){
				if(res.getResourceType().equals("STATIC ABOX")){
					view += buildStaticViewString(strm, res.getResourceIri().substring(res.getResourceIri().lastIndexOf("/") + 1, res.getResourceIri().length() - 1));
				}
			}
		
		for (Window win : strm.getFrom().getList()) {
			if(!streamSet.contains(win.getName()))
				view += buildViewString(strm, win.getName(), win.getTimewindow(),win.getSlide().getInt(), 1, 1);
		}
	
		return view ;
	}

	private String generateStreamData(Stream strm, String name) {
		String view = "";
		view += " (";
		if(!isHistorical()){
			if(pgData == null){
					view += "streamdata '"+getParam().getStreamPath() + name
					+ ".csv' ";
					if(getParam().getStream(name) != null){
						if(getParam().getStream(name).getRatio() > 1)
							view += "ratio:"+getParam().getStream(name).getRatio()+ " ";
						if(getParam().getStream(name).getOutputSame() == true)
							view += "output:same ";
						if(getParam().getStream(name).getStartTimestamp() != "now")
							view += "starttimestamp:"+ getParam().getStream(name).getStartTimestamp() +" ";
					}
			}else{
					if(getParam().getStream(name) != null){
						view += "newstreamdata ";
						if(getParam().getStream(name).getRatio() > 1)
							view += "ratio:"+getParam().getStream(name).getRatio()+ " ";
						if(getParam().getStream(name).getOutputSame() == true)
							view += "output:same ";
						if(getParam().getStream(name).getStartTimestamp() != "now" && getParam().getStream(name).getStartTimestamp() != "")
							view += "starttimestamp:"+ getParam().getStream(name).getStartTimestamp() +" ";
						//view += "select cast(strftime('%s', timestamp) as int) as epoch, * "
						view += "select cast(strftime('%s', timestamp) as int) as epoch, * "
								+ "\r\nfrom ";
						view += "(postgres h:"+pgData.getIp()+" port:"+pgData.getPort()+" u:"+pgData.getUsr()+" p:"+pgData.getPw()+" db:"+pgData.getDb()+" select * "
								+ "\r\nfrom "+name+" order by \"Timestamp\" LIMIT 1500)";
					}else{
						view += "postgres h:"+pgData.getIp()+" port:"+pgData.getPort()+" u:"+pgData.getUsr()+" p:"+pgData.getPw()+" db:"+pgData.getDb()+" select * "
								+ "\r\nfrom "+name;	
					}
			}
		}else {
			Boolean time = false;
			for(Window win : strm.getFrom().getList())
				if(win.getName().equals(name))
					time = true;
			if(pgData == null){
				view += "SELECT *"
						+ "\r\nFROM "+name;
				if(getQinfo().getPulse(strm.getPulse()).getStart() != null && time){
					view += " WHERE timestamp >= '" + df.format(getQinfo().getPulse(strm.getPulse()).getStart())+"'";
					if(getQinfo().getPulse(strm.getPulse()).getEnd() != null)
						view += " AND ";
				}
				if(getQinfo().getPulse(strm.getPulse()).getEnd() != null && time){
					view += "timestamp <= '" + df.format(getQinfo().getPulse(strm.getPulse()).getEnd())+"'";
				}
			}else{
				view += "postgres h:"+pgData.getIp()+" port:"+pgData.getPort()+" u:"+pgData.getUsr()+" p:"+pgData.getPw()+" db:"+pgData.getDb()+" select * from "+name;
						if(getQinfo().getPulse(strm.getPulse()).getStart() != null && time){
							view += " WHERE timestamp >= '" + df.format(getQinfo().getPulse(strm.getPulse()).getStart())+"'";
							if(getQinfo().getPulse(strm.getPulse()).getEnd() != null)
								view += " AND ";
						}
						if(getQinfo().getPulse(strm.getPulse()).getEnd() != null && time){
							view += "timestamp <= '" + df.format(getQinfo().getPulse(strm.getPulse()).getEnd())+"'";
						}
				if(time)
					view +=		"order by timestamp";
			}
		}
		view += ")";
		return view;
	}


	private String addConstraints(Set<String> constraints, Boolean first){
		return addConstraints(constraints, first, "OR", "AND");
	}

	
	/*
	 * Evaluation of Having Clause
	 * @see de.uzl.ifis.starql.transform.StarqlTransformatorInterface#constructHaving(de.uzl.ifis.starql.query.Stream)
	 */
	public String constructHaving(Stream strm) {
		Set<String> tmpSet = new HashSet<String>();
		HavingTreeWalkerLRB hWalker = new HavingTreeWalkerLRB(strm, getUnf(), this);
		//if(streamSet.toArray()[0].toString().contains("_strminfo"))
		//	now = "timestamp";
		setHavingViewName(strm.getName() + "_having");
		String str = genTableStr + strm.getName() + "_having AS\r\n";	
		ArrayList<StarqlVar> sVars = new ArrayList<StarqlVar>(strm.getVars());
		Set<Triple> trples = new HashSet<Triple>();
		if(strm.getWhere() != null)
			for(IndexedTriple iTriple: strm.getWhere().getiTriples()){
				trples.addAll(iTriple.getTriple());
			}
		str += "SELECT wid";
		//for(StarqlVar sVar : sVars){
		//	findMappingColumns(sVar, strm); // receive constraints from variables not returned.
		//}
		if(strm.getReturn().gethType().equals(HeadType.CONSTRUCT))
			for (StarqlVar sVar : strm.getReturn().getiTriple().getUnboundValues()) {
				if(sVar.hasAgg()){
					for(String var :sVar.getVarAgg().getColumns())
						tmpSet.add(var);
				}else{
					tmpSet.add(sVar.toStringSQL());
				}
			}
		else
			for (Binding bVar : strm.getReturn().getVars()) {
				for(StarqlVar sVar : bVar.getAex().getVars())	
					if(sVar.hasAgg()){
						for(String var :sVar.getVarAgg().getColumns())
							tmpSet.add(var);
					}else{
						tmpSet.add(bVar.toString());
						break;
					}
			}
		str += HelperFunctions.getSetAsString(tmpSet, false, ", ");
		str += "\r\n" + "FROM\r\n ( SELECT * FROM\r\n";
		Set <String> strSet = new HashSet<String>();
		String fromStr = "";
		String subName = strm.getName() +"_sub";
		ontopStrm += hWalker.getOntopStrm();
		for(Triple trple : trples){
			strSet.add("(\r\n" + getUnf().unfoldDirect(trple, false, strm.getFrom().getList()).replaceAll("(?m)^", "\t") + ") SUB_TRIPLE");
		}
		if(!strSet.isEmpty())
			fromStr += "(\r\n " + HelperFunctions.getSetAsString(strSet, true, "\r\nNATURAL JOIN\r\n").replaceAll("(?m)^", "\t") + "\r\n) SUB_WHERE";// + " AS "+trple.toStringSQL();
		//str += HelperFunctions.getSetAsString(toSubquery(trples), true, " NATURAL JOIN\r\n");// + " AS "+trple.toStringSQL();
		if(!trples.isEmpty() && (hWalker.getString() != null)){
			fromStr += "\r\nNATURAL JOIN\r\n";
		}
		if(hWalker.getString() != null){
			Set<String> unbound = new HashSet<String>();
			for(StarqlVar var : strm.getHvg().getUnboundValues())
				unbound.add(var.toStringSQL());
			if(hWalker.getString().trim().startsWith("("))
				fromStr += " ( SELECT wid" + HelperFunctions.getSetAsString( unbound, false, ", " )+ " FROM "+hWalker.getString().replaceAll("(?m)^", "\t") + "\r\n) SUB_HAVING";
			else
				fromStr += " ("+hWalker.getString().replaceAll("(?m)^", "\t") + "\r\n) SUB_HAVING";
		}
		str += fromStr.replaceAll("(?m)^", "\t");
		str += "\r\n) SUB_FROM;\r\n";	
		return str;
	}
	

	/*
	 * Send one tiple to the output
	 */
	private String buildSelectOut(Stream strm) {
		String str = "";
//		if(strm.getReturn().gethType().equals(HeadType.CONSTRUCT))
//		for (Triple triple : strm.getReturn().getiTriple().getTriple()) {			
//			outNum++;
//			if(strm.getReturn().getiTriple().getTriple().size() > 1){
//				str += genTableStr + strm.getName() + "_starqlout_"+outNum+" AS WCACHE\r\n";
//			}else{
//				str += genTableStr + strm.getName() + "_starqlout AS WCACHE\r\n";
//			}
//			str += "SELECT DISTINCT ";
//			if (strm.getReturn().getiTriple().getTime().toString().toLowerCase()
//					.contains("now")) {
//				str += "timestamp";
//			} else {
//				str += "'"+strm.getReturn().getiTriple().getTime().toString()+"'";
//			}
//			str += " AS timestamp, ";
//			if (triple.getSubject().toString().contains("?")) {
//				str += triple.getSubject().toStringSQL() + " AS Subject, ";
//			} else {
//				str += "'" + triple.getSubject() + "' AS Subject, ";
//			}
//			str += "'" + triple.getPredicate() + "' AS Predicate, ";
//			if(!triple.hasAgg()){	
//				if (triple.getObject().toString().contains("?")) {
//					str += triple.getObject().toStringSQL() + " AS Object ";
//				} else {
//					str += "'" + triple.getObject() + "' AS Object ";
//				}			
//			}else{				
//				str += triple.getAgg().getName() + " AS Object ";				
//			}
//			str += " FROM " + strm.getName() + "_tJoin;\r\n\r\n";
//		}
//		else{	setSelect(true);	
//				Boolean aggQuery = false;
//				Set<StarqlVar> nonAggVars = new HashSet<StarqlVar>();
//				for(Binding bVar : strm.getReturn().getVars()) {
//					for(StarqlVar svar : bVar.getAex().getVars())
//						if(svar.hasAgg())
//							aggQuery = true;
//						else
//							nonAggVars.add(svar);
//				}
//				if(aggQuery)
//					if(strm.getGrpby() != null){
//						for(StarqlVar svar : nonAggVars)
//							if(!strm.getGrpby().getGrpVars().contains(svar)){
//								throw new RuntimeException("NON GROUPED SELECT VARIABLE: "+svar.toString());
//							}
//					}
//					else{
//						if(!nonAggVars.isEmpty()){
//							throw new RuntimeException("NON GROUPED SELECT VARIABLES: "+nonAggVars.toString());
//						}
//					}
//				str += genTableStr + strm.getName() + "_starqlout AS \r\n";
//				str += "SELECT DISTINCT ";
//				str += "timestamp";
//				str += " AS timestamp";
//				ArrayList<String> bindings = new ArrayList<String>();
//				for(Binding bVar : strm.getReturn().getVars()) {
//					String binding = bVar.toString();
//					for(StarqlVar sVar : bVar.getAex().getVars()){
//						if(sVar.hasAgg())
//							binding = binding.replace(sVar.getVarAgg().getAggType() + sVar.getVarAgg().getColumns().toString().replace("[", "(").replace("]", ")").toString(), sVar.getVarAgg().getName());							
//					}
//					bindings.add(binding);
//				}
//				str += HelperFunctions.getSetAsString(bindings, false, ", ");
//				str += " FROM " + strm.getName() + "_tJoin";
//				if(strm.getHvgAggregate() != null){
//					Set<StarqlVar> checkVars = new HashSet<StarqlVar>();
//					for(StarqlVar svar : strm.getHvgAggregate().getUnSafeVars().getVars()){
//						if(svar.hasAgg())
//							checkVars.addAll(svar.getVarAgg().getColumnsAsVar());
//						else
//							checkVars.add(svar);
//						for(StarqlVar var : checkVars)
//							if(!strm.getHvg().getSafeVars().getVars().contains(var) && !strm.getWhere().getSafeVars().getVars().contains(var)){
//								throw new RuntimeException("AGGREGATE VARIABLE: " + var.toString()+ " IS NOT SAFE!");
//							}
//					}
//					String aggString = strm.getHvgAggregate().toString();
//					for(StarqlVar sVar : strm.getHvgAggregate().getUnSafeVars().getVars())
//						if(sVar.hasAgg())
//							aggString = aggString.replace(sVar.getVarAgg().getAggType() + sVar.getVarAgg().getColumns().toString().replace("[", "(").replace("]", ")").toString(), sVar.getVarAgg().getName());
//					str += "\r\nWHERE " + aggString;
//				}
//				str += ";\r\n\r\n";
//		}
		return str;
	}
	/*
	 * Build single view for each aggregator calculation (triple var agg)
	 * 
	 */
	public String buildAggStream(Triple triple, Stream strm){
		String str = "";
		String grpVar = "";
		String wid = "wid";
		String ontopString = "";
		List<String> subStreams = new ArrayList<String>();
		if(triple.getSubject().getsType() == StarqlVarType.VALUE){
			grpVar += triple.getSubject().toStringSQL() +", ";
		}
		Set<IndexedTriple> trples = new HashSet<IndexedTriple>();
		Set<Triple> varTriples = new HashSet<Triple>();
		Set<String> setString = new HashSet<String>();
		str += genTableStr + strm.getName()+triple.getAgg().getName()+" AS WCACHE\r\n";
		str += "SELECT "+wid+", "+grpVar+triple.getAgg().getAggType()+"("+triple.getAgg().getColumns().toString().substring(1, triple.getAgg().getColumns().toString().length()-1)+") as "+triple.getAgg().getName()+"\r\nFROM " +strm.getName()+ "_having";
		
		
		/*trples.add(strm.getWhere());
		if (strm.getHvg() != null)	
			trples.addAll(strm.getHvg().getLowerIndTriples(false));
		for(String var : triple.getAgg().getColumns()){
			StarqlVar sVar = new StarqlVar(StarqlVarType.VALUE, var.substring(1));
			for(IndexedTriple iTriple : trples)
				varTriples.addAll(iTriple.getVarTriple(sVar));
		}
		for(Triple trple : varTriples){
			try {
				TreeBuilder treeBuilder = new TreeBuilder(getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t"), strm.getName()+ "_sub_ontop" + ontopStrm);
				subStreams.add(treeBuilder.getMadisStreamQuery());
			} catch (JSQLParserException e) {
				//system.out.println("Unable to rewrite: " + getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t"));
				throw new RuntimeException("UNABLE TO REWRITE ONTOP RESULT: " + getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t"));
			}
			setString.add("(" + "SELECT * FROM "+strm.getName()+"_sub_ontop" + ontopStrm++ + ") SUB_TRIPLE");
		}
		str += "(\r\n " + HelperFunctions.getSetAsString(setString, true, "\r\nNATURAL JOIN\r\n") + "\r\n) SUB_FROM";
		*/
		str += "\r\n GROUP BY wid";
		if(!grpVar.isEmpty())
			str += ", "+triple.getSubject().toStringSQL();
		str +=";\r\n";
		ontopString = HelperFunctions.getSetAsString(subStreams, true, "\r\n");
		return ontopString + str;
	}
	
	/*
	 * Build single view for each aggregator calculation (single var agg)
	 * @see de.uzl.ifis.starql.transform.StarqlTransformatorInterface#buildAggStream(de.uzl.ifis.starql.query.having.StarqlVar, de.uzl.ifis.starql.query.Stream)
	 */
	public String buildAggStream(StarqlVar var, Stream strm){
		String str = "";
		String wid = "wid";
		String grpstr = "";
		String ontopString = "";
		List<String> subStreams = new ArrayList<String>();
		Set<IndexedTriple> trples = new HashSet<IndexedTriple>();
		Set<Triple> varTriples = new HashSet<Triple>();
		Set<String> setString = new HashSet<String>();
		if(strm.getGrpby() != null)
			for(StarqlVar sVar : strm.getGrpby().getGrpVars())
				grpstr += ", "+sVar.toStringSQL();	
		str += genTableStr + strm.getName()+var.getVarAgg().getName()+" AS WCACHE\r\n";
		str += "SELECT "+wid+", "+var.getVarAgg().getAggType()+"("+var.getVarAgg().getColumns().toString().substring(1, var.getVarAgg().getColumns().toString().length()-1)+") as "+var.getVarAgg().getName() + grpstr + "\r\nFROM " +strm.getName()+ "_having";
		
		/*trples.add(strm.getWhere());
		if (strm.getHvg() != null)	
			trples.addAll(strm.getHvg().getLowerIndTriples(false));
		for(String cvar : var.getVarAgg().getColumns()){
			StarqlVar sVar = new StarqlVar(StarqlVarType.VALUE, cvar.substring(1));
			for(IndexedTriple iTriple : trples)
				varTriples.addAll(iTriple.getVarTriple(sVar));
		}
		for(Triple trple : varTriples){
			try {
				TreeBuilder treeBuilder = new TreeBuilder(getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t"), strm.getName()+ "_sub_ontop" + ontopStrm);
				subStreams.add(treeBuilder.getMadisStreamQuery());
			} catch (JSQLParserException e) {
				//system.out.println("Unable to rewrite: " + getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t"));
				throw new RuntimeException("UNABLE TO REWRITE ONTOP RESULT: " + getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t"));
			}
			setString.add("(" + "SELECT * FROM "+strm.getName()+"_sub_ontop" + ontopStrm++ + ") SUB_TRIPLE");
		}
		str += "(\r\n " + HelperFunctions.getSetAsString(setString, true, "\r\nNATURAL JOIN\r\n") + "\r\n) SUB_FROM";*/
		str += "\r\n GROUP BY wid";
		str += grpstr + ";\r\n";
		ontopString = HelperFunctions.getSetAsString(subStreams, true, "\r\n");
		return ontopString + str;
	}
	
	
	/*
	 * Merge several triples to the output
	 */
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
	/*
	 * Relation to Stream Operator
	 * @see de.uzl.ifis.starql.transform.StarqlTransformatorInterface#constructOut(de.uzl.ifis.starql.query.Stream)
	 */
	public String constructOut(Stream strm) {
		String str = "";
		str += buildSelectOut(strm) + "\r\n";
		if(strm.getReturn().getiTriple().getTriple().size() > 1){
			str += buildUnionOut(strm) + "\r\n";
		}
		return str;
	}

	private String addStaticExampleDB() {
		String stat = "";
		stat += "CREATE TEMP TABLE IF NOT EXISTS Astatic (domain VARCHAR(32), range VARCHAR(32));\r\n";
		stat += "INSERT INTO Astatic (domain, range) VALUES('TC255', 'TempSensor');\r\n";
		stat += "INSERT INTO Astatic (domain, range) VALUES('TC260', 'TempSensor');\r\n\r\n";
		stat += "CREATE TEMP TABLE IF NOT EXISTS Tbox (domain VARCHAR(32), range VARCHAR(32));\r\n";
		stat += "INSERT INTO Tbox (domain, range) VALUES('TempSensor', 'MainSensor');\r\n\r\n";
		return stat;
	}

	/*
	 * Joins all triple output of previous  starql streams
	 */
	public String joinStreamInfo(Stream stream) {
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
	
	/*
	 * Joins Streams with same prefix before '_'
	 */
	public String joinedStream(Stream strm) {
		String str = "";
//		str += joinStreamInfo(strm);
//		Map<String, Set<String>> joinSet = new HashMap<String, Set<String>>();
//		Set<String> newVal = new HashSet<String>();
//		for (Window win : strm.getFrom().getList()) { //All streamwindows used in the current stream
//			if(streamSet.contains(win.getName()))
//				continue; //if stream is generated by starql -> skip	
//			if(win.getName().contains("_")){
//				String key = win.getName().substring(0,
//						win.getName().indexOf("_"));
//				if(isHistorical())
//					HelperFunctions.mapToSet(joinSet, key, win.getName().substring(win.getName().indexOf("_")) + "_stream");
//				else
//					HelperFunctions.mapToSet(joinSet, key, win.getName().substring(win.getName().indexOf("_")));
//				newVal.clear();
//			}else{
//				if(isHistorical())
//					HelperFunctions.mapToSet(joinSet, win.getName(), win.getName()+"_stream");
//				else
//					HelperFunctions.mapToSet(joinSet, win.getName(), win.getName());
//			}
//		}
//		
//		streamSet.clear();
//		streamSet.addAll(joinSet.keySet());
//		streamSet.addAll(streamSet2);
//		if(!joinSet.isEmpty()){	
//			Iterator it = joinSet.entrySet().iterator();
//			while (it.hasNext()) {				
//				Map.Entry mapEntry = (Map.Entry) it.next();				
//				str += "\r\n"+genTableStr;
//				str += mapEntry.getKey() + " AS WCACHE  \r\n";
//				str += "SELECT * FROM\r\n ";
//				boolean first2 = true;
//				for (String val : (Set<String>) mapEntry.getValue()) {
//					if(((Set<String>) mapEntry.getValue()).size() == 1 &&  !mapEntry.getKey().toString().contains("_") ){
//						str += val;
//					}else{
//						if(((Set<String>) mapEntry.getValue()).size() == 1){
//							str += mapEntry.getKey() + val;
//						}
//						else{
//							if (first2) {
//								str += "(mergeunion '"+mapEntry.getKey() + val;
//							}else{
//								str += ", "+mapEntry.getKey() + val;
//							}
//							first2 = false;
//						}
//					}
//				}
//				if(((Set<String>) mapEntry.getValue()).size() > 1)
//					str += 	"' cols:wid)";
//				str += ";\r\n";
//				it.remove(); // avoids a ConcurrentModificationException
//			}			
//		}	
//		//str += nowVal(strm, hasNative);
		return str;
	}


	
	/*
	 * Calculates maxTime for each wid
	 */
	public String addTime(Stream strm){
		String str = "";
//		str += genTableStr + streamSet.toArray()[0] + "_time AS WCACHE \r\n";
//		str += "select wid, max(timestamp) as timestamp\r\n";
//		str	+= "from "+streamSet.toArray()[0]+"\r\n";
//		str	+= "group by wid;\r\n";
		return str;
	}
	
	/*
	 * Joins the time of each wid into the view
	 */
	public String addTimeJoin(Stream strm){
		String str = "";
//		Integer i = 0;
//		Set<String> sources = new HashSet<String>();
//		Set<String> constraints = new HashSet<String>();
//		//sources.add(streamSet.toArray()[0]+"_time");
//		for(Aggregator agg : aggSet){
//			sources.add(strm.getName()+agg.getName());
//		}
//		aggSet.clear();
//		str += genTableStr +strm.getName()+"_tJoin AS WCACHE\r\n"
//					+"SELECT DISTINCT * \r\nFROM "
//				    +strm.getName()+"_having";
//		for(String src : sources){
//			str += " NATURAL JOIN "+src;
//		}
//		str += addConstraints(constraints, false);
//		str += ";\r\n";	
		return str;
	}
	
	public String addIndex(Stream strm){
		String str = "";
//		for (Window win : strm.getFrom().getList()) {
//			str += "CREATE INDEX "+win.getName()+"_stream_index ON " + win.getName() + "_stream(timestamp,wid, abox);\r\n";
//		}
		return str;
	}
	
	public String finalTouch(String resultStr, String lastName) {
		resultStr += "lrb start:" +getStart("pulseA")+ " end:";
		//resultStr += "SELECT * FROM  (newtimeslidingwindow timecolumn:0 ";
		//resultStr += "timewindow:2 frequency:2 granularity:1 equivalence:floor SELECT * FROM (lrb start:" +getStart("pulseA")+ " end:";
		resultStr += getEnd("pulseA") + " SELECT * FROM "+getHavingViewName()+";";
		resultStr = resultStr.replaceAll("CREATE STREAM", "CREATE TEMP TABLE");
		resultStr = resultStr.replaceAll("wcache", "");
		resultStr = resultStr.replaceAll("WCACHE", "");
		return resultStr;
	}
	
	private void setHavingViewName(String name){
		this.havingViewName = name;
	}
	private String getHavingViewName(){
		return this.havingViewName;
	}

}
