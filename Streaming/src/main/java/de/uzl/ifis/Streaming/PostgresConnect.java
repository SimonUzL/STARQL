package de.uzl.ifis.Streaming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class PostgresConnect {
	/* BufferedReader for reading the input of the user from the shell */
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	/* line separator depends on the system in use */
	private final String ls = System.getProperty("line.separator");
	
	/* PostgreSQL connection informations */
	private String ip, user, passwd, database, port;
	
	private File connectData = new File(".connection.data");

	private void setConnectionData() throws Exception {
		connectData.createNewFile();
		FileWriter fw = new FileWriter(connectData);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(ip + ls);
		bw.write(port + ls);
		bw.write(user + ls);
		bw.write(passwd + ls);
		bw.write(database + ls);
		bw.close();
		fw.close();
	}

	public void getConnectData() throws Exception {
		String next;
		System.out.println();
		System.out.println("Which database you want to use?");
		if (connectData.exists()) {
			FileReader fr = new FileReader(connectData);
			BufferedReader br = new BufferedReader(fr);
			System.out.print("IP Adress [" + (next = br.readLine()) + "]: ");
			if ((ip = in.readLine()).compareTo("") == 0) {
				ip = next;
			}
			System.out.print("Port [" + (next = br.readLine()) + "]: ");
			if ((port = in.readLine()).compareTo("") == 0) {
				port = next;
			}
			System.out.print("Username [" + (next = br.readLine()) + "]: ");
			if ((user = in.readLine()).compareTo("") == 0) {
				user = next;
			}
			System.out.print("Password [" + (next = br.readLine()) + "]: ");
			if ((passwd = in.readLine()).compareTo("") == 0) {
				passwd = next;
			}
			System.out.print("Database [" + (next = br.readLine()) + "]: ");
			if ((database = in.readLine()).compareTo("") == 0) {
				database = next;
			}
			br.close();
			fr.close();
			connectData.delete();
			setConnectionData();
		} else {
			System.out.print("IP Adress: ");
			ip = in.readLine();
			System.out.print("Port: ");
			port = in.readLine();
			System.out.print("Username: ");
			user = in.readLine();
			System.out.print("Password: ");
			passwd = in.readLine();
			System.out.print("Database: ");
			database = in.readLine();
			setConnectionData();
		}
	}

	public String getIp() {
		return ip;
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

	public String getPort() {
		return port;
	}

	public String getStringPostgres() {
		System.out.println("jdbc:postgresql://" + ip + ":" + port + "/" + database);
		return "jdbc:postgresql://" + ip + ":" + port + "/" + database + "," + user + "," + passwd;
	}

	public String getStringSpark() {
		return "jdbc:postgresql://" + ip + ":" + port + "/" + database + "?user=" + user + "&password=" + passwd;
	}
}
