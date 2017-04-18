/**
 * Rewriting Baseclass
 *
 * @author Christian Neuenstadt
 */


package de.uzl.ifis.starql.transform;

public abstract class Rewriter {
String query = "";
	public Rewriter(String query){
		this.query = query;
	}
	
	public String getQuery(){
		return query;
	}
	
	public String getRewriting(){
		return query;
	}
}
