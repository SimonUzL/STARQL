package de.uzl.ifis.starql.query.having;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.transform.HelperFunctions;

public class HavingAnd extends HvgTreeElem {
	private Set<IndexedTriple> iTrple = new HashSet<IndexedTriple>();
	private Set<Logical> logical = new HashSet<Logical>();
	
	
	@Override
	public SafeVars getUnSafeVars(){	
		SafeVars sv = new SafeVars();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet()){
					sv.setVars(child.getUnSafeVars().getVars());
					sv.setVars(child.getSafeVars().getVars());
				}
		sv.removeVars(getSafeVars().getVars());
		return sv;
	}
    
	@Override
	public SafeVars getSafeVars(){	
		SafeVars sv = new SafeVars();
		if(getChildElemSet() != null){
			Set<StarqlVar> tSet = new HashSet<StarqlVar>();
			for(HvgTreeElem child : getChildElemSet()){
				for(Map.Entry<StarqlVar, Set<StarqlVar>> entry : child.getSafeVars().getEquiMap().entrySet()){
					if(sv.getEquiMap().containsKey(entry.getKey())){			
						tSet = sv.getEqui(entry.getKey());
						tSet.addAll(entry.getValue());
						sv.addEqui(entry.getKey(), tSet);
					}else{
						sv.addEqui(entry.getKey(), entry.getValue());
					}
				}
				sv.setVars(child.getSafeVars().getVars());	
			}
			for(StarqlVar sVar : sv.getVars()){
				if(sv.getEqui(sVar) != null)
					tSet.addAll(sv.getEqui(sVar));
			}
			sv.setVars(tSet);
		}
		return sv;
	}
	
	public Set<IndexedTriple> getiTrple() {
		return iTrple;
	}
	public void setiTrple(Set<IndexedTriple> iTrple) {
		this.iTrple = iTrple;
	}
	public Set<Logical> getLogical() {
		return logical;
	}
	public void setLogical(Set<Logical> logical) {
		this.logical = logical;
	}
	@Override
	public Set<HvgTreeElem> getChildElemSet() {
		return childElemSet;
	}
	@Override
	public void setChildElemSet(Set<HvgTreeElem> childElem) {
		this.childElemSet = childElem;
	}
	public HavingAnd(){
		super(HavingType.AND);
	}
	
	public String toString(){
		if(childElemSet.size() == 1)
			return getChildElem().toString();
		else{
			Set<String> retString = new HashSet<String>();
			for(HvgTreeElem elem : getChildElemSet())
				retString.add(elem.toString());
			return HelperFunctions.getSetAsString(retString, true, " AND ");
		}
	}
}