package de.uzl.ifis.starql.query.having;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.uzl.ifis.starql.query.base.ResultTime;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.ArithmeticExpression;
import de.uzl.ifis.starql.query.having.HavingAnd;
import de.uzl.ifis.starql.query.having.HavingOr;
import de.uzl.ifis.starql.query.having.HvgTreeElem;
import de.uzl.ifis.starql.query.having.IfTreeElem;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.Logical;
import de.uzl.ifis.starql.query.having.NotElem;
import de.uzl.ifis.starql.query.having.Quantor;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.query.having.StarqlVar;


public class TreeFunctions {

	public static void printHavingTree(HvgTreeElem hvg, int level) {
		//indent level 
		if(hvg.getType() != HavingType.OR && hvg.getType() != HavingType.AND && hvg.getType() != HavingType.HAVING){
			for (int i = 0; i < level; i++)
	                System.out.print("--");  
	        System.out.print(hvg.getType().toString());
		}
		if(hvg.getType() == HavingType.HAVING){        	       		       	
			for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        		printHavingTree(hvg2, level + 1);
        	}       	
        }
		if(hvg.getType() == HavingType.NOT){     
			//system.out.println();
			for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        		printHavingTree(hvg2, level + 1);
        	}      	
        }
        if(hvg.getType() == HavingType.OR){
        	for (int i = 0; i < level; i++)
                System.out.print("--");  
        	//system.out.println("OR");
        	for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        		printHavingTree(hvg2, level + 1);
        	}
        }
        if(hvg.getType() == HavingType.AND){    
        	for (int i = 0; i < level; i++)
                System.out.print("--");  
        	//system.out.println("AND");
        	for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        		printHavingTree(hvg2, level + 1);
        	}
        }
        if(hvg.getType() == HavingType.IF){	
        	//system.out.println("");
        	printHavingTree(((IfTreeElem)hvg).getIfElem(), level + 1);
        	for (int i = 0; i < level; i++)
                System.out.print("--");  
        	//system.out.println("THEN");
        	printHavingTree(((IfTreeElem)hvg).getThenElem(), level + 1);
        }
        if(hvg.getType() == HavingType.FORALL){
        	System.out.print(" gebunden:"+ ((Quantor) hvg).getBoundIndSet()+((Quantor) hvg).getBoundValSet());
        	//system.out.println(" noch ungebunden: val"+ ((Quantor) hvg).getUnboundValues() + " ind" + ((Quantor) hvg).getUnboundIndex());       		
        	for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        		printHavingTree(hvg2, level + 1);
        	}
        }
        if( hvg.getType() == HavingType.EXIST){
        	System.out.print(" gebunden:"+ ((Quantor) hvg).getBoundIndSet()+((Quantor) hvg).getBoundValSet());
        	//system.out.println(" noch ungebunden: val"+ ((Quantor) hvg).getUnboundValues() + " ind" + ((Quantor) hvg).getUnboundIndex());       		
        	for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        		printHavingTree(hvg2, level + 1);
        	}
        }
        if( hvg.getType() == HavingType.LOGICAL){       	
        	//system.out.println(" "+((Logical) hvg).toString());
        }
        if( hvg.getType() == HavingType.INDEXEDTRIPLE){        	
        	//system.out.println(" "+((IndexedTriple) hvg).toString());        	
        }
	}
	
	public static String printHavingTreeSimple(HvgTreeElem hvg, int level) {
		//indent level
		String output = "";
		for (int i = 0; i < level; i++)
		        output += "--";  
		output += hvg.getType();
		switch(hvg.getType()){
			case LOGICAL :
				output += " -- "  +hvg.toString();
				break;
			case INDEXEDTRIPLE :
				output += " -- " + hvg.toString();
				break;
			default:		
		}
		output += "\r\n";
		level += 1;
	    for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
	    	////system.out.println("Starte neu: "+hvg2.getType());
        	output += printHavingTreeSimple(hvg2, level);
        }
	    return output;
	}
	
	public static String printAggregate(HvgTreeElem hvg) {
		//indent level
		hvg = TreeFunctions.flattenAndOr(TreeFunctions.removeAndOr(hvg));
		String output = "";
		String connector = "";
		switch(hvg.getType()){
			case LOGICAL :
				output += hvg.toString();
				break;
			case AND :
			case OR :
				connector = " " + hvg.toString() + " ";
				break;
			default:		
		}
		int i = 0;
	    for(HvgTreeElem hvg2 : hvg.getChildElemSet()){	
        	if(i != 0)
        		output += connector;
	    	output += printAggregate(hvg2);
        }
	    return output;
	}
	
	public static HvgTreeElem removeAndOr(HvgTreeElem hvg) {
		////system.out.println(hvg.getType());
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		if((hvg.getType().equals(HavingType.OR) || hvg.getType().equals(HavingType.AND)) && hvg.getChildElemSet().size() == 1){
			return removeAndOr(hvg.getChildElem());
		}
		else{
			for(HvgTreeElem nChild : hvg.getChildElemSet()){
				nChildSet.add(removeAndOr(nChild));
			}
			hvg.setChildElemSet(nChildSet);
			return hvg;
		}
	}
	
	public static HvgTreeElem renameVars(HvgTreeElem hvg, Set<StarqlVar> boundVars, Map<StarqlVar, StarqlVar> renameMap) {
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		switch(hvg.getType()){
		case FORALL :
		case EXIST :
			Set<StarqlVar> nBoundSet = new HashSet<StarqlVar>();
			Set<StarqlVar> nBoundVars = new HashSet<StarqlVar>();
			//nBoundSet = hvg.getValBoundSet();
			for(StarqlVar nVar : hvg.getValBoundSet()){
				if(boundVars.contains(nVar)){
					nBoundSet.remove(nVar);
					nBoundSet.add(rename(nVar, boundVars));
					nBoundVars.add(rename(nVar, boundVars));
					renameMap.put(nVar, rename(nVar, boundVars));
					hvg.setValBoundSet(nBoundSet);
				}else{
					boundVars.add(nVar);
				}
			}	
			for(StarqlVar nVar : hvg.getIndBoundSet()){
				if(boundVars.contains(nVar)){
					
					nBoundSet.remove(nVar);
					nBoundSet.add(rename(nVar, boundVars));
					nBoundVars.add(rename(nVar, boundVars));
					
					renameMap.put(nVar, rename(nVar, boundVars));	
					
					hvg.setIndBoundSet(nBoundSet);
					
				}else{
					boundVars.add(nVar);
					
				}
				
			}	
			for(HvgTreeElem nChild : hvg.getChildElemSet())
				nChildSet.add(renameVars(nChild, boundVars, renameMap));
			hvg.setChildElemSet(nChildSet);
			return hvg;
		case LOGICAL :
			ArithmeticExpression first = ((Logical)hvg).getFirst();
			ArithmeticExpression second = ((Logical)hvg).getSecond();
			first = first.rename(renameMap);
			second = second.rename(renameMap);
			return new Logical(first, ((Logical)hvg).getSymbol(), second);
		case INDEXEDTRIPLE :
			////system.out.println("AAA "+boundVars);
			//for (Map.Entry entry : renameMap.entrySet()) {
			//    //system.out.println(entry.getKey() + ", " + entry.getValue());
			//}
			////system.out.println(((IndexedTriple)hvg).toString());
			IndexedTriple nITriple = new IndexedTriple();
			if(renameMap.containsKey(((IndexedTriple)hvg).getTime()))
				nITriple.setTime( new ResultTime( renameMap.get(((IndexedTriple)hvg).getTime())));
			else
				nITriple.setTime( new ResultTime(((IndexedTriple)hvg).getTime()));
			for(Triple nElem : ((IndexedTriple)hvg).getTriple()){
				for (Map.Entry entry : renameMap.entrySet()) {
				}
				if(renameMap.containsKey(nElem.getSubject())){
					nElem.setSubject(renameMap.get(nElem.getSubject()));
				}
				if(renameMap.containsKey(nElem.getPredicate())){
					nElem.setPredicate(renameMap.get(nElem.getPredicate()));
				}
				if(renameMap.containsKey(nElem.getObject())){
					nElem.setObject(renameMap.get(nElem.getObject()));
				}
				nITriple.addTriple(nElem);
			}
			return nITriple;
		default :
		for(HvgTreeElem nChild : hvg.getChildElemSet())
			nChildSet.add(renameVars(nChild, newSet(boundVars), newMap(renameMap)));
		hvg.setChildElemSet(nChildSet);
		return hvg;
		}
	}
	
	private static <T> Set<T> newSet(Set<T> elements) {
		Set<T> newSet = new HashSet<T>(elements);
		return newSet;
	}
	
	private static <T, U> Map<T, U> newMap(Map<T, U> elements) {
		Map<T, U> newMap = new HashMap<T, U>(elements);
		return newMap;
	}

	private static StarqlVar rename(StarqlVar nVar, Set<StarqlVar> boundVars) {
			StarqlVar var2 = new StarqlVar(nVar.getsType(), nVar.getText());
			while(boundVars.contains(var2)){
				var2.setText(var2.getText()+nVar.getText());
			}
		return var2;
	}

	public static HvgTreeElem doubleQuantor(HvgTreeElem hvg) {
		////system.out.println(hvg.getType());
		Set<StarqlVar> vals = new HashSet<StarqlVar>();
		Set<StarqlVar> inds = new HashSet<StarqlVar>();
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		if(hvg.getType().equals(HavingType.EXIST) && hvg.getChildElem().getType().equals(HavingType.EXIST)){
			inds.addAll(hvg.getIndBoundSet());
			inds.addAll(hvg.getChildElem().getIndBoundSet());
			vals.addAll(hvg.getValBoundSet());
			vals.addAll(hvg.getChildElem().getValBoundSet());
			hvg.getChildElem().setIndBoundSet(inds);
			hvg.getChildElem().setValBoundSet(vals);
			return doubleQuantor(hvg.getChildElem());
		}
		if(hvg.getType().equals(HavingType.FORALL) && hvg.getChildElem().getType().equals(HavingType.FORALL)){
			inds.addAll(hvg.getIndBoundSet());
			inds.addAll(hvg.getChildElem().getIndBoundSet());
			vals.addAll(hvg.getValBoundSet());
			vals.addAll(hvg.getChildElem().getValBoundSet());
			hvg.getChildElem().setIndBoundSet(inds);
			hvg.getChildElem().setValBoundSet(vals);
			return doubleQuantor(hvg.getChildElem());
		}
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			nChildSet.add(doubleQuantor(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;
	}
	
	public static HvgTreeElem flattenAndOr(HvgTreeElem hvg) {
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		if(hvg.getType().equals(HavingType.OR) ){
			for(HvgTreeElem nChild : hvg.getChildElemSet()){
				if(nChild.getType().equals(HavingType.OR)){
					for(HvgTreeElem nNChild : nChild.getChildElemSet())
						nChildSet.add(nNChild);
					nChildSet.addAll(hvg.getChildElemSet());
					nChildSet.remove(nChild);
					hvg.setChildElemSet(nChildSet);
					return flattenAndOr(hvg);
				}
			}
			
		}
		////system.out.println("Suche And in: "+hvg.getType());
		if(hvg.getType().equals(HavingType.AND) ){
			////system.out.println("Erstes And erkannt: ");
			for(HvgTreeElem nChild : hvg.getChildElemSet()){
				if(nChild.getType().equals(HavingType.AND)){
					////system.out.println("Zweites And erkannt: ");
					for(HvgTreeElem nNChild : nChild.getChildElemSet())
						nChildSet.add(nNChild);
					nChildSet.addAll(hvg.getChildElemSet());
					nChildSet.remove(nChild);
					hvg.setChildElemSet(nChildSet);					
					return flattenAndOr(hvg);
				}
			}
		}
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			////system.out.println("Starte neu: "+nChild.getType());
			nChildSet.add(flattenAndOr(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;			
	}
	
	public static HvgTreeElem addNextElem(HvgTreeElem hvgChild, HvgTreeElem hvg) {
		HvgTreeElem nElem = null;
		switch(hvgChild.getType()){
		case OR :
			nElem = new HavingOr();
		case AND :
			nElem = new HavingAnd();
		case NOT :
			nElem = new NotElem();
			break;
		case IF :
			nElem = new IfTreeElem();
			break;
		case FORALL :
			nElem = new Quantor(((Quantor) hvgChild).getType(), ((Quantor) hvgChild).getBoundIndSet(), ((Quantor) hvgChild).getBoundValSet());
			break;
		case EXIST :
			nElem = new Quantor(((Quantor) hvgChild).getType(), ((Quantor) hvgChild).getBoundIndSet(), ((Quantor) hvgChild).getBoundValSet());
			break;
		case LOGICAL :
			nElem = new Logical(((Logical)hvgChild).getFirst(), ((Logical)hvgChild).getSymbol(), ((Logical)hvgChild).getSecond());
			break;
		case INDEXEDTRIPLE :
			nElem = new IndexedTriple(((IndexedTriple)hvgChild).getTriple(), new ResultTime(((IndexedTriple)hvgChild).getTime().toString()));
			break;
		default :
		}
		for(HvgTreeElem nChild : hvgChild.getChildElemSet())
			addNextElem(nChild, nElem);
		if(hvg == null)
			hvg = nElem;
		else
			hvg.addChildElem(nElem);
		return hvg;
	}
	
	public static HvgTreeElem copyTree(HvgTreeElem hvg){
		return addNextElem(hvg, null);
	}
	
	public static HvgTreeElem forToExist(HvgTreeElem hvg){
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		if(hvg.getType().equals(HavingType.FORALL) ){
			for(HvgTreeElem nChild : hvg.getChildElemSet()){
				nChildSet.add(forToExist(nChild));
			}
			HvgTreeElem nElem = new NotElem();
			HvgTreeElem nElem1 = new NotElem();
			HvgTreeElem nElem2 = new Quantor(HavingType.EXIST, ((Quantor) hvg).getBoundIndSet(), ((Quantor) hvg).getBoundValSet());
			nElem1.setChildElemSet(nChildSet);
			nElem2.addChildElem(nElem1);
			nElem.addChildElem(nElem2);
			return nElem;
		}
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			nChildSet.add(forToExist(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;		
	}
	
	public static HvgTreeElem pushNot(HvgTreeElem hvg){
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		if(hvg.getType().equals(HavingType.NOT) ){
			switch(hvg.getChildElem().getType()){
				case AND :
					////system.out.println("AND gefunden ");
					HvgTreeElem orElem = new HavingOr();
					for(HvgTreeElem hvgElem : hvg.getChildElem().getChildElemSet()){
						HvgTreeElem notElem = new NotElem();
						notElem.addChildElem(hvgElem);
						orElem.addChildElem(pushNot(notElem));
					}
					return orElem;
				case OR :
					HvgTreeElem andElem = new HavingAnd();
					for(HvgTreeElem hvgElem : hvg.getChildElem().getChildElemSet()){
						HvgTreeElem notElem = new NotElem();
						notElem.addChildElem(hvgElem);
						andElem.addChildElem(pushNot(notElem));
					}
					return andElem;
				case NOT :
					return pushNot(hvg.getChildElem().getChildElem());
				case EXIST :
					HvgTreeElem notElem = new NotElem();
					notElem.addChildElem(pushNot(hvg.getChildElem()));
					return notElem;
				case FORALL :
					HvgTreeElem notElem2 = new NotElem();
					notElem2.addChildElem(pushNot(hvg.getChildElem()));
					return notElem2;
				case LOGICAL :
					//system.out.println("Negiere: "+((Logical)hvg.getChildElem()).toString());
					//system.out.println("Negiert: "+((Logical)hvg.getChildElem()).negate().toString());
					return ((Logical)hvg.getChildElem()).negate();
				case INDEXEDTRIPLE :
					return hvg;
				default :
			}
			return hvg;
		}
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			nChildSet.add(pushNot(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;		
	}
	
	public static HvgTreeElem pushIntoOr(HvgTreeElem hvg){
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		Set<HvgTreeElem> orChildSet = new HashSet<HvgTreeElem>();
		HvgTreeElem andChild = new HavingAnd();
		////system.out.println("Gefunden: "+hvg.getType());
		if(hvg.getType().equals(HavingType.AND) ){
			for(HvgTreeElem nElem : hvg.getChildElemSet()){
				if(nElem.getType().equals(HavingType.OR)){
					orChildSet.addAll(pushIntoOr(nElem).getChildElemSet());
				}else{
					andChild.addChildElem(pushIntoOr(nElem));	
				}
			}
			
			if(!orChildSet.isEmpty()){
				HvgTreeElem nOrElem = new HavingOr(); // new top Or Elem
				for(HvgTreeElem orElem : orChildSet){ // walk through old ORs
					HvgTreeElem nAndElem = new HavingAnd(); // new AND
					nAndElem.addChildElemSet(andChild.getChildElemSet());
					////system.out.println("andChildSetA "+ andChildSet.size() + " nAndElemA " + nAndElem.getChildElemSet().size());
					nAndElem.addChildElem(orElem);
					////system.out.println("andChildSetB "+ andChildSet.size() + " nAndElemB " + nAndElem.getChildElemSet().size());
					nOrElem.addChildElem(nAndElem);	
				}
				return nOrElem;
			}
		}
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			nChildSet.add(pushIntoOr(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;	
	}
	
	public static HvgTreeElem pushIntoQuantifier(HvgTreeElem hvg){
		////system.out.println("wird untersucht: "+hvg.getType());
		Set<HvgTreeElem> nSafeChildSet = new HashSet<HvgTreeElem>();
		Set<HvgTreeElem> nUnSafeChildSet = new HashSet<HvgTreeElem>();
		if(hvg.getType().equals(HavingType.AND)){
			for(HvgTreeElem nElem : hvg.getChildElemSet()){
				if((nElem.getType().equals(HavingType.EXIST) | nElem.getType().equals(HavingType.FORALL)) && !nElem.getUnSafeVars().getVars().isEmpty()){
					for(StarqlVar unsafeVar : nElem.getUnSafeVars().getVars()){
						//system.out.println("Unsafe Element: "+nElem.getType());
						//printHavingTree(nElem, 1);
						nUnSafeChildSet.add(nElem);
						for(HvgTreeElem nSafeElem : hvg.getChildElemSet()){
							if(equals(nSafeElem, nElem))
								continue;
							if(nSafeElem.getSafeVars().getVars().contains(unsafeVar)){
								//system.out.println("Kommt hinzu: "+nSafeElem.getType());
								//printHavingTree(nSafeElem, 1);
								nElem.addChildElem(pushIntoQuantifier(nSafeElem));
							}else{
								//system.out.println("Kommt nicht hinzu: "+nSafeElem.getType());
								//printHavingTree(nSafeElem, 1);
								nSafeChildSet.add(pushIntoQuantifier(nSafeElem));
							}
						}
					}
					break;
				}
			}
			if(!nSafeChildSet.isEmpty() || !nUnSafeChildSet.isEmpty()){
				hvg.setChildElemSet(nSafeChildSet);
				hvg.addChildElemSet(nUnSafeChildSet);
				return pushIntoQuantifier(hvg);
			}//TODO Check also other elements for unsafety. 
			
		}
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			nChildSet.add(pushIntoQuantifier(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;	
	}
	
	public static HvgTreeElem pushIntoNegQuantifier(HvgTreeElem hvg){
		////system.out.println("wird untersucht: "+hvg.getType());
		Set<HvgTreeElem> nSafeChildSet = new HashSet<HvgTreeElem>();
		Set<HvgTreeElem> nUnSafeChildSet = new HashSet<HvgTreeElem>();
		if(hvg.getType().equals(HavingType.AND)){
			for(HvgTreeElem nElem : hvg.getChildElemSet()){
				if(nElem.getType().equals(HavingType.NOT) && (nElem.getChildElem().getType().equals(HavingType.EXIST) | nElem.getChildElem().getType().equals(HavingType.FORALL)) && !nElem.getUnSafeVars().getVars().isEmpty()){
					for(StarqlVar unsafeVar : nElem.getChildElem().getUnSafeVars().getVars()){
						//system.out.println("Unsafe Element: "+nElem.getType());
						//printHavingTree(nElem, 1);
						nUnSafeChildSet.add(nElem);
						for(HvgTreeElem nSafeElem : hvg.getChildElemSet()){
							if(equals(nSafeElem, nElem))
								continue;
							if(nSafeElem.getSafeVars().getVars().contains(unsafeVar)){
								//system.out.println("Kommt hinzu: "+nSafeElem.getType());
								//printHavingTree(nSafeElem, 1);
								nElem.getChildElem().addChildElem(pushIntoQuantifier(nSafeElem));
							}
							nSafeChildSet.add(pushIntoQuantifier(nSafeElem));
						}
					}
					break;
				}
			}
			if(!nSafeChildSet.isEmpty() || !nUnSafeChildSet.isEmpty()){
				hvg.setChildElemSet(nSafeChildSet);
				hvg.addChildElemSet(nUnSafeChildSet);
				return pushIntoQuantifier(hvg);
			}//TODO Check also other elements for unsafety. 
		}
		Set<HvgTreeElem> nChildSet = new HashSet<HvgTreeElem>();
		for(HvgTreeElem nChild : hvg.getChildElemSet()){
			nChildSet.add(pushIntoQuantifier(nChild));
		}
		hvg.setChildElemSet(nChildSet);
		return hvg;	
	}

	public static Boolean equals(HvgTreeElem hvg1, HvgTreeElem hvg2){
		//system.out.println("alter Baum: " + printHavingTreeSimple(hvg2, 1));
		//system.out.println("neuer Baum: " + printHavingTreeSimple(pushNot(hvg1), 1));
		if(printHavingTreeSimple(hvg1, 1).toString().equals(printHavingTreeSimple(hvg2, 1).toString()))
			return true;
		return false;
	}
	
	private static HvgTreeElem flattening(HvgTreeElem hvg) {
		hvg = flattenAndOr(hvg);
		hvg = doubleQuantor(hvg);
		return hvg;
	}
	
	public static HvgTreeElem allFuncs(HvgTreeElem hvg) {
		hvg = removeAndOr(hvg);
		//rewrite rules for SRNF
		hvg = forToExist(hvg);
		////system.out.println("fortoexist");
		//printHavingTree(hvg,1);
		hvg = pushNot(hvg);		
		////system.out.println("pushnot");
		//printHavingTree(hvg,1);
		hvg = flattening(hvg);
		////system.out.println("flattening");
		//printHavingTree(hvg,1);
		//rewrite rules for RANF
		hvg = pushIntoOr(hvg);
		////system.out.println("pushintoor");
		//printHavingTree(hvg,1);
		hvg = pushIntoQuantifier(hvg);
		////system.out.println("pushintoq");
		//printHavingTree(hvg,1);
		hvg = pushIntoNegQuantifier(hvg);
		////system.out.println("pushintoneg");
		hvg = renameVars(hvg, new HashSet<StarqlVar>(), new HashMap<StarqlVar,StarqlVar>());
		hvg = removeAndOr(hvg);
		//printHavingTree(hvg,1);
		return hvg;
	}
}
