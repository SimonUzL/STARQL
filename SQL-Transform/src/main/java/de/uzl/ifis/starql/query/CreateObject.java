package de.uzl.ifis.starql.query;

public class CreateObject {
	private Pulse pulse;
	private Stream stream = new Stream();
	private AggMacro agg = new AggMacro();
	
	private Boolean isStream = false;
	private Boolean isAgg = false;
	private Boolean isPulse = false;
	
	private String name = "";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public CreateObject(Object o, String s){
		if(s.equals("stream")){
			stream = (Stream) o;
			isStream = true;
		}
		if(s.equals("agg")){
			agg = (AggMacro) o;
			isAgg = true;
		}
		if(s.equals("pulse")){
			pulse = (Pulse) o;
			isPulse = true;
		}	
	}	
	public boolean isStream(){
		return isStream;
	}
	public boolean isAgg(){
		return isAgg;
	}
	public boolean isPulse(){
		return isPulse;
	}
	public Stream getStream(){
		return stream;
	}
	public AggMacro getAgg(){
		return agg;
	}
	public Pulse getPulse(){
		return pulse;
	}
}
