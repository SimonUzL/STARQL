/**
 * Unfolding of HavingTree
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Multiset;

import de.uzl.ifis.starql.query.Stream;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.*;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;


public class HavingTreeWalkerSpark extends HavingTreeWalker{
	
	
	public HavingTreeWalkerSpark(Stream strm, Unfolder unf, StarqlTransformator starqlTrans){
	
		super(strm, unf, starqlTrans);
		
		}
	
	public String getHavingString(HvgTreeElem hElem, Boolean noConstraints){
		System.out.print("-"+hElem.getType().toString());
		String str = "";
		if(hElem == null){
			return str;
		}
		switch(hElem.getType()){
		case OR:
			Set<String> sSet = new HashSet<String>();
			for(HvgTreeElem tElem : hElem.getChildElemSet())
				sSet.add(getHavingString(tElem, noConstraints));
			str += 	"\r\nSELECT * FROM(\r\n"+HelperFunctions.getSetAsString(sSet, true, "\r\nUNION\r\n").replaceAll("(?m)^", "\t") + "\r\n) SUB_UNION";
			break;		
		case EXIST: 
			Set<StarqlVar> unbound = hElem.getUnboundIndex();
			unbound.addAll(hElem.getUnboundValues());
			str += "SELECT wid";
			for(StarqlVar var : unbound){	
				str += ", "+var.toStringSQL();
			}
			str += " FROM (\r\n";
			str += 	getHavingString(hElem.getChildElem(), noConstraints).replaceAll("(?m)^", "\t");
			str += "\r\n) SUB_QVIEW"; //
			break;
		case NOT:
			str += 	"\r\n("+getHavingString(hElem.getChildElem(), true).replaceAll("(?m)^", "\t") + "\r\nEXCEPT\r\n" + getHavingString(hElem.getChildElem(), noConstraints).replaceAll("(?m)^", "\t") + "\r\n) SUB_EXCEPT";
			break;
		case AND:					
			Set<Logical> logicals = new HashSet<Logical>();
			Set<HvgTreeElem> others = new HashSet<HvgTreeElem>();
			for(HvgTreeElem htElem : ((HavingAnd)hElem).getChildElemSet()){
				if(htElem.getType().equals(HavingType.LOGICAL))
					logicals.add((Logical)htElem);
				else
					others.add(htElem);
			}
			HvgTreeElem currElem = null;
			if(!logicals.isEmpty()){
				currElem = logicals.iterator().next();
				logicals.remove(currElem);
			}
			else{
				currElem = others.iterator().next();
				others.remove(currElem);
			}
			
			HvgTreeElem newAnd = new HavingAnd();
			HvgTreeElem nextElem = null;
			for(Logical logical : logicals)
				newAnd.addChildElem(logical);
			for(HvgTreeElem other : others)
				newAnd.addChildElem(other);
			if(newAnd.getChildElemSet().size() > 1)
				nextElem = 	newAnd;
			else 
				nextElem = 	newAnd.getChildElem();
			switch(currElem.getType()){
				case LOGICAL:
					ArithmeticExpression firstVar = ((Logical)currElem).getFirst();
					ArithmeticExpression secondVar = ((Logical)currElem).getSecond();
					if(((Logical)currElem).getSymbol().equals("=") 
							&& (firstVar.isType() == StarqlVarType.VALUE && firstVar.isSingleVar()) 
							&& (secondVar.isType() == StarqlVarType.VALUE && firstVar.isSingleVar())){
						if(!(firstVar.equals(secondVar))){
							if(nextElem.getUnboundValues().containsAll(firstVar.getUnboundValues())){
								if(nextElem.getUnboundValues().containsAll(secondVar.getUnboundValues())){
									str += "SELECT * FROM(\r\n"+ getHavingString(nextElem, noConstraints).replaceAll("(?m)^", "\t") +"\r\n)SUB";
								}else{
									str = "SELECT * FROM(\r\n"+ getHavingString(nextElem, noConstraints) + "\r\nNATURAL JOIN \r\n"+ "SELECT *, "+firstVar.toString()+ " AS "+secondVar.toString()+" FROM " + getHavingString(nextElem, noConstraints) +"\r\n)SUB";
								}
								
							}else{
								if(nextElem.getUnboundValues().contains(secondVar))
									str = "SELECT * FROM(\r\n"+ getHavingString(nextElem, noConstraints) + "\r\nNATURAL JOIN \r\n"+ "SELECT *, "+secondVar.toString()+ " AS "+firstVar.toString()+" FROM " + getHavingString(nextElem, noConstraints) +"\r\n)SUB";
							}
						}
					}else{
						str += "SELECT * FROM(\r\n"+ getHavingString(nextElem, noConstraints).replaceAll("(?m)^", "\t") +"\r\n)SUB";
					}
					if(!noConstraints)
						str += " WHERE "+((Logical)currElem).toStringSQL();
					break;
				case NOT:
					if(nextElem.getUnboundValues().equals(currElem.getUnboundValues())){
						str +=  getHavingString(nextElem, true) + " EXCEPT " + getHavingString(currElem, noConstraints);
					}else{
						if(nextElem.getUnboundValues().contains(currElem.getUnboundValues()))
							str +=  getHavingString(nextElem, true) + " EXCEPT (" + getHavingString(nextElem, noConstraints) + "\r\nNATURAL JOIN \r\n" + getHavingString(currElem, noConstraints) +")";
					}
					break;
				default:
					str += "(\r\n" + getHavingString(nextElem, noConstraints).replaceAll("(?m)^", "\t") + "\r\n)SUBJOIN1\r\nNATURAL JOIN \r\n" + "(\r\n" + getHavingString(currElem, noConstraints).replaceAll("(?m)^", "\t") + "\r\n)SUBJOIN2";
					
			}
			
			break;
		case LOGICAL:
			str += 	" UNEXPECTEDLOGICAL: "+hElem.toString() + " ";
			break;
		case INDEXEDTRIPLE:
			//str += 	" UNFOLDING OF: "+hElem.toString() + " ";
			Set<String> tmpSet = new HashSet<String>();		
			tmpSet.add( "SELECT * FROM(\r\n" + getUnf().unfoldDirectSpark(((IndexedTriple)hElem), ((IndexedTriple)hElem).getTime(), true, getStrm().getFrom().getList()).replaceAll("(?m)^", "\t") + "   ) SUB_TRIPLE"+getnextOntopStrm()); 
			////system.out.println(tmpSet);
			str += HelperFunctions.getSetAsString(tmpSet, true, "\r\nNATURAL JOIN \r\n");
			break;
		default:				
			str += 	getHavingString(hElem.getChildElem(), noConstraints);
		}
		return str;
	}
}

