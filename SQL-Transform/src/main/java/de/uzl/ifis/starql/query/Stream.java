package de.uzl.ifis.starql.query;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import de.uzl.ifis.starql.query.base.*;
import de.uzl.ifis.starql.query.having.HavingOr;
import de.uzl.ifis.starql.query.having.HvgTreeElem;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.TreeFunctions;

public class Stream {
	private ResourceList resList = new ResourceList();
	private QueryHead qHead = new QueryHead();
	private IndexedTriple where = null;
	private From from;
	private Sequence seq = new Sequence("", "");
	private Pulse pulse = null;
	private String name;
	private HvgTreeElem hvg = null;
	private GroupBy grpby = null;
	private HavingOr hvgAggregate = null;
	private String pulseName = "";
	
	public String getPulse() {
		return pulseName;
	}

	public void usingPulse(String pulseName) {
		this.pulseName = pulseName;
	}
	
	public HavingOr getHvgAggregate() {
		return hvgAggregate;
	}

	public void setHvgAggregate(HavingOr hvgAggregate) {
		this.hvgAggregate = hvgAggregate;
	}
	
	public GroupBy getGrpby() {
		return grpby;
	}

	public void setGrpby(GroupBy grpby) {
		this.grpby = grpby;
	}

	public boolean isSafe(){
		boolean isSafe = true;
		if(hvg != null)
			if(!hvg.getUnSafeVars().getVars().isEmpty()){
				isSafe = false;
				if(getWhere().getSafeVars().getVars().containsAll((hvg.getUnSafeVars().getVars())))
					isSafe = true;
				////system.out.println(hvg.getUnSafeVars().getVars());
			}else{
				////system.out.println(hvg.getUnSafeVars().getVars());
			}
		return isSafe;
	}
	
	public Set<StarqlVar> getVars(){
		Set<StarqlVar> sVars = new HashSet<StarqlVar>();
		Set<IndexedTriple> iTriples = new HashSet<IndexedTriple>();
		if(getHvg() != null){
			iTriples = getHvg().getLowerIndTriples(false);
		}
		if(getWhere() != null)
			iTriples.addAll(getWhere().getiTriples());
		for (IndexedTriple iTriple : iTriples) {
			sVars.addAll(iTriple.getUnboundValues());
		}
		return sVars;
	}

	
	public Stream(){
	}
	
	public HvgTreeElem getHvg() {
		return hvg;
	}

	public void setHvg(HvgTreeElem hvg) {
		if(hvg!= null)
			this.hvg = TreeFunctions.allFuncs(hvg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWhere(IndexedTriple where) {
		this.where = where;
	}

	public IndexedTriple getWhere() {
		return where;
	}	
	
	public Sequence getSeq() {
		return seq;
	}

	public void setSeq(Sequence seq) {
		this.seq = seq;
	}
	
	public ResourceList getResList() {
		return resList;
	}

	public void setResList(ResourceList resList) {
		this.resList = resList;
	}
	
	public void setReturn(QueryHead head){
		qHead = head;
	}
	
	public QueryHead getReturn(){
		return qHead;
	}
	
	public void setFrom(From nFrom){
		from = nFrom;
	}
	
	public From getFrom(){
		return from;
	}
}
