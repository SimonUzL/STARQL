package de.uzl.ifis.Starqlpostgres.Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import de.uzl.ifis.starql.transform.PostgresData;
import javafx.stage.FileChooser;

public class Model {
	private String ip;
	private String port;
	private String user;
	private String passwd;
	private String database;

	private String log;
	private String result;

	private Long startTime;
	private Long stopTime;
	private Long unique;
	
	private static String ln = System.getProperty("line.separator");

	public String readFile(String path, Charset encoding) {
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			return encoding.decode(ByteBuffer.wrap(encoded)).toString();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public boolean checkConnection(String ip, String port, String user, String passwd, String database) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://" + ip + ":" + port + "/" + database, user,
					passwd);
			connection.close();
		} catch (SQLException e) {
			return false;
		}
		return true;
	}

	public void setConnection(String ip, String port, String user, String passwd, String database) {
		this.ip = ip;
		this.port = port;
		this.user = user;
		this.passwd = passwd;
		this.database = database;
	}

	public void saveConnection() {
		try {
			FileWriter fw = new FileWriter(System.getProperty("user.dir") + ".connection");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(ip + ln);
			bw.write(port + ln);
			bw.write(user + ln);
			bw.write(database);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadConnection() {
		try {
			File f = new File(System.getProperty("user.dir") + ".connection");
			if (f.exists() && !f.isDirectory()) {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				ip = br.readLine();
				port = br.readLine();
				user = br.readLine();
				passwd = "";
				database = br.readLine();
				br.close();
			} else {
				ip = "";
				port = "";
				user = "";
				passwd = "";
				database = "";
			}
		} catch (IOException e) {
			ip = "";
			port = "";
			user = "";
			passwd = "";
			database = "";
		}
	}

	public Object parseExaremeConfig() {
		return new PostgresData(ip, port, user, passwd, database);
	}

	public void saveResultToFile() {
		result = "";
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://" + ip + ":" + port + "/" + database,
					user, passwd);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM resultOfStarql" + unique);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			for (int i = 1; i <= columnsNumber; i++) {
				if (i > 1) result += ", ";
				result += rsmd.getColumnName(i);
			}
			result += ln;
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						result += ",  ";
					result += rs.getString(i);
				}
				result += ln;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save result to File");
		try {
			String f = fileChooser.showSaveDialog(null).getAbsoluteFile().toString();
			try {
				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("--------------------------------------------------------------------" + ln);
				bw.write("Starql Query" + ln);
				bw.write("-------------------------------------------------------------------- " + ln);
				bw.write(getStarqlQuery() + ln);
				bw.write("--------------------------------------------------------------------" + ln);
				bw.write("Statistiken" + ln);
				bw.write("--------------------------------------------------------------------" + ln);
				bw.write("Die Berechnung hat " + String.valueOf(stopTime - startTime) + "ms gedauert" + ln);
				bw.write("--------------------------------------------------------------------" + ln);
				bw.write("Ergebnis" + ln);
				bw.write("--------------------------------------------------------------------" + ln);
				bw.write(result);
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (NullPointerException e) {

		}
	}

	public String loadStarqlQuery() {
		String read;
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open STARQL Query");
		try {
			String f = fileChooser.showOpenDialog(null).getAbsoluteFile().toString();
			read = readFile(f, StandardCharsets.UTF_8);
			return read;
		} catch (NullPointerException e) {
			return getStarqlQuery();
		}
	}

	public String loadOntology() {
		String f;
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Ontology File");

		try {
			f = fileChooser.showOpenDialog(null).getAbsoluteFile().toString();
			return readFile(f, StandardCharsets.UTF_8);
		} catch (NullPointerException e) {
			return "";
		}
	}

	public String loadMapping() {
		String f;
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Mapping File");
		try {
			f = fileChooser.showOpenDialog(null).getAbsoluteFile().toString();
			return readFile(f, StandardCharsets.UTF_8);
		} catch (NullPointerException e) {
			return "";
		}
	}

	public void write (String text, String name) {
		File f = new File(System.getProperty("java.io.tmpdir") + "/" + name);
		if (f.exists()) {
			f.delete();
		}
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(text);
			bw.close();
		} catch (IOException e) {

		}
		
	}
	
	public String getIp() {
		return ip;
	}

	public String getPort() {
		return port;
	}

	public String getUser() {
		return user;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getDatabase() {
		return database;
	}

	public String getStarqlQuery() {
		return readFile(System.getProperty("java.io.tmpdir") + "/starql.txt", StandardCharsets.UTF_8);
	}

	public String getStarqlOntology() {
		return System.getProperty("java.io.tmpdir") + "/ontology.owl";
	}

	public String getStarqlMapping() {
		return System.getProperty("java.io.tmpdir") + "/mapping.obda";
	}

	public String getLog() {
		return log;
	}
	
	public void setLog(String value) {
		log = value;
	}
	
	public void setStartTime(Long value) {
		startTime = value;
	}
	
	public void setStopTime(Long value) {
		stopTime = value;
	}
	
	public void setUnique(Long value) {
		unique = value;
	}
	
	public Long getUnique() {
		return unique;
	}
}
