package de.uzl.ifis.starql.query.having;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import de.uzl.ifis.starql.query.base.ResultTime;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;


public class IndexedTriple extends HvgTreeElem{
	
	private ArrayList<Triple> triple = new ArrayList<Triple>();
	private ResultTime time = new ResultTime("0");	
	
	public ArrayList<Triple> getTriple(){
		return triple;
	}
	
	public int countTriples(){
		int i = 0;
		i = triple.size();
		return i; 
	}
	
	public void removeTriple(Triple triple){
		this.triple.remove(triple);
	}
	
	public void removeTriple(Set<Triple> triples){
		for(Triple triple : triples)
			this.triple.remove(triple);
	}
	
	public Set<Triple> getVarTriple(StarqlVar sVar){
		Set<Triple> t = new HashSet<Triple>();
		for(Triple trple : getTriple()){
			if(trple.containsVar(sVar))
				t.add(trple);
		}
		return t;
	}
	public StarqlVar getTime(){
		return time.getNowVal();
	}
	public void setTime(ResultTime nTime){
		time = nTime;
	}
	public Boolean isFloor(){
		return time.getFloor();
	}

	@Override
	public SafeVars getSafeVars(){	
		SafeVars sv = new SafeVars();
		Set<StarqlVar> varsTemp = new HashSet<StarqlVar>();
		sv.setVars(getUnboundIndex());
		sv.setVars(getUnboundValues());
		return sv;
	}
	
	
	public IndexedTriple(){
		super(HavingType.INDEXEDTRIPLE);
		iTriples.add(this);
	}
	
	public IndexedTriple(Triple t, ResultTime r){
		super(HavingType.INDEXEDTRIPLE);
		triple.add(t);
		time = r;
		iTriples.add(this);
	}
	public IndexedTriple(ArrayList<Triple> t, ResultTime r){
		super(HavingType.INDEXEDTRIPLE);
		triple.addAll(t);
		time = r;
		iTriples.add(this);
	}
	
	public void addTriple(Triple t, ResultTime r){
		triple.add(t);
		time = r;
	}
	
	public void addTriple(Triple t){
		triple.add(t);
	}
	
	public void addTriple(Set<Triple> t){
		triple.addAll(t);
	}
	
	public HashSet<StarqlVar> getUnboundValues(){
		HashSet<StarqlVar> hs = new  HashSet<StarqlVar>();		
		for(Triple tr : triple){
			if(tr.getSubject().getsType() == StarqlVarType.VALUE){
				hs.add(tr.getSubject());
			}
			if(tr.getObject().getsType() == StarqlVarType.VALUE){
				hs.add(tr.getObject());
			}
			if(tr.getPredicate().getsType() == StarqlVarType.VALUE){
				hs.add(tr.getPredicate());
			}
		}
		return hs;	
	}
	
	public HashSet<StarqlVar> getUnboundIndex(){		
		HashSet<StarqlVar> hs = new  HashSet<StarqlVar>();
		hs.add(getTime());
		return hs;
	}
	
	public Set<IndexedTriple> getLowerIndTriples(Boolean quantor){				
		iTriples.add(this);		
		return iTriples;
	}
	
	public String toRDF(){
		String str = "";
		for(Triple trple : getTriple()){
			str += trple.getSubject().toString()+" ";
			str += trple.getPredicate().toString()+" ";
			str += trple.getObject().toString()+" ";
			str += ". ";
		}
		return str;
	}
	
	public String toString(){
		String str = "";
		str += "{ ";
		for(Triple trple : getTriple()){
			str += trple.getSubject().toString()+" ";
			str += trple.getPredicate().toString()+" ";
			str += trple.getObject().toString()+" ";
			str += ". ";
		}
		str += "}";
		if(getTime() != null)
			str += "<"+getTime()+">";
		return str;
	}
}
