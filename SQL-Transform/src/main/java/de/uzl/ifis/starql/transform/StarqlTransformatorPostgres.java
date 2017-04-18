/**
 * StarQL Transformation
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.uzl.ifis.starql.parser.*;
import de.uzl.ifis.starql.query.*;
import de.uzl.ifis.starql.query.base.*;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
import de.uzl.ifis.starql.query.having.TreeFunctions;
import de.uzl.ifis.starql.query.QueryHead.HeadType;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.joda.time.Period;

public class StarqlTransformatorPostgres extends StarqlTransformator implements StarqlTransformatorInterface{
	private String genTableStr = "CREATE VIEW ";
	private String dropTableStr = "DROP VIEW IF EXISTS ";
	private String sql = "";
//	private DBMetadata dbData = new DBMetadata();
	private Set<String> constraints = new HashSet<String>();
	private Set<String> hasPrefix = new HashSet<String>();
	private Set<String> starqlStreamSet = new HashSet<String>();	
	private Set<String> generatedInput = new HashSet<String>();	
	private ArrayList<Aggregator> aggSet = new ArrayList<Aggregator>();
	private Integer outNum = 0;
	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
	
	public StarqlTransformatorPostgres(String starql, Unfolder unf) {
		setStarql(starql);
		setUnf(unf);
		try {
			setQinfo(getQueryInfo(starql));
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		for(Stream s : getQinfo().getStreamList())
			if(!hasSyncPulse(s))
				this.sql += pulse_gen(getQinfo().getPulse(s.getPulse()));
		this.sql += transform();
	}

	public String getResultQuery() {
		return this.sql;
	}
	
	public boolean hasSyncPulse(Stream strm){
		Period freq = getQinfo().getPulse(strm.getPulse()).getFreq();
		for(Window win : strm.getFrom().getList()){
			if(!win.getSlide().getPeriod().equals(freq))
				return false;
		}
		return true;
	}
	
	/* generate pulse */
	private String pulse_gen(Pulse pulse){
		String viewString = "";
		viewString += dropTableStr + "pulse_" + pulse.getName() + " CASCADE;\r\n";
		viewString += genTableStr + "pulse_" + pulse.getName() + " AS\r\n"
		+ "SELECT row_number() OVER ( ORDER BY pulse ) - 1 AS wid, pulse as time\r\n"
		+ "FROM ( SELECT generate_series ( '";
		if(pulse.getStart() != null)
			viewString += df.format(pulse.getStart().toDate());
		viewString += "'::timestamp,\r\n'";
		if(pulse.getEnd() != null)
			viewString += df.format(pulse.getEnd().toDate());
		viewString += "'::timestamp,"
		+ " '"+pulse.getFreq().toStandardSeconds().getSeconds()+" seconds'::interval ) AS pulse) series;\r\n\r\n";
		return viewString;
	}
	
	/* generate borders*/
	private String window_range(Stream strm, String viewString, String name, int range, int slide, Boolean fromStarql){
		String from = "";
		viewString += dropTableStr + name + "_window_range" + " CASCADE;\r\n";
		viewString += genTableStr + name + "_window_range" + " AS\r\n"
		+ "SELECT row_number() OVER ( ORDER BY time ) - 1 AS wid,\r\n"
		+ "time - ('"+range+" seconds'::interval) AS left,"
		+ "time, lead(time, 1) over(order by time) as next\r\n"
		+ "FROM ( SELECT generate_series ( '";
		if(getQinfo().getPulse() != null)
			if(getQinfo().getPulse(strm.getPulse()).getStart() != null)
				viewString += df.format(getQinfo().getPulse(strm.getPulse()).getStart().toDate())+"'::timestamp,\r\n";
		if(getQinfo().getPulse() != null)
			if(getQinfo().getPulse(strm.getPulse()).getEnd() != null)
				viewString += "'" + df.format(getQinfo().getPulse(strm.getPulse()).getEnd().toDate())+"'::timestamp, ";
		viewString += "'"+slide+" seconds'::interval) AS time\r\n"
		+ ") series;\r\n\r\n";
		return viewString;		
	}
	
	/* window sampling */
	private String wid(Stream strm, String name, Boolean fromStarql){
		String from = "";
		if(fromStarql)
			from += "_starqlout";
		String str = "";
		str += dropTableStr + name +"_window_pulse_join" + " CASCADE;\r\n";
		str += genTableStr+name+"_window_pulse_join AS\r\n"
				+ "SELECT p.wid, m.left, m.time FROM\r\n"
				+ name+"_window_range m right join pulse_"+getQinfo().getPulse(strm.getPulse()).getName()+" p\r\n"
				+ "ON p.time BETWEEN m.time AND m.next AND m.next > p.time;\r\n\r\n";
		return str;
	}
	
	private String genStream(Stream strm, String name, Boolean fromStarql){
		String from = "";
		if(fromStarql)
			from += "_starqlout";
		String str = dropTableStr + name +"_data CASCADE;\r\n";
		str += genTableStr +name+"_data AS\r\n"
				+ "SELECT DISTINCT wid,  tble.*\r\n"
				+ "FROM "+name+"_window_pulse_join pj\r\n"
				+ "left outer join "+name+" tble\r\n"
				+ "ON tble.timestamp BETWEEN pj.left AND pj.time;\r\n\r\n";
		return str;
	}
	
	private String genStreamSynch(Stream strm, String name, Boolean fromStarql){
		String from = "";
		if(fromStarql)
			from += "_starqlout";
		String str = dropTableStr + name +"_data CASCADE;\r\n";
		str += genTableStr +name+"_data AS\r\n"
				+ "SELECT DISTINCT wid,  tble.*\r\n"
				+ "FROM "+name+"_window_range wr\r\n"
				+ "left outer join "+name+" tble\r\n"
				+ "ON tble.timestamp BETWEEN wr.left AND wr.time;\r\n\r\n";
		return str;
	}
	
	/* Create ABoxes */
	private String genStates(String name){
		String str = "";
		str += dropTableStr + name + "_stream" + " CASCADE;\r\n";
		str += genTableStr+name+"_stream AS\r\n"
				+ "SELECT dense_rank() OVER ( PARTITION BY wid ORDER BY timestamp ASC ) AS abox,\r\n"
				+ "* FROM "+name+"_data;\r\n\r\n";
		return str;
	}
	
	private String buildViewString(Stream strm, String name, int range, int frequency,
			int granularity, int column, Boolean fromStarql) {
		String viewString = "";
		if(!generatedInput.contains(name)){
			viewString += window_range(strm, viewString, name, range, frequency, fromStarql);
			if(!hasSyncPulse(strm)){
				viewString += wid(strm, name, fromStarql);
				viewString += genStream(strm, name, fromStarql);
			}else
				viewString += genStreamSynch(strm, name, fromStarql);
			viewString += genStates(name);
			generatedInput.add(name);
		}
		return viewString;
	}

	public String addIndex(Stream strm) {
		String str = "";
		/*String name = "";
		for (Window win : strm.getFrom().getList()) {
			name = win.getName();
			if(starqlStreamSet.contains(win.getName())){
				name += "_starqlout";
			}
			str += "DROP INDEX IF EXISTS  "+ name +"_stream_index;\r\n";
			str += "CREATE INDEX  "+ name +"_stream_index ON "+ name +"_stream(timestamp,wid, abox);";
		}*/
		return str;
	}

	public String constructView(Stream strm) {
		String view = "";
		Boolean fromStarql = false;
		////system.out.println(streamSet);
		for (Stream stream : getQinfo().getStreamList()) {
			starqlStreamSet.add(stream.getName());
		}
		////system.out.println(streamSet);
		for (Window win : strm.getFrom().getList()) {
			if (!starqlStreamSet.contains(win.getName())) {
				view += buildViewString(strm, win.getName(), win.getTimewindow(),
						win.getSlide().getPeriod().toStandardSeconds().getSeconds(), 1, 0, fromStarql);
			}else{
				view += buildViewString(strm, win.getName() + "_starqlout", win.getTimewindow(),
						win.getSlide().getPeriod().toStandardSeconds().getSeconds(), 1, 0, fromStarql);
			}
		}
		return view;
	}
	
	private String addConstraints(Set<String> constraints, Boolean first){
		return addConstraints(constraints, first, "OR", "AND");
	}
	
	public String constructHaving(Stream strm) {
		Set<String> tmpSet = new HashSet<String>();
		Set <String> strSet = new HashSet<String>();
		HavingTreeWalkerPostgres hWalker = new HavingTreeWalkerPostgres(strm, getUnf(), this);
		//if(streamSet.toArray()[0].toString().contains("_strminfo"))
		//	now = "timestamp";
		String str = dropTableStr + strm.getName() + "_having CASCADE;\r\n";
		str += genTableStr + strm.getName() + "_having AS  \r\n";	
		ArrayList<StarqlVar> sVars = new ArrayList<StarqlVar>(strm.getVars());
		if(strm.getWhere() != null){
			strSet.add("(\r\n" + getUnf().unfoldDirect(strm.getWhere(), null, false, strm.getFrom().getList()).replaceAll("(?m)^", "\t") + ") SUB_TRIPLE"+(hWalker.getnextOntopStrm()+hWalker.getSubStreams().size()));
		}
		str += "SELECT DISTINCT "+ "wid";
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
						tmpSet.add(sVar.toStringSQL());
						break;
					}
			}
		str += HelperFunctions.getSetAsString(tmpSet, false, ", ");
		str += "\r\n" + "FROM\r\n ( SELECT * FROM \r\n";
		String fromStr = "";
		if(!strSet.isEmpty())
			fromStr += "( SELECT * FROM\r\n " + HelperFunctions.getSetAsString(strSet, true, "\r\nNATURAL JOIN\r\n").replaceAll("(?m)^", "\t") + "\r\n) SUB_WHERE";// + " AS "+trple.toStringSQL();
		//str += HelperFunctions.getSetAsString(toSubquery(trples), true, " NATURAL JOIN\r\n");// + " AS "+trple.toStringSQL();
		if(strm.getWhere() != null && (hWalker.getString() != null)){
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
	
	private String buildSelectOut(Stream strm) {
		String str = "";
		boolean firstTriple = true;
		if(strm.getReturn().gethType().equals(HeadType.CONSTRUCT))
		for (Triple triple : strm.getReturn().getiTriple().getTriple()) {			
			outNum++;
			if(strm.getReturn().getiTriple().getTriple().size() > 1){
				str += dropTableStr + strm.getName() + "_starqlout"+outNum+" CASCADE;\r\n";
				str += genTableStr + strm.getName() + "_starqlout_"+outNum+" AS \r\n";
			}else{
				str += dropTableStr + strm.getName() + "_starqlout CASCADE;\r\n";
				str += genTableStr + strm.getName() + "_starqlout AS \r\n";
			}
			str += "SELECT DISTINCT ";
			if (strm.getReturn().getiTriple().getTime().toString().toLowerCase()
					.contains("now")) {
				str += "time";
			} else {
				str += "'"+strm.getReturn().getiTriple().getTime().toString()+"'";
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
		else{		
				Boolean aggQuery = false;
				Set<StarqlVar> nonAggVars = new HashSet<StarqlVar>();
				for(Binding bVar : strm.getReturn().getVars()) {
					for(StarqlVar svar : bVar.getAex().getVars())
						if(svar.hasAgg())
							aggQuery = true;
						else
							nonAggVars.add(svar);
				}
				if(aggQuery)
					if(strm.getGrpby() != null){
						for(StarqlVar svar : nonAggVars)
							if(!strm.getGrpby().getGrpVars().contains(svar)){
								//logger.warn("NON GROUPED SELECT VARIABLE: "+svar.toString());
								return "Non grouped select variable: "+svar.toString();
							}
					}
					else{
						if(!nonAggVars.isEmpty()){
							//logger.warn("NON GROUPED SELECT VARIABLES: "+nonAggVars.toString());
							return "Non grouped select variable: "+nonAggVars.toString();
						}
					}
				str += dropTableStr + strm.getName() + "_starqlout CASCADE;\r\n";
				str += genTableStr + strm.getName() + "_starqlout AS \r\n";
				str += "SELECT DISTINCT ";
				str += "time";
				str += " AS timestamp";
				ArrayList<String> bindings = new ArrayList<String>();
				for(Binding bVar : strm.getReturn().getVars()) {
					String binding = bVar.toString();
					for(StarqlVar sVar : bVar.getAex().getVars()){
						if(sVar.hasAgg())
							binding = binding.replace(sVar.getVarAgg().getAggType() + sVar.getVarAgg().getColumns().toString().replace("[", "(").replace("]", ")").toString(), sVar.getVarAgg().getName());
					}
					bindings.add(binding);
				}
				str += HelperFunctions.getSetAsString(bindings, false, ", ");
				str += " FROM " + strm.getName() + "_tJoin";
				if(strm.getHvgAggregate() != null){
					Set<StarqlVar> declaredVars = new HashSet<StarqlVar>();
					if(strm.getHvg() != null)
							declaredVars.addAll(strm.getHvg().getSafeVars().getVars());
					if(strm.getWhere() != null)
							declaredVars.addAll(strm.getWhere().getSafeVars().getVars());
					Set<StarqlVar> checkVars = new HashSet<StarqlVar>();
					for(StarqlVar svar : strm.getHvgAggregate().getUnSafeVars().getVars()){
						if(svar.hasAgg())
							checkVars.addAll(svar.getVarAgg().getColumnsAsVar());
						else
							checkVars.add(svar);
						for(StarqlVar var : checkVars)
							if(!declaredVars.contains(var)){
								//system.out.println("@@@@@@@@@Declared Vars" + declaredVars);
								return "Aggregate Variable: " + var.toString()+ " is not safe!";
							}
					}
					String aggString = strm.getHvgAggregate().toString();
					for(StarqlVar sVar : strm.getHvgAggregate().getUnSafeVars().getVars())
						if(sVar.hasAgg())
							aggString = aggString.replace(sVar.getVarAgg().getAggType() + sVar.getVarAgg().getColumns().toString().replace("[", "(").replace("]", ")").toString(), sVar.getVarAgg().getName());
					str += "\r\nWHERE " + aggString;
				}
				str += ";\r\n\r\n";
		}
		return str;
	}

	public String buildAggStream(Triple triple, Stream strm){
		String str = "";
		String grpVar = "";
		String wid = "wid";
		String cast = "";
		if(triple.getSubject().getsType() == StarqlVarType.VALUE){
			grpVar += triple.getSubject().toStringSQL() +", ";
		}
		Set<IndexedTriple> trples = new HashSet<IndexedTriple>();
		Set<Triple> varTriples = new HashSet<Triple>();
		Set<String> setString = new HashSet<String>();
		str += dropTableStr + strm.getName()+triple.getAgg().getName()+ " CASCADE;\r\n";
		str += genTableStr + strm.getName()+triple.getAgg().getName()+" AS \r\n";
		if(triple.getAgg().getAggType().toLowerCase().equals("avg") ||
				triple.getAgg().getAggType().toLowerCase().equals("sum") ||
				triple.getAgg().getAggType().toLowerCase().equals("count") ||
				triple.getAgg().getAggType().toLowerCase().equals("min") ||
				triple.getAgg().getAggType().toLowerCase().equals("max") )
		cast = "::numeric";
		str += "SELECT "+wid+", "+grpVar+triple.getAgg().getAggType()+"("+triple.getAgg().getColumns().toString().substring(1, triple.getAgg().getColumns().toString().length()-1)+ cast + ") as "+triple.getAgg().getName()+"\r\nFROM " +strm.getName()+ "_having";
		
		/*trples.add(strm.getWhere());
		if (strm.getHvg() != null)	
			trples.addAll(strm.getHvg().getLowerIndTriples(false));
		for(String var : triple.getAgg().getColumns()){
			StarqlVar sVar = new StarqlVar(StarqlVarType.VALUE, var.substring(1));
			for(IndexedTriple iTriple : trples)
				varTriples.addAll(iTriple.getVarTriple(sVar));
		}
		for(Triple trple : varTriples){
			setString.add("   (\r\n" + getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t") + "   ) SUB_TRIPLE");
		}
		str += "( SELECT * FROM \r\n " + HelperFunctions.getSetAsString(setString, true, "\r\nNATURAL JOIN\r\n") + "\r\n) SUB_FROM";*/
		
		
		str += "\r\n GROUP BY wid";
		if(!grpVar.isEmpty())
			str += ", "+triple.getSubject().toStringSQL();
		str +=";\r\n";
		return str;
	}
	
	public String buildAggStream(StarqlVar var, Stream strm){
		String str = "";
		String cast = "";
		String wid = "wid";
		String grpstr = "";
		String ontopString = "";
		Set<IndexedTriple> trples = new HashSet<IndexedTriple>();
		Set<Triple> varTriples = new HashSet<Triple>();
		Set<String> setString = new HashSet<String>();
		if(strm.getGrpby() != null)
			for(StarqlVar sVar : strm.getGrpby().getGrpVars())
				grpstr += ", "+sVar.toStringSQL();	
		str += dropTableStr + strm.getName()+var.getVarAgg().getName()+ " CASCADE;\r\n";
		str += genTableStr + strm.getName()+var.getVarAgg().getName()+" AS\r\n";
		if(var.getVarAgg().getAggType().toLowerCase().equals("avg") ||
				var.getVarAgg().getAggType().toLowerCase().equals("sum") ||
				var.getVarAgg().getAggType().toLowerCase().equals("count") ||
				var.getVarAgg().getAggType().toLowerCase().equals("min") ||
				var.getVarAgg().getAggType().toLowerCase().equals("max") )
		cast = "::numeric";
		str += "SELECT "+wid+", "+var.getVarAgg().getAggType()+"("+var.getVarAgg().getColumns().toString().substring(1, var.getVarAgg().getColumns().toString().length()-1)+ cast + ") as "+var.getVarAgg().getName()+ grpstr +"\r\nFROM " +strm.getName()+ "_having";
		
		/*trples.add(strm.getWhere());
		if (strm.getHvg() != null)	
			trples.addAll(strm.getHvg().getLowerIndTriples(false));
		for(String cvar : var.getVarAgg().getColumns()){
			StarqlVar sVar = new StarqlVar(StarqlVarType.VALUE, cvar.substring(1));
			for(IndexedTriple iTriple : trples)
				varTriples.addAll(iTriple.getVarTriple(sVar));
		}
		for(Triple trple : varTriples){
			setString.add("(" + getUnf().unfoldDirect(trple, true, strm.getFrom().getList()).replaceAll("(?m)^", "\t") + ") SUB_TRIPLE");
		}
		str += "\r\n " + HelperFunctions.getSetAsString(setString, true, "\r\nNATURAL JOIN\r\n") + "\r\n";*/
		
		str += "\r\n GROUP BY wid";
		str += grpstr + ";\r\n";
		return ontopString + str;
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
				//logger.warn("NO FREE AND SAFE GROUP VARIABLE: "+ svar.toString());
				return "No free and safe group variable: "+ svar.toString();
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
	
	private String buildUnionOut(Stream strm){
		Integer i = 0;
		String str = dropTableStr + strm.getName() + "_starqlout"+ " CASCADE;\r\n";
		str += genTableStr + strm.getName() + "_starqlout"+" AS \r\n";
		str += "select * from (\r\n";
		while (i < outNum){
			i++;
			str += strm.getName() + "_starqlout_" + i + " ";			
			if(i < outNum)
				str += " UNION";
		}
		str += 	"\r\n);\r\n";
		return str;
	}
	
	public String constructOut(Stream strm) {
		String str = "";
		str += buildSelectOut(strm) + "\r\n";
		if(strm.getReturn().getiTriple().getTriple().size() > 1){
			str += buildUnionOut(strm) + "\r\n";
		}
		return str;
	}

	public String joinStreamInfo(Stream stream) {
		String str = "";
		Boolean first = true;
		Boolean fromStarql = true;
		
		for (Window win : stream.getFrom().getList()) {
			if (starqlStreamSet.contains(win.getName())) {
				str += buildViewString(stream, win.getName(), win.getTimewindow(),
						win.getSlide().getSeconds(), 1, 0, fromStarql);
			}
			str +="\r\n";
		}
		
		for (Window win : stream.getFrom().getList()) {
			if (starqlStreamSet.contains(win.getName())) {
				if (!first) {
					str += "\r\nUNION\r\n";
				} else {
					str = dropTableStr + stream.getName() + "_strminfo CASCADE;\r\n";
					str += "\r\n"+genTableStr + stream.getName()
							+ "_strminfo AS\r\n";				
				}
				str += "SELECT * FROM " + win.getName() + "_starqlout_stream";
				first = false;
				//streamSet2.add(stream.getName()+"_strminfo");
			}			
		}		
		if(first == false)
			str += ";\r\n";
		return str;
	}

	public String joinedStream(Stream strm) {
		String str = "";
		String hist = "";
		str += joinStreamInfo(strm);
		/*Map<String, Set<String>> joinSet = new HashMap<String, Set<String>>();
		Set<String> newVal = new HashSet<String>();
		for (Window win : strm.getFrom().getList()) { //All streamwindows used in the current stream
			if(streamSet.contains(win.getName()))
				continue; //if stream is generated by starql -> skip			
				if(isHistorical())
					hist = "_stream";
				streamSet2.add(win.getName()+hist);
			}			
		*/
		//streamSet.clear();
		//streamSet.addAll(joinSet.keySet());
		////system.out.println("QQQQAAAA "+streamSet);
		//streamSet.addAll(streamSet2);
		////system.out.println("QQQQBBBB "+streamSet);
		
		//str += nowVal(strm, hasNative);
		return str;
	}

		public String addTime(Stream strm){
		Boolean hasStarqlSource = false;
		String str = "";
		/*str += dropTableStr + strm.getName() + "_time" + " CASCADE;\r\n";
		str += genTableStr + strm.getName() + "_time AS  \r\n";
		str += "select wid, max(timestamp) as timestamp\r\n";
		for (Window win : strm.getFrom().getList()) {
			if(starqlStreamSet.contains(win.getName()))
				 hasStarqlSource = true;
		}
		if(hasStarqlSource){
			str	+= "from "+strm.getName()+"_strminfo\r\n";
		}else{
			str	+= "from "+generatedInput.toArray()[0]+"_stream\r\n";
		}
		str	+= "group by wid;\r\n";*/
		return str;
	}
	
	public String addTimeJoin(Stream strm){
		String str = "";
		Set<String> sources = new HashSet<String>();
		if(hasSyncPulse(strm)){
			String timeStr = strm.getFrom().getList().get(0).getName();
			if (starqlStreamSet.contains(timeStr))
				timeStr += "_starqlout";
			sources.add(timeStr + "_window_range");
		}
		else
			sources.add("pulse_"+strm.getPulse());
		for(Aggregator agg : aggSet){
			sources.add(strm.getName()+agg.getName());
		}
		aggSet.clear();
		str += dropTableStr + strm.getName() + "_tJoin CASCADE;\r\n";
		str += genTableStr +strm.getName()+"_tJoin AS \r\n"
					+"SELECT DISTINCT * \r\nFROM "
				    +strm.getName()+"_having";
		for(String src : sources){
			str += " NATURAL JOIN "+src;
		}
		str += addConstraints(constraints, false);
		str += ";\r\n";	
		return str;
	}	
		
	public String finalTouch(String resultStr, String lastName) {
		resultStr += "SELECT * FROM "+lastName+"_starqlout;";
		return resultStr;
	}
}
