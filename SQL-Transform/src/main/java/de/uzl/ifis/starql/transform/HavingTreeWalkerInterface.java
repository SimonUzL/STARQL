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

public interface HavingTreeWalkerInterface {

	/*
	 * Builds a having (sub)stream
	 */
	public String getHavingString(HvgTreeElem hElem, Boolean noConstraints);
}
