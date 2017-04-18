package de.uzl.ifis.starql.query.having;

public class IfTreeElem extends HvgTreeElem {
	private HvgTreeElem ifElem = null;
	private HvgTreeElem thenElem = null;
	
	public HvgTreeElem getThenElem() {
		return thenElem;
	}

	public void setThenElem(HvgTreeElem thenElem) {
		this.thenElem = thenElem;
	}

	public HvgTreeElem getIfElem() {
		return ifElem;
	}
	
	public void setIfElem(HvgTreeElem ifElem) {
		this.ifElem = ifElem;
	}
	public IfTreeElem(){
		super(HavingType.IF);
	}
}

