package de.uzl.ifis.starql.query;

public class Sequence {
	private String sType = "";
	public String getsType() {
		return sType;
	}
	
	public void setsType(String sType) {
		this.sType = sType;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	private String sName = "";
	
	public Sequence(String nType, String nName){
		sType = nType;
		sName = nName;
	}
}
