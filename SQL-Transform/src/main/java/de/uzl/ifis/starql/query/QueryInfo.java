package de.uzl.ifis.starql.query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QueryInfo {
	private ArrayList<Stream> streamList = new ArrayList<Stream>();
	private ArrayList<AggMacro> aggMacroList = new ArrayList<AggMacro>();
	private ArrayList<Prefix> prefixList = new ArrayList<Prefix>();

	private Map<String, Pulse> pulseMap = new HashMap<String, Pulse>();
	private From from;

	public QueryInfo(){
		
	}
	
	public void addPulse(Pulse nPulse){
		pulseMap.put(nPulse.getName(), nPulse);
	}
	public Pulse getPulse(String name){
		////system.out.println("suche pulse: "+name);
		return pulseMap.get(name);
	}
	
	public Map<String, Pulse> getPulse(){
		return pulseMap;
	}
	public void setFrom(From nFrom){
		from = nFrom;
	}
	public From getFrom(){
		return from;
	}		
	public void setStream(Stream nStream){
		streamList.add(nStream);
	}
	public ArrayList<Stream> getStreamList(){
		return streamList;
	}
	public void setPrefix(Prefix nPrefix){
		if(nPrefix.getVar().contains(":"))
			nPrefix.setVar(nPrefix.getVar().substring(0, nPrefix.getVar().length() - 1));
			prefixList.add(nPrefix);
	}
	public ArrayList<Prefix> getPrefixList(){
		return prefixList;
	}
	public void setAgg(AggMacro nAgg){
		aggMacroList.add(nAgg);
	}
	public ArrayList<AggMacro> getAgg(){
		return aggMacroList;
	}
}
