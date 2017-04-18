package de.uzl.ifis.Streaming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

import de.uzl.ifis.starql.transform.PostgresData;
import de.uzl.ifis.starql.transform.StarqlTransform;

public class Starql {
	/* BufferedReader for reading the input of the user from the shell */
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	private PostgresConnect conn = new PostgresConnect();
	
	/* The STARQL query in use */
	public String starql;
	
	/* Save the last directory in use */
	public static Directory directory = new Directory();
	
	public Starql(PostgresConnect conn) {
		this.conn = conn;
	}
	
	public static String open(String hint) {
		JFileChooser chooser = new JFileChooser(directory.get());
		int rueckgabeWert = chooser.showDialog(null, hint);
		if (rueckgabeWert == JFileChooser.APPROVE_OPTION) {
			directory.set(chooser.getSelectedFile().getPath());
			return chooser.getSelectedFile().getAbsolutePath();
		} else {
			return "";
		}
	}

	/* Method to read a file */
	public String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}
	
	private Object parseExaremeConfig() {
		return new PostgresData(conn.getIp(), conn.getPort(), conn.getUser(), conn.getPasswd(), conn.getDatabase());
	}

	public String[] getQuery() throws Exception {
		String owlfile;
		String obdafile;
		
		System.out.print("Path for the STARQL query: ");
		starql = readFile(in.readLine(), StandardCharsets.UTF_8);
		System.out.print("Path for the ontology file: ");
		owlfile = in.readLine();
		System.out.print("Path for the mapping file: ");
		obdafile = in.readLine();
		
		String name = "Starql";
		
		PostgresData pgData;
		Object cfgObj = parseExaremeConfig();
		pgData = (PostgresData) cfgObj;

		StarqlTransform transform = new StarqlTransform(owlfile, obdafile);
		String[] split = transform.runQuery(starql, name, null, pgData).split(";");
		for (int i = 0; i < split.length; i++) {
			split[i] = split[i].replaceAll("[\\r\\n\\t\\s]+", " ").trim();
		}
		
		return split;
	}
	
	public String getStarqlQuery() {
		return starql;
	}
}
