package de.uzl.ifis.starql.query;

import java.util.ArrayList;

import de.uzl.ifis.starql.query.base.*;

public class ResourceList {
	private ArrayList<Resource> res = new ArrayList<Resource>();
	
	public ArrayList<Resource> getRes() {
		return res;
	}
	
	public void addRes(Resource res) {
		this.res.add(res);
	}
	
	public void addRes(ResourceList res) {
		this.res.addAll(res.getRes());
	}
}
