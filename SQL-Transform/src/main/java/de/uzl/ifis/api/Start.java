package de.uzl.ifis.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import de.uzl.ifis.starql.transform.Parameters;
import de.uzl.ifis.starql.transform.PostgresData;
import de.uzl.ifis.starql.transform.StarqlTransform;

public class Start {
	final static String qryName = "Example/Example1.txt";
	final static String starqlFile = "src/test/resources/";
	final static String pgstr = "postgres ip:localhost port:5432 usr:postgres pw:postgres db:sport";
	private static PostgresData pgData;
	
	/**
	 * Parses an Exareme streaming source configuration. May return different
	 * object types depending on the type of configuration.
	 * 
	 * @param exaremeConfig
	 *            Configuration string (e.g., for PostgreSQL stored data, string
	 *            pattern is "postgres h:host port:port u:user p:password db:database")
	 * @return
	 */
	private static Object parseExaremeConfig(String exaremeConfig) {
		if (exaremeConfig.startsWith("postgres ")) {
			try {
				String[] fields = exaremeConfig.split(" ");
				String pgIp = fields[1].split(":")[1];
				String pgPort = fields[2].split(":")[1];
				String pgUsr = fields[3].split(":")[1];
				String pgPw = fields[4].split(":")[1];
				String pgDb = fields[5].split(":")[1];
				return new PostgresData(pgIp, pgPort, pgUsr, pgPw, pgDb);
			} catch (Exception e) {
				throw new RuntimeException(
						"Invalid Exareme postgres configuration string: "
								+ exaremeConfig + " (parse error: " + e + ")");
			}
		} else
			// note: only supported type so far: "postgres"
			throw new RuntimeException(
					"Unsupported Exareme streaming source configuration string: "
							+ exaremeConfig);
	}	
	
	static String readFile(String path, Charset encoding) 
			  throws IOException
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return encoding.decode(ByteBuffer.wrap(encoded)).toString();
			}	
	
	public static void main(String[] args) throws Exception {
		String starql = "";
		String qAnswer = "";
		String owlfile = starqlFile + "Example/Starql.owl";
		String obdafile = starqlFile + "Example/Starql.obda";
		
		starql = readFile(starqlFile + qryName, StandardCharsets.UTF_8);	
		
		if (pgstr != null) {	
			Object cfgObj = parseExaremeConfig(pgstr);
			if (cfgObj instanceof PostgresData){
				pgData = (PostgresData) cfgObj;
			}
		}
		
		if ( args.length == 0 ){
			System.out.println("This is the STARQL to Exareme transformation module.");
			System.out.println("Parameters: [STARQLquery] [resultFile] [OWLfile] [OBDAfile]");
		}
		if ( args.length > 0 ){
			starql = readFile(starqlFile + args[0], StandardCharsets.UTF_8);	
		}
		if ( args.length > 2 ){
			 owlfile = starqlFile + args[2];
		}
		if ( args.length > 3 ){
			 obdafile = starqlFile + args[3];
		}
		
		StarqlTransform transform = new StarqlTransform(owlfile, obdafile);
		qAnswer = transform.runQuery(starql, "testQuery", null, pgData);

		if ( args.length > 1 ){
			PrintWriter out = new PrintWriter(args[1]);
			out.println(qAnswer);
			out.close();
		 }
	}
}
