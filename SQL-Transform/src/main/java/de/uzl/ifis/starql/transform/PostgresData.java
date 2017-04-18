package de.uzl.ifis.starql.transform;

	public class PostgresData{
		private String ip, usr, pw, db, port = "";
		private final String driver = "org.postgresql.Driver";

		public String getPort() {
			return port;
		}

		public String getDriver() {
			return driver;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getUsr() {
			return usr;
		}

		public void setUsr(String usr) {
			this.usr = usr;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public String getDb() {
			return db;
		}

		public void setDb(String db) {
			this.db = db;
		} 
		
		public PostgresData(String ip, String port, String usr, String pw, String db){
			setIp(ip);
			setPort(port);
			setUsr(usr);
			setPw(pw);
			setDb(db);
		}
	}
