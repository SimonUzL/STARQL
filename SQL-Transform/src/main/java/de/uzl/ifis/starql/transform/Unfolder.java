/**
 * Unfolder which uses ontop for unfolding specific triples
 *
 * @author Christian Neuenstadt
 */
package de.uzl.ifis.starql.transform;

import it.unibz.krdb.obda.exception.InvalidMappingException;
import it.unibz.krdb.obda.io.ModelIOManager;
import it.unibz.krdb.obda.model.OBDADataFactory;
import it.unibz.krdb.obda.model.OBDADataSource;
import it.unibz.krdb.obda.model.OBDAModel;
import it.unibz.krdb.obda.model.impl.OBDADataFactoryImpl;
import it.unibz.krdb.obda.model.impl.RDBMSourceParameterConstants;
import it.unibz.krdb.obda.ontology.Ontology;
import it.unibz.krdb.obda.owlapi3.OWLAPI3TranslatorOWL2QL;
//import it.unibz.krdb.obda.owlapi3.OWLAPITranslatorOWL2QL;
//import it.unibz.krdb.obda.owlapi3.OWLAPITranslatorOWL2QL;
import it.unibz.krdb.obda.owlapi3.OWLAPI3TranslatorUtility;
import it.unibz.krdb.obda.owlrefplatform.core.QuestConstants;
import it.unibz.krdb.obda.owlrefplatform.core.QuestPreferences;
import it.unibz.krdb.obda.owlrefplatform.core.Quest;
import it.unibz.krdb.obda.owlrefplatform.owlapi3.QuestOWLConnection;
import it.unibz.krdb.obda.owlrefplatform.owlapi3.QuestOWLStatement;
import it.unibz.krdb.obda.r2rml.R2RMLReader;
import it.unibz.krdb.sql.DBMetadata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLException;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import de.uzl.ifis.starql.query.base.Triple;
import de.uzl.ifis.starql.query.base.Window;
import de.uzl.ifis.starql.query.having.IndexedTriple;
import de.uzl.ifis.starql.query.having.StarqlVar;
import de.uzl.ifis.starql.query.having.StarqlVar.StarqlVarType;
import de.uzl.ifis.starql.query.Prefix;

