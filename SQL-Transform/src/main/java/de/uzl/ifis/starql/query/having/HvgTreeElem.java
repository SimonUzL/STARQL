package de.uzl.ifis.starql.query.having;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class HvgTreeElem implements Cloneable{
	protected Set<StarqlVar> indSet = new HashSet<StarqlVar>();
	protected Set<StarqlVar> valSet = new HashSet<StarqlVar>();
	protected Set<StarqlVar> indBoundSet = new HashSet<StarqlVar>();
	public Set<StarqlVar> getIndBoundSet() {
		return indBoundSet;
	}

	public Set<StarqlVar> getValBoundSet() {
		return valBoundSet;
	}
	protected Set<StarqlVar> valBoundSet = new HashSet<StarqlVar>();
	protected Set<Logical> logicals = new HashSet<Logical>();
	protected Set<IndexedTriple> iTriples = new HashSet<IndexedTriple>();
	protected Set<HvgTreeElem> childElemSet = new HashSet<HvgTreeElem>();
	
	public class SafeVars {
		private Set<StarqlVar> vars = new HashSet<StarqlVar>();
		public Set<StarqlVar> getVars() {
			return vars;
		}
		public void setVars(Set<StarqlVar> vars) {
			this.vars.addAll(vars);
		}
		
		public void removeVars(Set<StarqlVar> vars) {
			this.vars.removeAll(vars);
		}
		
		public HashMap<StarqlVar,Set<StarqlVar>> getEquiMap() {
			return equiMap;
		}
		
		public void addEqui(StarqlVar a, StarqlVar b){
			Set<StarqlVar> tSet = new HashSet<StarqlVar>();
			tSet.add(b);
			equiMap.put(a,tSet);
		}
		
		public void addEqui(StarqlVar a, Set<StarqlVar> b){
			equiMap.put(a,b);
		}
		
		public Set<StarqlVar> getEqui(StarqlVar a){
			return equiMap.get(a);
		}
		
		public void setEquiMap(HashMap<StarqlVar, Set<StarqlVar>> equiMap) {
			this.equiMap = equiMap;
		}
		public SafeVars(){
			
		}
		private   HashMap<StarqlVar,Set<StarqlVar>> equiMap = new HashMap<StarqlVar,Set<StarqlVar>>();
		
	}
	
	public static enum HavingType { 
		FORALL, 
		EXIST,
		NOT,
		OR,
		AND,
		IF,
		LOGICAL,
		INDEXEDTRIPLE,
		OPERATOR,
		HAVING}
	HavingType hType;
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public HavingType getType() {
		return hType;
	}

	public HvgTreeElem(HavingType type){
		hType = type;
	}
	
	public SafeVars getUnSafeVars(){	
		SafeVars sv = new SafeVars();
		Set<StarqlVar> varsTemp = new HashSet<StarqlVar>();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet())
					varsTemp.addAll(child.getUnSafeVars().getVars());
		sv.setVars(varsTemp);
		return sv;
	}
	
	public SafeVars getSafeVars(){	
		SafeVars sv = new SafeVars();
		Set<StarqlVar> varsTemp = new HashSet<StarqlVar>();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet())
					varsTemp.addAll(child.getSafeVars().getVars());
		sv.setVars(varsTemp);
		return sv;
	}
	
	public Set<IndexedTriple> getLowerIndTriples(Boolean quantor){
		Set<IndexedTriple> iTriplesTemp = new HashSet<IndexedTriple>();
		if(getChildElemSet() != null){
			for(HvgTreeElem child : getChildElemSet()){
				if(child != null){
					iTriplesTemp.addAll(child.getLowerIndTriples(quantor));
				}
			} 
		}
		return iTriplesTemp;
	}
	public Set<Logical> getLowerLogicals(Boolean quantor){
		Set<Logical> logicalsTemp = new HashSet<Logical>();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet())
					logicalsTemp.addAll(child.getLowerLogicals(quantor));
		return logicalsTemp;
	}
	
	
	public Set<HvgTreeElem> getChildElemSet() {
		return childElemSet;
	}
	
	public HvgTreeElem getChildElem() {
		return childElemSet.iterator().next();
	}
	
	public void setChildElemSet(Set<HvgTreeElem> childElem) {
		this.childElemSet = childElem;
	}
	
	public void addChildElem(HvgTreeElem hvg){
		this.childElemSet.add(hvg);
	}
	
	public void addChildElemSet(Set<HvgTreeElem> hvg){
		this.childElemSet.addAll(hvg);
	}

	public void setIndBoundSet(Set<StarqlVar> indBoundSet) {
		this.indBoundSet = indBoundSet;
	}
	
	public void setValBoundSet(Set<StarqlVar> valBoundSet) {
		this.valBoundSet = valBoundSet;
	}	
	
	public Set<Logical> getLogicals() {
		return logicals;
	}
	public void setLogicals(Set<Logical> logicals) {
		this.logicals = logicals;
	}
	public Set<IndexedTriple> getiTriples() {
		return iTriples;
	}
	public void setiTriples(Set<IndexedTriple> iTriples) {
		this.iTriples = iTriples;
	}
	
	public Set<StarqlVar> getIndSet() {
		return indSet;
	}
	public void setIndSet(Set<StarqlVar> indSet) {
		indSet = indSet;
	}
	public Set<StarqlVar> getValSet() {
		return valSet;
	}
	public void setValSet(Set<String> valSet) {
		valSet = valSet;
	}
	public Set<StarqlVar> getUnboundValues(){		
		for(HvgTreeElem child : childElemSet)
			valSet.addAll(child.getUnboundValues());
		return valSet;
	}
	public Set<StarqlVar> getUnboundIndex(){
		indSet.clear();
		for(HvgTreeElem child : childElemSet)
			indSet.addAll(child.getUnboundIndex());
		return indSet;
	}
	
	
}