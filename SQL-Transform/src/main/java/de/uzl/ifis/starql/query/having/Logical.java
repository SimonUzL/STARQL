package de.uzl.ifis.starql.query.having;

import java.util.HashSet;
import java.util.Set;

import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;

public class Logical extends HvgTreeElem{
private ArithmeticExpression first = null;
private ArithmeticExpression second = null;
private String symbol = "";
	
	public ArithmeticExpression getFirst() {
		return first;
	}
	public void setFirst(ArithmeticExpression first) {
		this.first = first;
	}
	public ArithmeticExpression getSecond() {
		return second;
	}
	public void setSecond(ArithmeticExpression second) {
		this.second = second;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Logical(ArithmeticExpression first, String symbol, ArithmeticExpression second){
		super(HavingType.LOGICAL);
		setFirst(first);
		setSymbol(symbol);
		setSecond(second);
		if(!(first.isType() == StarqlVarType.RDFLITERAL && !(second.isType() == StarqlVarType.AMBIGIOUS)
				|| second.isType() == StarqlVarType.RDFLITERAL && !(first.isType() == StarqlVarType.AMBIGIOUS)
				|| first.isType() == StarqlVarType.VALUE && first.isType() == StarqlVarType.VALUE
				|| first.isType() == StarqlVarType.INDEX && first.isType() == StarqlVarType.INDEX))		
				System.out.println("ERROR: You mixed up indizes and values in: " + this.toString());
	}
	
	public HashSet<StarqlVar> getUnboundValues(){		
		HashSet<StarqlVar> hs = new  HashSet<StarqlVar>();		
		hs.addAll(first.getUnboundValues());
		hs.addAll(second.getUnboundValues());
		return hs;
	}
	
	public HashSet<StarqlVar> getUnboundIndex(){
		HashSet<StarqlVar> hs = new  HashSet<StarqlVar>();
		hs.addAll(first.getUnboundIndexes());
		hs.addAll(second.getUnboundIndexes());		
		return hs;
	}
	
	public Set<Logical> getLowerLogicals(Boolean quantor){		
		logicals.add(this);
		return logicals;
	}
	
	public String toString(){
		return first.toString() + " " + symbol + " " + second.toString();
	}
	
	public String toStringSQL(){
		return first.toString() + " " + symbol + " " + second.toString();
	}
	
	@Override
	public SafeVars getUnSafeVars(){	
		SafeVars sv = new SafeVars();
		sv.setVars(getUnboundIndex());
		sv.setVars(getUnboundValues());
		return sv;
	}
	
	@Override
	public SafeVars getSafeVars(){	
		SafeVars sv = new SafeVars();
		if(getSymbol().equals("=") && getFirst().isSingleVar() && getSecond().isSingleVar()){
			sv.addEqui(getFirst().getVar(),getSecond().getVar());
			sv.addEqui(getSecond().getVar(),getFirst().getVar());
		}
		return sv;
	}
	
	public Logical negate(){
		if(getSymbol().equals("<")){
			setSymbol(">=");
			return this;
		}
		if(getSymbol().equals(">")){
			setSymbol("<=");
			return this;
		}
		if(getSymbol().equals("=")){
			setSymbol("!=");
			return this;
		}
		if(getSymbol().equals("!=")){
			setSymbol("=");
			return this;
		}
		if(getSymbol().equals(">=")){
			setSymbol("<");
			return this;
		}
		if(getSymbol().equals("<=")){
			setSymbol(">");
			return this;
		}
		return this;
	}
}
