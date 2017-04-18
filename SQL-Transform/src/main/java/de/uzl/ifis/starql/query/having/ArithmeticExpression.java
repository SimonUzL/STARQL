package de.uzl.ifis.starql.query.having;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;

public class ArithmeticExpression {
	ArrayList<StarqlVar> vars = new ArrayList<StarqlVar>();
	String arithString = "";
	public ArrayList<StarqlVar> getVars() {
		return vars;
	}
	public void addVar(StarqlVar var) {
		this.vars.add(var);
	}
	
	public Boolean isSingleVar(){
		if(vars.size() == 1)
			return true;
		return false;
	}
	
	public StarqlVarType isType(){
		StarqlVarType tType = null;
		for(StarqlVar sVar : vars)
			if(sVar.getsType().equals(StarqlVarType.INDEX))
				tType = StarqlVarType.INDEX;
		for(StarqlVar sVar : vars)
			if(sVar.getsType().equals(StarqlVarType.VALUE)){
				if(tType == null || tType == StarqlVarType.VALUE)
					tType = StarqlVarType.VALUE;
				else
					tType = StarqlVarType.AMBIGIOUS;
			}
		if(tType == null)
			tType = StarqlVarType.RDFLITERAL;
		return tType;
	}
	
	public Set<StarqlVar> getUnboundValues(){
		Set<StarqlVar> returnSet = new HashSet<StarqlVar>();
		for(StarqlVar sVar : vars)
			if(sVar.getsType().equals(StarqlVarType.VALUE))
				returnSet.add(sVar);
		return returnSet;
	}
	
	public Set<StarqlVar> getUnboundIndexes(){
		Set<StarqlVar> returnSet = new HashSet<StarqlVar>();
		for(StarqlVar sVar : vars)
			if(sVar.getsType().equals(StarqlVarType.INDEX))
				returnSet.add(sVar);
		return returnSet;
	}
	
	public StarqlVar getVar(){
		return vars.iterator().next();
	}
	
	public ArithmeticExpression rename(Map<StarqlVar, StarqlVar> renameMap){
		for(StarqlVar sVar : vars){
			if(renameMap.containsKey(sVar)){
				vars.remove(sVar);
				vars.add(renameMap.get(sVar));
				setString(toString().replaceAll(sVar.toStringSQL(), renameMap.get(sVar).toStringSQL()));
			}
		}
		return this;
	}
	
	public void addVars(List<StarqlVar> var) {
		this.vars.addAll(var);
	}
	
	public String toString() {
		return arithString;
	}
	public void setString(String arithString) {
		this.arithString = arithString;
	}
	
	public ArithmeticExpression(){
		
	}
}
