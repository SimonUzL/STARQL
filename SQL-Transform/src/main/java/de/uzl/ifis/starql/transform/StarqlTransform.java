/**
 * Transformation Baseclass
 *
 * @author Christian Neuenstadt
 */

package de.uzl.ifis.starql.transform;

import it.unibz.krdb.sql.DBMetadata;
//import it.unibz.krdb.sql.TableDefinition;
//import it.unibz.krdb.sql.api.Attribute;
import it.unibz.krdb.sql.DBMetadataExtractor;
import it.unibz.krdb.sql.DatabaseRelationDefinition;
import it.unibz.krdb.sql.QuotedIDFactory;

public class StarqlTransform {
	private String owlfile = "";
	private String obdafile = "";
	private DBMetadata metaData= null;
	
	public StarqlTransform(String owlfile, String obdafile) {
		this.owlfile = owlfile;
		this.obdafile = obdafile;
	}	
	
	public String runQuery(String starql, String name, Parameters param, PostgresData pgData) throws Exception {
		/*
		 * Load the query from an external txt file.
		 */
		////system.out.println("AAA"+starql);
		AggRewriter aggRew = new AggRewriter(starql);
		aggRew.replaceOps();
		String rew = aggRew.getRewriting();
		metaData = StarqlTransformatorLRB.getMeta();
		//Unfolder unf = new Unfolder(owlfile, obdafile, metaData, null); //LRB Trans
		Unfolder unf = new Unfolder(owlfile, obdafile, null, pgData);
		unf.setName(name);
		long time = System.nanoTime();
		//StarqlTransformatorExareme transformer = new StarqlTransformatorExareme(rew, unf, param, pgData);
		StarqlTransformatorPostgres transformer = new StarqlTransformatorPostgres(rew, unf);
		//StarqlTransformatorLRB transformer = new StarqlTransformatorLRB(rew, unf);
		//StarqlTransformatorSparkHistoric transformer = new StarqlTransformatorSparkHistoric(starql, unf);
		/*
		 * Get the adp information 
		 */
		System.out.println();
		System.out.println("The input STARQL query:");
		System.out.println("=======================");
		System.out.println(starql);
		System.out.println();
		System.out.println("The output SQL query:");
		System.out.println("=======================");
		System.out.println(transformer.getResultQuery());
		System.out.println("Time taken: " + ((System.nanoTime() - time) / 1000000) + " millis");
		return transformer.getResultQuery();	
		
	}	
}
