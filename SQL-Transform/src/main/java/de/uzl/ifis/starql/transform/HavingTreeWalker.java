package de.uzl.ifis.starql.transform;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.uzl.ifis.starql.query.Stream;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.HvgTreeElem;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.HvgTreeElem.HavingType;
import net.sf.jsqlparser.JSQLParserException;

public abstract class HavingTreeWalker implements HavingTreeWalkerInterface{

	private int ontopStrm = 0;
	private String hvgString = "";
	private String subName = "";
	private HvgTreeElem hvg = null; //having tree of the current stream
	private Unfolder unf = null; 
	private String source = "";
	protected List<String> subStreams = new ArrayList<String>();
	private List<String> ontopSubStreams = new ArrayList<String>();
	private Set<String> constraints = new HashSet<String>();
	private StarqlTransformator starqlTrans = null;
	private Stream strm = null;
	
	public Stream getStrm() {
		return strm;
	}

	public void setStrm(Stream strm) {
		this.strm = strm;
	}
	
	public int getOntopStrm() {
		return ontopStrm;
	}
	
	public int getnextOntopStrm() {
		return ontopStrm++;
	}
	
	public List<String> getSubStreams() {
		return subStreams;
	}
	public List<String> getOntopSubStreams() {
		return ontopSubStreams;
	}
	
	public void setOntopSubStreams(List<String> ontopSubStreams) {
		this.ontopSubStreams = ontopSubStreams;
	}
	
	public Set<String> getConstraints() {
		return constraints;
	}
	
	public String getString(){
		return hvgString;
	}
	
	public Unfolder getUnf() {
		return unf;
	}

	public void setUnf(Unfolder unf) {
		this.unf = unf;
	}
	
	public HavingTreeWalker(Stream strm, Unfolder unf, StarqlTransformator starqlTrans){
		this.starqlTrans = starqlTrans;
		setStrm(strm);
		setUnf(unf);
		subName = strm.getName() + "_sub";
		if(strm.getHvg() != null)
			this.hvg = strm.getHvg();
		source = strm.getName()+"_joined";
		hvgString = generateString();
	}
	
	public String generateString(){
		if(hvg == null)
			return null;
		else
			return getHavingString(hvg, false).replaceAll("(?m)^", "\t");	
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

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
}
