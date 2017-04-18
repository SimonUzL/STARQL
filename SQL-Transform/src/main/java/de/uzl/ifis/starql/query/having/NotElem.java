package de.uzl.ifis.starql.query.having;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import de.uzl.ifis.starql.query.having.HvgTreeElem.SafeVars;

public class NotElem extends HvgTreeElem{
	public NotElem(){
		super(HavingType.NOT);
	}
	/*@Override
	public SafeVars getUnSafeVars(){	
		SafeVars sv = new SafeVars();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet()){
					sv.setVars(child.getUnSafeVars().getVars());
					sv.setVars(child.getSafeVars().getVars());
				}
		return sv;
	}
    
	@Override
	public SafeVars getSafeVars(){	
		SafeVars sv = new SafeVars();
		return sv;
	}*/
}
