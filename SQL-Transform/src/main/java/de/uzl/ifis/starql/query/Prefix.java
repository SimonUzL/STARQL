package de.uzl.ifis.starql.query;

public class Prefix {
	
	public Prefix(String var, String iri){
		setVar(var);
		setIri(iri);
	}
	
	public Prefix(String iri){
		setIri(iri);
	}
	private String var = "";
	
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	private String iri = "";
	
	public String getIri() {
		return iri;
	}
	public void setIri(String iri) {
		this.iri = iri;
	}
}

