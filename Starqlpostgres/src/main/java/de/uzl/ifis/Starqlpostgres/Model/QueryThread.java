package de.uzl.ifis.Starqlpostgres.Model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import de.uzl.ifis.Starqlpostgres.View.MainView;
import de.uzl.ifis.starql.transform.PostgresData;
import de.uzl.ifis.starql.transform.StarqlTransform;
import javafx.application.Platform;

public class QueryThread implements Runnable {
	private Model model;
	private MainView view;
	private Thread query;
	
	private boolean interrupt;
	
	private Statement stmt;
	private Connection connection;
	
	public QueryThread(MainView view, Model model) {
		this.view = view;
		this.model = model;
	}

	public void start() {
		query = new Thread(this);
		query.start();
	}
	
	public void stop() {
		query = null;
	}
	
	public void process() {
		interrupt = false;
		Platform.runLater(() -> view.setComputeView());
		model.setLog("");
		model.setStartTime(0L);
		model.setStopTime(0L);
		model.setUnique(0L);
		
		ByteArrayOutputStream baos;
		String query[];

		PostgresData pgData;
		Object cfgObj = model.parseExaremeConfig();
		pgData = (PostgresData) cfgObj;

		StarqlTransform transform = new StarqlTransform(model.getStarqlOntology(), model.getStarqlMapping());
		
		try {
			baos = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(baos);
			PrintStream oldOut = System.out;
			PrintStream oldErr = System.err;
			System.setOut(ps);
			System.setErr(ps);
			model.setStartTime(System.currentTimeMillis());
			query = transform.runQuery(model.getStarqlQuery(), "PostgreSQL", null, pgData).split(";");
			System.out.println("-----------------------------------------------------------------------");
			model.setUnique(System.currentTimeMillis());
			System.out.println("Saved result under the table resultOfStarql" + model.getUnique() + " in the Database " + model.getDatabase() + "!");
			System.out.flush();
			System.err.flush();
			System.setOut(oldOut);
			System.setErr(oldErr);
			model.setLog(baos.toString());
			for (int i = 0; i < query.length; i++) {
				query[i] = query[i].replaceAll("[\\r\\n\\t\\s]+", " ").trim();
			}
			try {
				Class.forName("org.postgresql.Driver");
				org.postgresql.Driver.setLogLevel(org.postgresql.Driver.DEBUG);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				connection = DriverManager
						.getConnection("jdbc:postgresql://" + model.getIp() + ":" + model.getPort() + "/" + model.getDatabase(), model.getUser(), model.getPasswd());
				stmt = connection.createStatement();
				for (int i = 0; i < query.length - 1; i++) {
					final int x = i;
					Platform.runLater(() -> view.getComputeView().getProgressBar().setProgress((1 / (double)(query.length)) * (double)(x * 1)));
					if (interrupt) {
						return;
					} else {
						stmt.executeUpdate(query[i]);
					}
				}
				if (interrupt) {
					return;
				} else {
					stmt.executeUpdate("CREATE TABLE resultOfStarql" + model.getUnique() + " AS " + query[query.length - 1]);
				}
				Platform.runLater(() -> view.getComputeView().getProgressBar().setProgress(1.0)); 
				model.setStopTime(System.currentTimeMillis());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		stop();
		Platform.runLater(() -> view.setResultView());
	}
	
	public void interrupt() {
		try {
			if (stmt != null) {
				stmt.cancel();
				stmt.close();
			}
			stop();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		Thread thisQuery = Thread.currentThread();
		while (query == thisQuery) {
			process();
		}
	}
}
