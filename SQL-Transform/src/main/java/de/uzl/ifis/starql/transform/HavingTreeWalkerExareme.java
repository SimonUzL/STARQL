/**
 * Unfolding of HavingTree
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import net.sf.jsqlparser.JSQLParserException;

import com.google.common.collect.Multiset;
import com.google.common.collect.ConcurrentHashMultiset;

import de.uzl.ifis.starql.query.Stream;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.*;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;

public class HavingTreeWalkerExareme {
	private HvgTreeElem hvg = null; //having tree of the current stream
	private boolean firstFA = true; 
	private boolean firstEx = true;
	private Unfolder unf = null; 
	private String source = "";
	private String hvgString = "";
	Unfolding unfold = new Unfolding();
	private Set<String> constraints = new HashSet<String>();
	private Set<String> localConstraints = new HashSet<String>();
	private Set<String> localSource = new HashSet<String>();
	private Stream strm = null;
	private StarqlTransformator starqlTrans = null;
	private Multiset<StarqlVar> tripleVars = null;
	private Multiset<StarqlVar> tripleVars2 = null;
	private int subNum = 0;
	private int ontopStrm = 0;
	private String subName = "";
	private Set<StarqlVar> freeVars = null;
	private Set<StarqlVar> freeIndexes = null;
	
	public Set<StarqlVar> getFreeVars() {
		return freeVars;
	}

	public Set<StarqlVar> getFreeIndexes() {
		return freeIndexes;
	}

	public int getOntopStrm() {
		return ontopStrm;
	}

	private List<String> subStreams = new ArrayList<String>();
	private List<String> ontopSubStreams = new ArrayList<String>();
	
	private String createSubStream(HvgTreeElem treeElem, Boolean base){
		subNum++;
		int num = subNum;
		String str = "";
		str += "CREATE STREAM " + subName + subNum + " AS WCACHE\r\n";
		if(base){
			str += getHavingString(treeElem, true);
		}
		else
			str += getHavingString(treeElem, false);
		subStreams.add(str+";\r\n");
		return subName+num;
	}
	
	public List<String> getSubStreams() {
		return subStreams;
	}
	public List<String> getOntopSubStreams() {
		return ontopSubStreams;
	}
	
	public Set<String> getConstraints() {
		return constraints;
	}
	public HavingTreeWalkerExareme(Stream strm, Unfolder unf, StarqlTransformator starqlTrans){
		this.starqlTrans = starqlTrans;
		this.strm = strm;
		subName = strm.getName() + "_sub";
		if(strm.getHvg() != null)
			this.hvg = strm.getHvg();
		this.unf = unf;
		source = strm.getName()+"_joined";
		hvgString = generateString();
		if(strm.getHvg() != null){
			freeVars = hvg.getUnboundValues();
			freeIndexes = hvg.getUnboundIndex();
		}
	}
	public String generateString(){
		
		if(hvg == null)
			return null;
		else{
			return getHavingString(hvg, false).replaceAll("(?m)^", "\t");	
		}
	}
	
	public String getString(){
		return hvgString;
	}

	public Boolean isBoolean(){
		if(!hvg.getUnboundValues().isEmpty())
			return false;
		else return true;
	}
	
	public Boolean isNegated(){
		if(!hvg.getType().equals(HavingType.NOT))
			return false;
		else return true;
	}
		
	private String getHavingString(HvgTreeElem hElem, Boolean noConstraints){
		//System.out.print("-"+hElem.getType().toString());
		String str = "";
		if(hElem == null){
			return str;
		}
		switch(hElem.getType()){
		case OR:
			Set<String> sSet = new HashSet<String>();
			for(HvgTreeElem tElem : hElem.getChildElemSet())
				sSet.add(createSubStream(tElem, noConstraints));
			str += 	"\r\nSELECT * FROM (mergeunion '"+ HelperFunctions.getSetAsString(sSet, true, ",") + "') SUB_UNION";
			break;		
		case EXIST: 
			Set<StarqlVar> unbound = hElem.getUnboundIndex();
			unbound.addAll(hElem.getUnboundValues());
			str += "SELECT wid";
			for(StarqlVar var : unbound){	
				str += ", "+var.toStringSQL();
			}
			str += " FROM(\r\n";
			str += 	getHavingString(hElem.getChildElem(), noConstraints).replaceAll("(?m)^", "\t");
			str += "\r\n) SUB_QVIEW";
			break;
		case NOT:
			str += 	"\r\nSELECT * FROM (streamexcept '"+createSubStream(hElem.getChildElem(), true) + ", " + createSubStream(hElem.getChildElem(), noConstraints) + "') SUB_EXCEPT";
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
							if(nextElem.getUnboundValues().contains(firstVar)){
								if(nextElem.getUnboundValues().contains(secondVar)){
									str += "Select * FROM (\r\n"+ getHavingString(nextElem, noConstraints).replaceAll("(?m)^", "\t") +"\r\n) SUB_QVIEW ";
								}else{
									str = "Select * FROM (\r\n"+ getHavingString(nextElem, noConstraints) + " NATURAL JOIN \r\n"+ "SELECT *, "+firstVar.toString()+ " AS "+secondVar.toString()+" FROM " + getHavingString(nextElem, noConstraints) +"\r\n) SUB_QVIEW ";
								}
								
							}else{
								if(nextElem.getUnboundValues().contains(secondVar))
									str = "Select * FROM (\r\n"+ getHavingString(nextElem, noConstraints) + " NATURAL JOIN \r\n"+ "SELECT *, "+secondVar.toString()+ " AS "+firstVar.toString()+" FROM " + getHavingString(nextElem, noConstraints) +"\r\n) SUB_QVIEW ";
							}
						}
					}else{
						str += "Select * FROM (\r\n"+ getHavingString(nextElem, noConstraints).replaceAll("(?m)^", "\t") +"\r\n) SUB_QVIEW ";
					}
					if(!noConstraints)
						str += " WHERE "+((Logical)currElem).toStringSQL();
					break;
				case NOT:
					if(nextElem.getUnboundValues().equals(currElem.getUnboundValues())){
						str +=  "\r\nSELECT * FROM (streamexcept '"+createSubStream(nextElem, true) + ", " + createSubStream(currElem.getChildElem(), noConstraints) + "') SUB_EXCEPT";
					}else{
						if(nextElem.getUnboundValues().contains(currElem.getUnboundValues()))
							str +=  getHavingString(nextElem, true) + " EXCEPT (" + getHavingString(nextElem, noConstraints) + " NATURAL JOIN \r\n" + getHavingString(currElem.getChildElem(), noConstraints) +")";
					}
					break;
				default:
					str += "("+ getHavingString(nextElem, noConstraints) + "\r\n) AS A \r\nNATURAL JOIN \r\n (" + getHavingString(currElem, noConstraints) + "\r\n) AS B";		
			}
			break;
		case LOGICAL:
			str += 	" UNEXPECTEDLOGICAL: "+hElem.toString() + " ";
			break;
		case INDEXEDTRIPLE:
			//str += 	" UNFOLDING OF: "+hElem.toString() + " ";		
				str +="("+unf.unfoldDirect((IndexedTriple)hElem, ((IndexedTriple)hElem).getTime(), true, strm.getFrom().getList())+") SUB_TRIPLE"; 
			break;
		default:				
			////system.out.println("Next is: "+ ((Having)hElem).getType());	
			str += 	getHavingString(hElem.getChildElem(), noConstraints);
		}
		return str;
	}
}