public class Unfolder {

private static Logger logger = LoggerFactory.getLogger(Unfolder.class);
private HashMap<String, String> table = new HashMap<String, String>(); //mapping from qview to table name
private String owlfile = "src/main/resources/example/Starql-Query/exampleStarql.owl";
private String obdafile = "src/main/resources/example/Starql-Query/UseCaseExampleMini.obda";
private OWLOntology ontology = null;
private OBDAModel obdaModel = null;
private String timeColumn = "abox", name = "";
//private OWLAPI3TranslatorUtility translator = new OWLAPI3TranslatorUtility();
private QuestOWLStatement qst = null;
private static OBDADataFactory fac = OBDADataFactoryImpl.getInstance();
private DBMetadata metaData = null;
private Boolean isHistorical = false;
private ArrayList<Prefix> prefixList = new ArrayList<Prefix>();

public Boolean getIsHistorical() {
	return isHistorical;
}

public void setIsHistorical(Boolean isHistorical) {
	this.isHistorical = isHistorical;
}

public String getTimeColumn() {
	return timeColumn;
}

public void setTimeColumn(String timeColumn) {
	this.timeColumn = timeColumn;
}



public Unfolder(String name, PostgresData pg){	
	this.name = name;
	try {		
		setup(pg); //prepare ontop		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public Unfolder(String owl, String obda, DBMetadata metaData, PostgresData pg){
	owlfile = owl;
	obdafile = obda;
	this.metaData = metaData;
	try {
		setup(pg); //prepare ontop		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public Unfolder(OWLOntology owl, OBDAModel obda, DBMetadata metaData, PostgresData pg){
	ontology = owl;
	obdaModel = obda;
	this.metaData = metaData;
	try {	
		setup(pg); //prepare ontop		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public Unfolder(){
	
}

public void setName(String name){
	this.name = name;
}

/**
 * Create an database data source in mmory H2 or Postgres
 * @param name - the datasource name
 * @return the created OBDADataSource
 */
private static OBDADataSource getMemOBDADataSource(String name, PostgresData pg) {

	OBDADataSource obdaSource = OBDADataFactoryImpl.getInstance().getDataSource(URI.create(name));

	String driver = "org.h2.Driver";
	String url = "jdbc:h2:mem:questrepository";
	String username = "sa";
	String password = "";
	
	if(pg != null){
		driver = pg.getDriver();
		username = pg.getUsr();
		password = pg.getPw();
		url = "jdbc:postgresql://"+pg.getIp()+":"+pg.getPort()+"/"+pg.getDb();
	}

	obdaSource = fac.getDataSource(URI.create("http://www.obda.org/ABOXDUMP" + System.currentTimeMillis()));
	obdaSource.setParameter(RDBMSourceParameterConstants.DATABASE_DRIVER, driver);
	obdaSource.setParameter(RDBMSourceParameterConstants.DATABASE_PASSWORD, password);
	obdaSource.setParameter(RDBMSourceParameterConstants.DATABASE_URL, url);
	obdaSource.setParameter(RDBMSourceParameterConstants.DATABASE_USERNAME, username);
	obdaSource.setParameter(RDBMSourceParameterConstants.IS_IN_MEMORY, "true");
	obdaSource.setParameter(RDBMSourceParameterConstants.USE_DATASOURCE_FOR_ABOXDUMP, "true");
	
	return (obdaSource);
}

/**
 * The method generates the OBDAModel from an
 * obda or ttl (r2rml) file
 * @param obdaURI - the file URI
 * @return the generated OBDAModel
 * @throws IOException
 * @throws InvalidMappingException
 */
public OBDAModel getObdaModel(URI obdaURI, PostgresData pg) throws IOException, InvalidMappingException {
	////system.out.println(obdaURI.toString());
		//create empty model
		OBDAModel obdaModel = fac.getOBDAModel();
		// //system.out.println(obdaURI.toString());
		if (obdaURI.toString().endsWith(".obda")) {
			//read obda file
			ModelIOManager modelIO = new ModelIOManager(obdaModel);
			modelIO.load(new File(obdaURI));
			for(OBDADataSource ds : obdaModel.getSources())
				obdaModel.removeSource(ds.getSourceID());
		} else if (obdaURI.toString().endsWith(".ttl")) {
			//read R2RML file
			R2RMLReader reader;
			try {
				reader = new R2RMLReader(new File(obdaURI));
			} catch (Exception e) {
				throw new IOException(e);
			}
			obdaModel = reader.readModel(obdaURI);
		}
		if(pg == null)
			obdaModel.addSource(getMemOBDADataSource("MemH2", pg));
		else
			obdaModel.addSource(getMemOBDADataSource("Postgres", pg));
	  //add data source to model
	return obdaModel;
}
/*
 * 	prepare ontop for rewriting and unfolding steps 
 */
private void setup(PostgresData pg) throws Exception {
	/*
	 * Load the ontology from an external .owl file.
	 */
	Quest qest = null;
	OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
	if(ontology == null)
		ontology = manager.loadOntologyFromOntologyDocument(new File(owlfile));
	
	/*
	 * Prepare the configuration for the Quest instance. The example below shows the setup for
	 * "Virtual ABox" mode
	 */
	QuestPreferences preference = new QuestPreferences();
	preference.setCurrentValueOf(QuestPreferences.ABOX_MODE, QuestConstants.VIRTUAL);
	preference.setCurrentValueOf(QuestPreferences.STORAGE_LOCATION, QuestConstants.INMEMORY);
	preference.setCurrentValueOf(QuestPreferences.SQL_GENERATE_REPLACE, QuestConstants.FALSE);	
	if(obdaModel == null)
		obdaModel = getObdaModel((new File(obdafile.trim())).toURI(), pg);	
	if(pg != null){
		preference.setCurrentValueOf(QuestPreferences.DBNAME, pg.getDb());
		preference.setCurrentValueOf(QuestPreferences.JDBC_URL, "jdbc:postgresql://"+ pg.getIp()+":"+pg.getPort()+"/");
		preference.setCurrentValueOf(QuestPreferences.DBUSER, pg.getUsr());
		preference.setCurrentValueOf(QuestPreferences.DBPASSWORD, pg.getPw());
		preference.setCurrentValueOf(QuestPreferences.JDBC_DRIVER, pg.getDriver());
		//system.out.println(getOntologyFromOWLOntology(ontology));
		qest = new Quest(getOntologyFromOWLOntology(ontology), obdaModel, preference);
	}
	else
		qest = new Quest(getOntologyFromOWLOntology(ontology), obdaModel, metaData, preference);
	qest.setupRepository();

	QuestOWLConnection connOWL = new QuestOWLConnection(qest.getConnection());
	
	qst = connOWL.createStatement();
}

//private Ontology getOntologyFromOWLOntology(OWLOntology owlontology) throws Exception{
//	//compute closure first (owlontology might contain include other source declarations)
//	//system.out.println("A " + owlontology.toString());
//	Set<OWLOntology> closure = owlontology.getOWLOntologyManager().getImportsClosure(owlontology);
//	OWLAPI3TranslatorOWL2QL translator = new OWLAPI3TranslatorOWL2QL(closure);
//	return translator.getOntology();
//}

private Ontology getOntologyFromOWLOntology(OWLOntology owlontology) throws Exception{
	//compute closure first (owlontology might contain include other source declarations)
	////system.out.println("A " + owlontology.toString());
	Set<OWLOntology> closure = owlontology.getOWLOntologyManager().getImportsClosure(owlontology);
	OWLAPI3TranslatorUtility translator = new OWLAPI3TranslatorUtility();
	////system.out.println("B " + translator.mergeTranslateOntologies(closure));
	return translator.mergeTranslateOntologies(closure);
	}

/*
 * returns all matches of p in s
 * @param s string
 * @param p regular expression
 */

public static Set<String> get_matches(String s, String p) {
   
	Set<String> matches = new HashSet<String>();
    Matcher m = Pattern.compile(p).matcher(s);
    while(m.find()) {
    	matches.add(m.group());
    }
    return matches;
}

/*
 * Get a mapping of qview to tablename	
 * @param sql unfolded sql query from ontop
 */
private void extractTableMappings(String sql){
	Set<String> sSet = new HashSet<String>();
	sql = sql.substring(sql.lastIndexOf("FROM") + 4, sql.lastIndexOf("WHERE")); // cut out table information
	for(String str : sql.split(",")){
		table.put(str.trim().split(" ")[1],str.trim().split(" ")[0]); // save mappings from qview to tablename
	}
}

private String replaceQVIEW(String sql){
	for(String str : get_matches(sql, "QVIEW\\d")){
		sql = sql.replaceAll(str, table.get(str));
		////system.out.println("Fï¿½GE HINZU: "+table.get(str));
	}
	return sql;
}

@Deprecated
public String extractDirect(String sql, Triple trple, StarqlVar timeVar, Boolean time){
	sql = sql.substring(sql.indexOf("("));
	String tmpSql = "";
	if(time)
		tmpSql = "SELECT wid, abox AS "+timeVar.toString();
	else 
		tmpSql = "SELECT ";
	Set<String> tmpSet = new HashSet<String>();
	for(StarqlVar sVar : trple.getUnboundValues()){
		tmpSet.add(sVar.getText() + " AS " + sVar.toStringSQL());
	}
	if(!tmpSet.isEmpty())
		tmpSql += ", " + HelperFunctions.getSetAsString(tmpSet, time, ", ");
	
	if(time)
		sql = sql.replaceAll("(SELECT) (DISTINCT)?", "$0 wid, abox,");
	////system.out.println("QQQ: "+timeVar.toString());
	return tmpSql + " FROM " + sql;
}

private String dynamicMapping(Triple triple){
	String unf = "";
	boolean first = true;
	Set<String> constraints = new HashSet<String>();
	Set<String> varSet = new HashSet<String>();
	
	unf += "    SELECT DISTINCT\r\n";
	unf += "    wid";
	for(StarqlVar sVar : triple.getUnboundValues()){
		varSet.add(triple.getPos(sVar) + " AS " + sVar.toStringSQL());
	}
	unf += HelperFunctions.getSetAsString(varSet, false, ", ");
	unf += "\r\n    FROM "+name+"_strminfo\r\n";
	if(!triple.getSubject().getsType().equals(StarqlVar.StarqlVarType.VALUE)){		
		constraints.add("("+name+"_strminfo.Subject = '"+triple.getSubject()+ "')");
	}
	if(!triple.getPredicate().getsType().equals(StarqlVar.StarqlVarType.VALUE)){
		constraints.add("("+name+"_strminfo.Predicate = '"+triple.getPredicate()+ "')");
	}
	if(!triple.getObject().getsType().equals(StarqlVar.StarqlVarType.VALUE)){
		constraints.add("("+name+"_strminfo.Object = '"+triple.getObject()+ "')");
	}
	unf += "    WHERE " + HelperFunctions.getSetAsString(constraints, true, " AND ") + "\r\n";
	return unf;
}

@Deprecated
public String unfoldDirect(Triple triple, StarqlVar timeVar, Boolean time, ArrayList<Window> windows){
	String unf = null;
	String sparqlQuery = "";
	for(Prefix prefix : getPrefixList()){
		sparqlQuery += "PREFIX " + prefix.getVar() + ": " + prefix.getIri() + "\r\n";
	}
	sparqlQuery +=	"SELECT DISTINCT ";
	for(StarqlVar sVar : triple.getUnboundValues())
		sparqlQuery += sVar.toString() + " "; 
	sparqlQuery += "\r\n" +
			"WHERE { "+triple.toString()+". }";		
	String sqlQuery = "";
	try {
		if(qst != null){
			sqlQuery = qst.getUnfolding(sparqlQuery);		
		}
		//sqlQuery = sqlQuery.replaceAll("(CAST\\()(.*)( AS CHAR\\))", "$2");
		//sqlQuery = sqlQuery.replaceAll("(CAST\\()(.*)( AS VARCHAR\\(10485760\\)\\))", "$2");
		if(sqlQuery == ""){
			logger.debug("@@@@@@Unfolding is wrong@@@@");
			logger.debug(sparqlQuery);
			return dynamicMapping(triple);
		}
		logger.debug("@@@@@@@@@@@@@@@@@SPARQL");
		logger.debug(sparqlQuery);	
		logger.debug("@@@@@@@@@@@@@@@@@SQL");
		logger.debug(sqlQuery);		
		
	} catch (OWLException e) {		
		e.printStackTrace();
	}
	unf = extractDirect(sqlQuery, triple, timeVar, time);
	if(time && isHistorical) 
		for(Window win : windows){
			unf = unf.replaceAll("(?i)" + win.getName(), win.getName() + "_stream");
		}
	unf = unf.replaceAll("\"([^\\s\".]*)\".\"([^\\s\".]*)\"","$2");
	return unf;
}

@Deprecated
public String unfoldDirectSpark(Triple triple, StarqlVar timeVar, Boolean time, ArrayList<Window> windows) {
	String unf = unfoldDirect(triple, timeVar, time, windows);
	String[] split = unf.split(" ");
    String tmp = "";
    for (int i = 0; i < split.length - 1; i++) {
            if (split[i + 1].compareTo("||") == 0) {
                    split[i] = "concat" + split[i]; 
            }
            tmp += split[i] + " ";
    }
    tmp += split[split.length - 1];
    unf = tmp.replaceAll("\\|\\|", ",").replaceAll("\"", "");
	return unf;
}

public Unfolding unfold(StarqlVar sVar){
	Unfolding str = new Unfolding();
	if(sVar.getsType() == StarqlVarType.INDEX){
		str.setResColumn(getTimeColumn());
		return str;
	}
	str.setResColumn("Can not unfold var");
	return str;
}

public ArrayList<Prefix> getPrefixList() {
	return prefixList;
}

public void setPrefixList(ArrayList<Prefix> prefixList) {
	this.prefixList = prefixList;
}

@Deprecated
public String unfoldDirect(Triple trple, Boolean time, ArrayList<Window> windows) {
	String unf = null;
	String sparqlQuery = "";
	for(Prefix prefix : getPrefixList()){
		sparqlQuery += "PREFIX " + prefix.getVar() + ": " + prefix.getIri() + "\r\n";
	}
	sparqlQuery +=	"SELECT DISTINCT ";
	for(StarqlVar sVar : trple.getUnboundValues())
		sparqlQuery += sVar.toString() + " "; 
	sparqlQuery += "\r\n" +
			"WHERE { "+trple.toString()+". }";		
	String sqlQuery = "";
	try {
		if(qst != null){
			sqlQuery = qst.getUnfolding(sparqlQuery);		
		}
		//sqlQuery = sqlQuery.replaceAll("(CAST\\()(.*)( AS CHAR\\))", "$2");
		//sqlQuery = sqlQuery.replaceAll("(CAST\\()(.*)( AS VARCHAR\\(10485760\\)\\))", "$2");
		if(sqlQuery == ""){
			//system.out.println("@@@@@@Unfolding is wrong@@@@");
			//system.out.println(sparqlQuery);
			return dynamicMapping(trple);
		}
		//system.out.println("@@@@@@@@@@@@@@@@@SPARQL");
		//system.out.println(sparqlQuery);	
		//system.out.println("@@@@@@@@@@@@@@@@@SQL");
		//system.out.println(sqlQuery);		
		
	} catch (OWLException e) {		
		e.printStackTrace();
	}
	unf = extractDirect(sqlQuery, trple, time);
	if(time && isHistorical)
		for(Window win : windows)
			unf = unf.replaceAll("(?i)" + win.getName(), win.getName() + "_stream");
	unf = unf.replaceAll("\"([^\\s\".]*)\".\"([^\\s\".]*)\"","$2");
	return unf;
}

@Deprecated
public String unfoldDirectSpark(Triple trple, Boolean time, ArrayList<Window> windows) {
	String unf = unfoldDirect(trple, time, windows);
	String[] split = unf.split(" ");
    String tmp = "";
    for (int i = 0; i < split.length - 1; i++) {
            if (split[i + 1].compareTo("||") == 0) {
                    split[i] = "concat" + split[i]; 
            }
            tmp += split[i] + " ";
    }
    tmp += split[split.length - 1];
    unf = tmp.replaceAll("\\|\\|", ",").replaceAll("\"", "");
	return unf;
}

@Deprecated
public String extractDirect(String sql, Triple trple, Boolean time){
	sql = sql.substring(sql.indexOf("("));
	String tmpSql = "";
	if(time)
		tmpSql = "SELECT wid, abox ";
	else 
		tmpSql = "SELECT ";
	Set<String> tmpSet = new HashSet<String>();
	for(StarqlVar sVar : trple.getUnboundValues()){
		tmpSet.add(sVar.getText() + " AS " + sVar.toStringSQL());
	}
	if(!tmpSet.isEmpty())
		tmpSql += HelperFunctions.getSetAsString(tmpSet, !time, ", ");
	if(time)
		sql = sql.replaceAll("(SELECT) (DISTINCT)?", "$0 wid, abox,");
	return tmpSql + " FROM " + sql;
	}

public String unfoldDirect(IndexedTriple iTriple, StarqlVar timeVar, boolean time, ArrayList<Window> windows) {
	String unf = "";
	String sqlQuery = "";
	Set<Triple> nonMapped = new HashSet<Triple>();
	nonMapped = findNonMapped(iTriple);
	iTriple.removeTriple(nonMapped);
	if(iTriple.countTriples() != 0){
		sqlQuery = getSQL(iTriple);
		for(Window win : windows)
			unf = sqlQuery.replaceAll("(?i)" + win.getName(), win.getName() + "_stream");
		unf = extractDirect(unf, iTriple, timeVar, time);
		if(nonMapped.size() != 0)
			unf = "SELECT * FROM(\r\n" + unf;
	}
	if(nonMapped.size() != 0){
		//system.out.println("@@@@@@nonMapped are@@@@");
		//system.out.println(nonMapped);
		if(iTriple.countTriples() != 0)
			unf += ")MAPPED \r\nNATURAL JOIN(\r\n";
		unf += dynamicMapping(nonMapped);
		if(iTriple.countTriples() != 0)
			unf += ") NONMAPPED\r\n";
	}		
	unf = unf.replaceAll("\"([^\\s\".]*)\".\"([^\\s\".]*)\"","$2");
	unf = unf.replaceAll("( AS VARCHAR\\(10485760\\))", "");
	unf = unf.replaceAll("(CAST\\()([^)]*)(\\))", "$2"); //In deer mitte darf keine Klammer zu sein.
	//unf = unf.replaceAll("(CAST\\()(.*)( AS VARCHAR\\(10485760\\)\\))", "$2");
	//unf = unf.replaceAll("(CAST\\()(.*)( AS CHAR\\))", "$2");
	iTriple.addTriple(nonMapped);
	return unf;
}

public String unfoldDirectSpark(IndexedTriple iTriple, StarqlVar timeVar, boolean time, ArrayList<Window> windows) {
	String unf = unfoldDirect(iTriple, timeVar, time, windows);
	Pattern pat = Pattern.compile("(\\([^\\(]*\\|\\|[^\\(]*\\))");
	Matcher matcher = pat.matcher(unf);
	    while(matcher.find()) {
	        unf = unf.replace(matcher.group(1), "concat" + matcher.group(1).replaceAll("\\|\\|", ","));
	    } 
	return unf.replaceAll("\"", "");
}

private Set<Triple> findNonMapped(IndexedTriple iTriple) {
	Set<Triple> trSet = new HashSet<Triple>();
	for (Triple triple : iTriple.getTriple()) {
		if(getSQL(triple).equals(""))
			trSet.add(triple);
	}
	return trSet;
}

private String getSQL(Triple triple) {
	String sparqlQuery = "";
	for(Prefix prefix : getPrefixList()){
		sparqlQuery += "PREFIX " + prefix.getVar() + ": " + prefix.getIri() + "\r\n";
	}
	sparqlQuery +=	"SELECT DISTINCT ";
	for(StarqlVar sVar : triple.getUnboundValues())
		sparqlQuery += sVar.toString() + " "; 
	sparqlQuery += "\r\n" +
			"WHERE { "+ triple.toString() +". }";		
	String sqlQuery = "";
	try {
		if(qst != null)
			sqlQuery = qst.getUnfolding(sparqlQuery);		
	} catch (OWLException e) {		
			e.printStackTrace();
	}
	if(sqlQuery == ""){
		//system.out.println("@@@@@@Unfolding is empty@@@@");
		//system.out.println(triple);
	}
	return sqlQuery;
}

private String getSQL(IndexedTriple iTriple) {
	String sparqlQuery = "";
	for(Prefix prefix : getPrefixList()){
		sparqlQuery += "PREFIX " + prefix.getVar() + ": " + prefix.getIri() + "\r\n";
	}
	sparqlQuery +=	"SELECT DISTINCT ";
	for(StarqlVar sVar : iTriple.getUnboundValues())
		sparqlQuery += sVar.toString() + " "; 
	sparqlQuery += "\r\n" +
			"WHERE { "+iTriple.toRDF()+" }";		
	String sqlQuery = "";
	try {
		if(qst != null)
			sqlQuery = qst.getUnfolding(sparqlQuery);		
	} catch (OWLException e) {		
			e.printStackTrace();
	}
	return sqlQuery;
}

public String extractDirect(String sql, IndexedTriple trple, StarqlVar timeVar, Boolean time){
	sql = sql.substring(sql.indexOf("("));
	String tmpSql = "";
	if(time)
		tmpSql = "SELECT wid, abox AS "+timeVar.toString();
	else 
		tmpSql = "SELECT ";
	Set<String> tmpSet = new HashSet<String>();
	for(StarqlVar sVar : trple.getUnboundValues()){
		tmpSet.add(sVar.getText() + " AS " + sVar.toStringSQL());
	}
	if(!tmpSet.isEmpty())
		if(time)
			tmpSql += ", " + HelperFunctions.getSetAsString(tmpSet, true, ", ");
		else
			tmpSql += HelperFunctions.getSetAsString(tmpSet, true, ", ");
	if(time){
		String stream = sql.substring(sql.indexOf("_stream\" qview")+8, sql.indexOf("_stream\" qview") + 15);
		sql = sql.replaceAll("(SELECT) (DISTINCT)", "$0 "+stream+".wid, "+stream+".abox,");
	}
	
	return tmpSql + " FROM " + sql;
}

private String dynamicMapping(Set <Triple> trpSet) {
	String nonMappedJoin = "SELECT * FROM";
	int count = trpSet.size();
	for (Triple trp : trpSet) {
		nonMappedJoin += "(\r\n";
		nonMappedJoin += dynamicMapping(trp);
		nonMappedJoin += ") SUB_NONMAPPED" + count + "\r\n";
		if(count > 1)
			nonMappedJoin += "NATURAL JOIN\r\n";
		count--;
	}
	return nonMappedJoin;
}

}
