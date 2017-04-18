package de.uzl.ifis.starql.transform;

import de.uzl.ifis.starql.query.Stream;
import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.having.StarqlVar;

public interface StarqlTransformatorInterface {
	/*
	 * The following parts should be implemented for a SQL backend
	 */
	
	/*
	 * Relation to Stream Operator
	 */
	String constructOut(Stream strm);

	/*
	 * Calculation of window closing time
	 */
	String addTimeJoin(Stream strm);

	/*
	 * Calculation view of each Aggregator var
	 */
	String buildAggStream(StarqlVar var, Stream strm);

	/*
	 * Calculation view of each Aggregator triple
	 */
	String buildAggStream(Triple triple, Stream strm);
	
	/*
	 * Calculation of te having clause
	 */
	String constructHaving(Stream strm);
	
	/*
	 * Join of time into results
	 */
	String addTime(Stream strm);

	/*
	 * Join of stream with identical prefixes
	 */
	String joinedStream(Stream strm);

	/*
	 * Index for historical streams
	 */
	String addIndex(Stream strm);

	/*
	 * Implemetation of input streams
	 */
	String constructView(Stream strm);

	/*
	 * Join of different Starql stream inputs
	 */
	String joinStreamInfo(Stream stream);
	
	/*
	 * Select output or write into table
	 */
	String finalTouch(String resultStr, String lastName);

}
