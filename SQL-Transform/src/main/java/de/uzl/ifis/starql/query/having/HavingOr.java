package de.uzl.ifis.starql.query.having;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.query.having.HvgTreeElem.SafeVars;
import de.uzl.ifis.starql.transform.HelperFunctions;

public class HavingOr extends HvgTreeElem {
	
	public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
	    Set<T> tmp = new HashSet<T>();
	    for (T x : setA)
	      if (setB.contains(x))
	        tmp.add(x);
	    return tmp;
	}
	
	@Override
	public Set<HvgTreeElem> getChildElemSet() {
		return childElemSet;
	}
	@Override
	public void setChildElemSet(Set<HvgTreeElem> childElem) {
		this.childElemSet = childElem;
	}
	
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
		Set<StarqlVar> varsTemp = new HashSet<StarqlVar>();
		if(getChildElemSet() != null){
			Iterator<HvgTreeElem> iterator = getChildElemSet().iterator();	
			varsTemp.addAll(iterator.next().getSafeVars().getVars());
			while(iterator.hasNext()) {
				varsTemp = intersection(varsTemp, iterator.next().getSafeVars().getVars());
			}
		}
		sv.setVars(varsTemp);
		return sv;
	}
	
	public HavingOr(){
		super(HavingType.OR);
	}
	
	public String toString(){
		if(childElemSet.size() == 1)
			return getChildElem().toString();
		else{
			Set<String> retString = new HashSet<String>();
			for(HvgTreeElem elem : getChildElemSet())
				retString.add(elem.toString());
			return HelperFunctions.getSetAsString(retString, true, " OR ");
		}
	}
}
