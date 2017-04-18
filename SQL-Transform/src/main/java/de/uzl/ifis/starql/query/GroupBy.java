package de.uzl.ifis.starql.query;

import java.util.ArrayList;
import java.util.List;

import de.uzl.ifis.starql.query.having.*;

public class GroupBy {
	private List<StarqlVar> grpVars = new ArrayList<StarqlVar>();

	public List<StarqlVar> getGrpVars() {
		return grpVars;
	}

	public void setGrpVars(List<StarqlVar> grpVars) {
		this.grpVars = grpVars;
	}
	
	public void addGrpVars(List<StarqlVar> grpVars) {
		this.grpVars.addAll(grpVars);
	}
	
	public void addGrpVar(StarqlVar grpVar) {
		this.grpVars.add(grpVar);
	}
	
	public GroupBy(){
		
	}
}
