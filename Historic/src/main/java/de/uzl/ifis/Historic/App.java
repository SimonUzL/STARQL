package de.uzl.ifis.Historic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import scala.Int;
import scala.Tuple2;

public class App {
	/* BufferedReader for reading the input of the user from the shell */
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	/* line separator depends on the system in use */
	final static String ls = System.getProperty("line.separator");

	public static PostgresConnect conn = new PostgresConnect();

	/* Save the last directory in use */
	public static Directory directory = new Directory();

	/* STARQL Transformator */
	public static Starql starql = new Starql(conn);

	public static void loadDataFromPostgres(int partitions, SparkSession spark) throws Exception {
		String answer;
		boolean loader;
		System.out.println();
		System.out.println("Load the data from the database?");
		System.out.print("Answer [y/N]: ");
		answer = in.readLine();
		if (answer.compareTo("y") == 0 || answer.compareTo("Y") == 0) {
			System.out.println("Loading data. This can take a while!");
			loader = true;
		} else {
			System.out.println();
			System.out.println("Searching for existing data! This can take a while!");
			loader = false;
		}

		Class.forName("org.postgresql.Driver");

		Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://" + conn.getIp() + ":" + conn.getPort() + "/" + conn.getDatabase(), conn.getUser(),
				conn.getPasswd());
		DatabaseMetaData md = connection.getMetaData();
		ResultSet rs = md.getTables(null, null, "%", null);

		while (rs.next()) {
			if (rs.getString(2).compareTo("public") == 0 && (rs.getString(4).compareTo("TABLE") == 0)) {
				Map<String, String> options = new HashMap<String, String>();
				options.put("url", conn.getStringSpark());
				options.put("dbtable", rs.getString(3));
				options.put("driver", "org.postgresql.Driver");
				options.put("fetchSize", "100000");
				Dataset<Row> load = spark.read().format("jdbc").options(options).load();
				if (loader) {
					load.repartition(partitions).write().mode(SaveMode.Overwrite).saveAsTable(rs.getString(3));
				} else {
					load.repartition(partitions).write().mode(SaveMode.Ignore).saveAsTable(rs.getString(3));
				}
			}
		}

		System.out.println();
		System.out.println("The following tables where loaded:");
		Dataset<Row> loaded = spark.sql("show tables");
		if (loaded.count() == 0) {
			System.err.println("No data loaded! Is the specified database empty?");
		} else {
			loaded.show(Int.MaxValue() - 1, false);
		}
		connection.close();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("   ____  _                  _                 ____                   _    ");
		System.out.println("  / ___|| |_ __ _ _ __ __ _| |   ___  _ __   / ___| _ __   __ _ _ __| | __");
		System.out.println("  \\___ \\| __/ _` | '__/ _` | |  / _ \\| '_ \\  \\___ \\| '_ \\ / _` | '__| |/ /");
		System.out.println("   ___) | || (_| | | | (_| | | | (_) | | | |  ___) | |_) | (_| | |  |   < ");
		System.out.println("  |____/ \\__\\__,_|_|  \\__, |_|  \\___/|_| |_| |____/| .__/ \\__,_|_|  |_|\\_\\");
		System.out.println("                         |_|                       |_|                    ");

		SparkSession spark = SparkSession.builder().config("spark.sql.warehouse.dir", args[0])
				.appName("STARQL on Spark").getOrCreate();

		conn.getConnectData();

		try {
			loadDataFromPostgres(Integer.parseInt(args[1]), spark);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] query = starql.getQuery();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < query.length - 2; i++) {
			if (query[i].startsWith("WINDOW")) {
				Dataset<Row> words = spark.table("time");
				words.groupBy(functions.window(words.col("timestamp"), query[i].split(" ")[1] + " seconds",
						query[i].split(" ")[2] + " seconds").alias("wid"))
						.agg(functions.collect_list("timestamp").alias("seq")).createOrReplaceTempView("wins");
				JavaRDD<Row> win = spark.table("wins").orderBy(spark.table("wins").col("wid")).javaRDD().zipWithIndex()
						.map(new Function<Tuple2<Row, Long>, Row>() {
							private static final long serialVersionUID = 1L;

							public Row call(Tuple2<Row, Long> v1) throws Exception {
								return RowFactory.create(v1._1.get(1), v1._2());
							}
						});
				StructType schema = DataTypes.createStructType(new StructField[] {
						DataTypes.createStructField("time", DataTypes.createArrayType(DataTypes.TimestampType), false),
						DataTypes.createStructField("wid", DataTypes.LongType, false) });
				spark.createDataFrame(win.rdd(), schema).createOrReplaceTempView("window");
				spark.sql("SELECT wid, explode(time) AS timestamp FROM window ORDER BY wid")
						.createOrReplaceTempView(query[i].split(" ")[3]);
			} else {
				String name = query[i].split(" ")[1];
				i++;
				spark.sql(query[i]).createOrReplaceTempView(name);
			}
		}
		Dataset<Row> result = spark.sql(query[query.length - 2]);
		result.show(100, false);
		Long stopTime = System.currentTimeMillis();
		System.out.println("Computation time: " + String.valueOf(stopTime - startTime) + "ms");
		System.out.println("Save the result in a single text file?");
		System.out.print("Antwort [y/N]: ");
		String answer = in.readLine();
		if (answer.compareTo("y") == 0 || answer.compareTo("Y") == 0) {
			System.out.print("Path for the Result: ");
			File file = new File(in.readLine());
			if (!FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("txt")) {
				file = new File(file.getParentFile(), FilenameUtils.getBaseName(file.getName()) + ".txt");
			}
			if (answer.compareTo("y") == 0 || answer.compareTo("Y") == 0) {
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("--------------------------------------------------------------------" + ls);
				bw.write("Starql Query" + ls);
				bw.write("-------------------------------------------------------------------- " + ls);
				bw.write(starql.getStarqlQuery() + ls);
				bw.write("--------------------------------------------------------------------" + ls);
				bw.write("Statistics" + ls);
				bw.write("--------------------------------------------------------------------" + ls);
				bw.write("The computation run for " + String.valueOf(stopTime - startTime) + "ms" + ls);
				bw.write("The result has the schema: " + ls);
				bw.write(result.schema().toString() + ls);
				bw.write("--------------------------------------------------------------------" + ls);
				bw.write("Result" + ls);
				bw.write("--------------------------------------------------------------------" + ls);
				result.orderBy(result.col("timestamp").asc()).toLocalIterator().forEachRemaining(x -> {
					try {
						bw.write(x.toString() + ls);
					} catch (IOException e) {
						System.out.println("Result could not be saved!");
						e.printStackTrace();
					}
				});
				bw.close();
			}
		}
	}
}