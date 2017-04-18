package de.uzl.ifis.starql.query.base;

import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;



public class ResultTime {
	private Boolean floor = false;
	private int multiplyA = 1;
	private int multiplyB = 1;
	private StarqlVar nowVal = null;
	public StarqlVar getNowVal() {
		return this.nowVal;
	}
	public void setNowVal(String varText) {
		this.nowVal = new StarqlVar(StarqlVarType.INDEX, varText);
	}
	public void setNowVal(StarqlVar var) {
		this.nowVal = var;
	}
	public ResultTime(String time){		
		setNowVal(time);
	}
	
	public ResultTime(StarqlVar time){		
		setNowVal(time);
	}
	
	public Boolean getFloor() {
		return floor;
	}
	public void setFloor(Boolean floor) {
		this.floor = floor;
	}
	public int getMultiplyA() {
		return multiplyA;
	}
	public void setMultiplyA(int multiplyA) {
		this.multiplyA = multiplyA;
	}
	public int getMultiplyB() {
		return multiplyB;
	}
	public void setMultiplyB(int multiplyB) {
		this.multiplyB = multiplyB;
	}
}
