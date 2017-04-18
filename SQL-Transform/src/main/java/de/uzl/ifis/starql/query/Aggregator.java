package de.uzl.ifis.starql.query;

import java.util.ArrayList;

import  de.uzl.ifis.starql.query.having.StarqlVar;
import  de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;

public class Aggregator {
	private String aggType = "";
	private ArrayList<String> columns = new ArrayList<String>();
	
	
	public String getName(){
		return "_agg_"+ getAggType() + getColumns().toString().substring(1, getColumns().toString().length()-1).replace(", ", "");
	}
	public String getAggType() {
		return aggType;
	}

	public void setAggType(String aggType) {
		this.aggType = aggType;
	}

	public ArrayList<String> getColumns() {
		return columns;
	}
	
	public ArrayList<StarqlVar> getColumnsAsVar() {
		ArrayList<StarqlVar> vars = new ArrayList<StarqlVar>();
		for(String str : getColumns()){
			vars.add(new StarqlVar(StarqlVarType.VALUE, str.substring(1)));
		}
		return vars;
	}

	public void addColumns(String columns) {
		this.columns.add(columns);
	}

	public Aggregator(String aggType){
		setAggType(aggType);
	}
	public Aggregator(){
		
	}
}
