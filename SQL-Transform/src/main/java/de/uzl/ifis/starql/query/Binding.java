package de.uzl.ifis.starql.query;

import de.uzl.ifis.starql.query.having.ArithmeticExpression;
import de.uzl.ifis.starql.query.having.StarqlVar;

public class Binding{
	private ArithmeticExpression aex = new ArithmeticExpression();
	private StarqlVar renameVar  = null;
	public ArithmeticExpression getAex() {
		return aex;
	}
	public void setAex(ArithmeticExpression aex) {
		this.aex = aex;
	}
	public StarqlVar getRenameVar() {
		return renameVar;
	}
	public void setRenameVar(StarqlVar renameVar) {
		this.renameVar = renameVar;
	}
	public Binding(){
		
	}
	
	public String toString(){
		if(renameVar != null && aex != null)
			return aex.toString() + " AS " + renameVar.toStringSQL();
		if(aex != null)
			return aex.toString();
		return "";
	}
	
	public Binding(ArithmeticExpression aex, StarqlVar renameVar){
			this.aex = aex;
			this.renameVar = renameVar;
		}
	
}
