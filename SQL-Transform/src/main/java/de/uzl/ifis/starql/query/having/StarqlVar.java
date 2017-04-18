package de.uzl.ifis.starql.query.having;

import de.uzl.ifis.starql.query.Aggregator;
import de.uzl.ifis.starql.query.Prefix;
import de.uzl.ifis.starql.transform.HelperFunctions;

public class StarqlVar {
	public static enum StarqlVarType {IRIREF, RDFLITERAL, NUMERICLITERAL, INDEX, VALUE, AMBIGIOUS}
	private StarqlVarType sType;
	private String varText = "";


	private Aggregator varAgg;
	private Boolean hasAgg = false;
	private Prefix prefix = null;
	
	public Prefix getPrefix() {
		return prefix;
	}

	public void setPrefix(Prefix prefix) {
		this.prefix = prefix;
	}

	public boolean equals(Object o) {
		return (o instanceof StarqlVar) 
	    		  && (((StarqlVar)o).toString().trim()).equals(this.toString().trim())
	    		  && (((StarqlVar)o).getsType().toString()).equals(this.getsType().toString());
	  }

	public int hashCode() {
	      return varText.hashCode()+sType.toString().hashCode();
	}
	
	public StarqlVarType getsType() {
		return sType;
	}

	public String toString() {
		if(this.hasAgg)
			return(getVarAgg().getAggType()+getVarAgg().getColumns());
		if(getsType() == StarqlVarType.VALUE)
			return "?"+varText;
		return varText;
	}	
	
	public String toStringSQL() {
		if(this.hasAgg)
			return(getVarAgg().getName());
		if(getsType() == StarqlVarType.VALUE)
			return "_"+varText;
		return varText;
	}	
	
	public StarqlVar(StarqlVarType sType, String varText){
		this.sType = sType;
		this.varText = varText;	
	}
	
	public void addAgg(Aggregator agg){
		this.varAgg = agg;
		hasAgg = true;
	}
	
	public Boolean hasAgg(){
		return hasAgg;
	}
	
	public Aggregator getVarAgg() {
		return varAgg;
	}

	public String getText(){
		return varText;
	}
	public void setText(String varText) {
		this.varText = varText;
	}
}
