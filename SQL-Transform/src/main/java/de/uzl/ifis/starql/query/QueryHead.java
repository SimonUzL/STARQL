package de.uzl.ifis.starql.query;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;

public class QueryHead {
	public static enum HeadType { 
		CONSTRUCT, 
		SELECT}
	private HeadType hType;
	
	public HeadType gethType() {
		return hType;
	}

	public QueryHead(){
	}
	
	public QueryHead(HeadType type){
		hType = type;
	}
	private ArrayList<Binding> vars = new ArrayList<Binding>();

	public ArrayList<Binding> getVars() {
		return vars;
	}

	public void setVars(ArrayList<Binding> vars) {
		this.vars = vars;
	} 
	
	private IndexedTriple iTriple = new IndexedTriple();

	public IndexedTriple getiTriple() {
		return iTriple;
	}

	public void setiTriple(IndexedTriple iTriple) {
		this.iTriple = iTriple;
	}
}
