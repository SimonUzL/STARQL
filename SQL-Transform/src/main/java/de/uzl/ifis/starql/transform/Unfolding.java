/**
 * Unfolding of tripel
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Unfolding {
	private String resColumn = "";
	private String targetColumn = "";
	
	public String getTargetColumn() {
		return targetColumn;
	}
	
	public void setTargetColumn(String targetColumn) {
		this.targetColumn = targetColumn;
	}
	
	private String selStmt = "";

	public String getSelStmt() {
		return selStmt;
	}
	public void setWhereConstraints(Set<String> whereConstraints) {
		this.whereConstraints = whereConstraints;
	}
	public void setSelStmt(String selStmt) {
		this.selStmt = selStmt;
	}
	private Set<String> whereConstraints = new HashSet<String>();
	private Boolean isDynamic = false;
	private Boolean isStatic = false;
	
	public Boolean isStatic() {
		return isStatic;
	}
	public void setStatic(Boolean isStatic) {
		this.isStatic = isStatic;
	}
	public String getTable(){
		String str = "";
		if(getResColumn().contains(".")){
			////system.out.println(getResColumn());
			str = getResColumn().split("\\.")[0];
		}
		return str;
	}
	public String getResColumn() {
		return resColumn;
	}
	public void setResColumn(String resColumn) {
		this.resColumn = resColumn;
	}
	
	public Set<String> getWhereConstraints() {
		return whereConstraints;
	}
	public void addConstraint(String constraint){
		whereConstraints.add(constraint);		
	}
	public void addConstraint(Set<String> constraint){
		whereConstraints.addAll(constraint);		
	}
	public Boolean isDynamic(){
		return this.isDynamic;
	}
	
	public void setDynamic(Boolean dyn){
		isDynamic = dyn;
	}
	public Unfolding(){
		
	}
}
