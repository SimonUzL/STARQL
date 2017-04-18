package de.uzl.ifis.starql.query.having;

import java.util.HashSet;
import java.util.Set;

import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.query.having.HvgTreeElem.SafeVars;

public class Quantor extends HvgTreeElem{
	 
	 private Set<IndexedTriple> iTrple = new HashSet<IndexedTriple>();
	 private Set<Logical> logical = new HashSet<Logical>();
	 
	 public Set<Logical> getLogical() {
		return logical;
	}

	public Set<StarqlVar> getBoundIndSet(){
		return indBoundSet;
	 }
	
	public Set<StarqlVar> getBoundValSet(){
		return valBoundSet;
	 }
	 
	 public Set<IndexedTriple> getiTrple() {
		return iTrple;
	}
	@Override
	public SafeVars getUnSafeVars(){	
		SafeVars sv = new SafeVars();
		Set<StarqlVar> varsTemp = new HashSet<StarqlVar>();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet()){
					varsTemp.addAll(child.getUnSafeVars().getVars());
				}
		sv.setVars(varsTemp);
		return sv;
	}
	
	@Override
	public SafeVars getSafeVars(){	
		SafeVars sv = new SafeVars();
		Set<StarqlVar> varsTemp = new HashSet<StarqlVar>();
		if(getChildElemSet() != null)
				for(HvgTreeElem child : getChildElemSet())
					varsTemp.addAll(child.getSafeVars().getVars());
		varsTemp.removeAll(getBoundValSet());
		varsTemp.removeAll(getBoundIndSet());
		sv.setVars(varsTemp);
		return sv;
	}
	 
	 public Quantor(HavingType type, Set<StarqlVar> boundSet, Set<StarqlVar> boundSet2){
		 super(type);
		 this.indBoundSet = boundSet;
		 this.valBoundSet = boundSet2;		 
	 }
	 
	 public Quantor(HavingType type, Set<StarqlVar> boundSet){
		 super(type);
		 this.indBoundSet = boundSet;
	 }
	 
	 public void buildQuantorValue(HvgTreeElem hvg1, HvgTreeElem hvg2){
		 HvgTreeElem nOr = new HavingOr();
		 HvgTreeElem nNot = new NotElem();
		 nNot.addChildElem(hvg1);
		 nOr.addChildElem(nNot);
		 nOr.addChildElem(hvg2);
		 addChildElem(nOr);
		 //addChildElem(hvg1);
		 //addChildElem(hvg2);
	 }
	 
	 public void buildQuantorValue(HavingAnd hvg){
		addChildElem(hvg);
	 }
	 
	 public void buildQuantorIndex(HvgTreeElem hvg){
		 addChildElem(hvg);
	 }
	 
	 public Set<StarqlVar> getUnboundIndex(){					
		for(HvgTreeElem child : childElemSet){	 			 	
			 	indSet.addAll(child.getUnboundIndex());	
		}
		indSet.removeAll(indBoundSet);		 
		return indSet;
	 }
	 
	 public Set<StarqlVar> getUnboundValues(){
		for(HvgTreeElem child : childElemSet){	 			 	
			 	valSet.addAll(child.getUnboundValues());	
		}
		valSet.removeAll(valBoundSet);		 
		return valSet;
	 }
	 
	 public Set<IndexedTriple> getLowerIndTriplesStart(){									
				for(HvgTreeElem child : childElemSet)
					iTriples.addAll(child.getLowerIndTriples(true));
				iTriples.addAll(this.iTrple);
				return iTriples;						
		}
	 
	 public Set<Logical> getLowerLogicalsStart(){			
				for(HvgTreeElem child : getChildElemSet()){
					for(Logical log : child.getLowerLogicals(true))
						if(getType().equals(HavingType.FORALL)){
							logicals.add(log.negate());
						}else{
							logicals.add(log);
						}
				}
				logicals.addAll(this.logical);
				return logicals;
					
		}
	 	@Override
	 	public Set<IndexedTriple> getLowerIndTriples(Boolean quantor){		
	 		Set<IndexedTriple> empty = new HashSet<IndexedTriple>();
			if(quantor){
				return empty;
			}else{
				for(HvgTreeElem child : childElemSet)
					empty.addAll(child.getLowerIndTriples(quantor));
				empty.addAll(this.iTrple);
				return empty;	
			}			
		}
	 	@Override
		public Set<Logical> getLowerLogicals(Boolean quantor){
			Set<Logical> empty = new HashSet<Logical>();
			if(quantor){
				return empty;
			}else{
				for(HvgTreeElem child : getChildElemSet()){
					for(Logical log : child.getLowerLogicals(quantor))
						if(getType().equals(HavingType.FORALL)){
							empty.add(log.negate());
						}else{
							empty.add(log);
						}
				}
				empty.addAll(this.logical);
				return empty;
			}			
		}
	 	
	 	@Override
	 	public void addChildElem(HvgTreeElem hvg){
	 		if(childElemSet.size() == 1 && getChildElem().getType().equals(HavingType.AND))
	 			getChildElem().addChildElem(hvg);
	 		else
	 		this.childElemSet.add(hvg);
		}
	 	
	 	@Override
		public void addChildElemSet(Set<HvgTreeElem> hvg){
	 		if(childElemSet.size() == 1 && getChildElem().getType().equals(HavingType.AND))
	 			getChildElem().addChildElemSet(hvg);
	 		else
	 		this.childElemSet.addAll(hvg);
		}
}
