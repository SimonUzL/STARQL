package de.uzl.ifis.starql.query.base;

import java.util.HashSet;

import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
import de.uzl.ifis.starql.query.Aggregator;

public class Triple{
	private StarqlVar subject;
	private StarqlVar predicate;
	private StarqlVar object;
	
	public Triple(){
		
	}
	
	public Triple(StarqlVar nSubject, StarqlVar nPredicate, StarqlVar nObject){
		subject = nSubject;
		predicate = nPredicate;
		object = nObject;
	}
	public StarqlVar getSubject(){
		return subject;
	}
	public void setSubject(StarqlVar str){
		subject = str;
	}
	public StarqlVar getPredicate(){
		return predicate;
	}
	public void setObject(StarqlVar str){
		object = str;
	}
	public StarqlVar getObject(){
		return object;
	}
	public void setPredicate(StarqlVar str){
		predicate = str;
	}
	public boolean containsVar(StarqlVar sVar){
		boolean found = false;
		if(getSubject().equals(sVar) || getPredicate().equals(sVar) || getObject().equals(sVar))
			found = true;
		return found;
	}
	
	public HashSet<StarqlVar> getUnboundValues(){
		HashSet<StarqlVar> hs = new  HashSet<StarqlVar>();			
			if(getSubject().getsType() == StarqlVarType.VALUE)
				hs.add(getSubject());
			if(getObject().getsType() == StarqlVarType.VALUE)
				hs.add(getObject());				
			if(getPredicate().getsType() == StarqlVarType.VALUE)
				hs.add(getPredicate());
		return hs;	
	}
	
	public String getPos(StarqlVar sVar){
		String pos = "notFound";
		if(getSubject().equals(sVar))
			pos = "Subject";
		if(getPredicate().equals(sVar))
			pos = "Predicate";
		if(getObject().equals(sVar))
			pos = "Object";			
		return pos;
	}
	
	public String toString(){
		String str = "";
		str += getSubject().toString() + " " + getPredicate().toString() + " " + getObject().toString();
		return str;
	}
	
	public String toStringSQL(){
		String str = "";
		str += "_"+getSubject().toStringSQL() + "_" + getPredicate().toStringSQL() + "_" + getObject().toStringSQL();
		return str.replace(":", "").replace("_", "").replace("\"", "").replace("^", "").replace(" ","").replace("[", "").replace("]", "").replace("-", "");
	}
	
	public Boolean hasAgg(){
		if(getObject().hasAgg()){
			return true;
		}
		return false;
	}
	
	public Aggregator getAgg(){
		if(getObject().hasAgg()){
			return getObject().getVarAgg();
		}
		return null;
	}
	
}