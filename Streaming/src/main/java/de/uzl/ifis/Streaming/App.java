package de.uzl.ifis.Streaming;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.Time;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import scala.Int;

public class App {
	public static PostgresConnect conn = new PostgresConnect();
	public static Starql starql = new Starql(conn);

	public static int port = 9998;
	
	public static List<String> tableNames = new ArrayList<String>();
	
	public static String[] query;

	public static File connectData = new File(".connection.txt");
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	final static String nl = System.getProperty("line.separator");
	
	public static String name;
	private static List<String> tmp = new ArrayList<String>();
	private static List<String[]> stream = new ArrayList<String[]>();
	private static List<String[]> head = new ArrayList<String[]>();
	private static List<String[]> tail = new ArrayList<String[]>();
	private static List<String[]> union = new ArrayList<String[]>();
	private static List<List<String[]>> headSave = new ArrayList<List<String[]>>();
	private static List<List<String[]>> tailSave = new ArrayList<List<String[]>>();
	private static List<List<String[]>> unionSave = new ArrayList<List<String[]>>();
	private static List<String> uni = new ArrayList<String>();
	private static Map<String, JavaDStream<Row>> windowStreams = new HashMap<String, JavaDStream<Row>>();
	private static Map<String, JavaDStream<Row>> starqlStreams = new HashMap<String, JavaDStream<Row>>();

	public static SparkConf conf;
	public static JavaStreamingContext ssc;
		
	public static void loadStaticTables(int partitions, String path) throws IOException, ClassNotFoundException, SQLException {
		SparkSession spark = SparkSession.builder().config("spark.sql.warehouse.dir", path).getOrCreate();
		Connection connection = null;
		String answer;
		boolean loader;
		System.out.println("Load the data from the database?");
		System.out.print("Answer [y/N]: ");
		answer = in.readLine();
		if (answer.compareTo("y") == 0 || answer.compareTo("Y") == 0) {
			System.out.println("Loading data. This can take a while!");
			loader = true;
		} else {
			System.out.println("Searching for existing data! This can take a while!");
			loader = false;
		}
		Class.forName("org.postgresql.Driver");

		connection = DriverManager.getConnection(
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
		System.out.println();
		
		int partitions = 1;
		conf = new SparkConf();
		conf.setMaster(args[2]).set("spark.sql.crossJoin.enabled", "true").set("spark.sql.warehouse.dir", args[0]).setAppName("Backend Test");
		ssc = new JavaStreamingContext(conf, Durations.seconds(1));

		partitions = Integer.parseInt(args[1]);
		
		conn.getConnectData();
	
		try {
			loadStaticTables(partitions, args[0]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		String[] split; 
		query = starql.getQuery();
		for (int i = 0; i < query.length; i++) {
			if (query[i].compareTo("ENDE") == 0) {
				String[] temp = new String[tmp.size()];
				temp = tmp.toArray(temp);
				stream.add(temp);
				tmp = new ArrayList<String>();
			} else {
				tmp.add(query[i]);
			}
		}
		String[] temp = new String[tmp.size()];
		temp = tmp.toArray(temp);
		stream.add(temp);
		tmp = new ArrayList<String>();
		for (int i = 0; i < stream.size(); i++) {
			head = new ArrayList<String[]>();
			tail = new ArrayList<String[]>();
			union = new ArrayList<String[]>();
			for (int j = 0; j < stream.get(i).length; j++) {
				if (stream.get(i)[j].startsWith("WINDOW")) {
					tmp.add(stream.get(i)[j]);
					j++;
					tmp.add(stream.get(i)[j]);
					j++;
					tmp.add(stream.get(i)[j]);
					temp = new String[tmp.size()];
					temp = tmp.toArray(temp);
					head.add(temp);
					tmp = new ArrayList<String>();
				} else {
					if (stream.get(i)[j].compareTo("UNION") == 0) {
						j++;
						tmp.add(stream.get(i)[j]);
						j++;
						tmp.add(stream.get(i)[j]);
						j++;
						temp = new String[tmp.size()];
						temp = tmp.toArray(temp);
						union.add(temp);
						tmp = new ArrayList<String>();
					}
					tmp.add(stream.get(i)[j]);
				}
			}
			temp = new String[tmp.size()];
			temp = tmp.toArray(temp);
			tail.add(temp);
			tmp = new ArrayList<String>();
			headSave.add(head);
			unionSave.add(union);
			tailSave.add(tail);
		}
		for (int outerLoop = 0; outerLoop < headSave.size() - 1; outerLoop++) {
			final int curSave = outerLoop;
			for (int innerLoop = 0; innerLoop < headSave.get(curSave).size(); innerLoop++) {
				final int current = innerLoop;
				if (headSave.get(curSave).get(current)[1].contains("_starqlout_stream")) {
					name = headSave.get(curSave).get(current)[1].split(" ")[1].replace("_starqlout_stream", "")
							.toLowerCase();
					split = headSave.get(curSave).get(current)[0].split(" ");
					JavaDStream<Row> win = starqlStreams.get(name).window(Durations.seconds(Long.parseLong(split[1])),
							Durations.seconds(Long.parseLong(split[2])));
					JavaDStream<Row> window = win.transform(new Function2<JavaRDD<Row>, Time, JavaRDD<Row>>() {
						private static final long serialVersionUID = 1L;
						public JavaRDD<Row> call(JavaRDD<Row> rdd, Time time) throws Exception {
							if (!rdd.isEmpty()) {
								StructType schema = rdd.first().schema();
								SparkSession spark = SparkSession.builder().config(rdd.context().getConf()).getOrCreate();
								Dataset<Row> table = spark.createDataFrame(rdd.rdd(), schema);
								table.createOrReplaceTempView("window");
								Wid obj = new Wid();
								obj.setWid(time.milliseconds());
								Dataset<Wid> wid = spark.createDataset(
										ssc.sparkContext().parallelize(Arrays.asList(obj)).rdd(),
										Encoders.bean(Wid.class));
								wid.createOrReplaceTempView("id");
								name = headSave.get(curSave).get(current)[1].split(" ")[1];
								Dataset<Row> out = spark.sql(headSave.get(curSave).get(current)[2]);
								out.createOrReplaceTempView(name);
								return out.toJavaRDD();
							} else {
								return ssc.sparkContext().emptyRDD();
							}
						}
					});
					name = headSave.get(curSave).get(current)[1].split(" ")[1].replace("_starqlout_stream", "")
							.toLowerCase();
					windowStreams.put(name, window);
				} else {
					name = headSave.get(curSave).get(current)[1].split(" ")[1].replace("_stream", "").toLowerCase();
					System.out.println("From where do you want to read " + name + "?");
					System.out.print("Host: ");
					String host = in.readLine();
					System.out.println("From which port do you want to read " + name + "?");
					System.out.print("Port: ");
					port = Integer.parseInt(in.readLine());
					System.out.println(
							"Please write " + name + " to port " + port + " and confirm it with return");
					in.readLine();
					JavaDStream<String> in = ssc.socketTextStream(host, port);
					JavaDStream<String> list = in.flatMap(new FlatMapFunction<String, String>() {
						private static final long serialVersionUID = 1L;
						public Iterator<String> call(String line) throws Exception {
							return Arrays.asList(line.split("\n")).iterator();
						}
					});
					split = headSave.get(curSave).get(current)[0].split(" ");
					JavaDStream<String> win = list.window(Durations.seconds(Long.parseLong(split[1])),
							Durations.seconds(Long.parseLong(split[2])));
					win.repartition(4);
					name = headSave.get(curSave).get(current)[1].split(" ")[1].replace("_stream", "").toLowerCase();
					//------------- In this area you have to implement your own classes depending on your stream data -------------
					if (name.compareTo("measurements") == 0) {
						JavaDStream<Row> window = win.transform(new Function2<JavaRDD<String>, Time, JavaRDD<Row>>() {
							private static final long serialVersionUID = 1L;
							public JavaRDD<Row> call(JavaRDD<String> rdd, Time time) throws Exception {
								JavaRDD<Measurements> objRDD = rdd
										.map(new Function<String, Measurements>() {
											private static final long serialVersionUID = 1L;
											public Measurements call(String line) throws Exception {
												String[] split = line.split(",");
												Measurements obj = new Measurements();
												obj.setTimestamp(split[0]);
												obj.setProfile(Long.parseLong(split[1]));
												obj.setLongitude(Double.parseDouble(split[2]));
												obj.setLangtitude(Double.parseDouble(split[3]));
												obj.setHeight(Double.parseDouble(split[4]));
												obj.setDistance(Double.parseDouble(split[5]));
												obj.setDuration(Long.parseLong(split[6]));
												obj.setSpeed(Double.parseDouble(split[7]));
												return obj;
											}
										});
								SparkSession spark = SparkSession.builder().config(rdd.context().getConf()).getOrCreate();
								Dataset<Measurements> objTable = spark.createDataset(objRDD.rdd(),
										Encoders.bean(Measurements.class));
								objTable.createOrReplaceTempView("window");
								Wid obj = new Wid();
								obj.setWid(time.milliseconds());
								Dataset<Wid> wid = spark.createDataset(
										ssc.sparkContext().parallelize(Arrays.asList(obj)).rdd(),
										Encoders.bean(Wid.class));
								wid.createOrReplaceTempView("id");
								name = headSave.get(curSave).get(current)[1].split(" ")[1];
								Dataset<Row> out = spark.sql(headSave.get(curSave).get(current)[2]);
								out.createOrReplaceTempView(name);
								return out.javaRDD();
							}
						});
						windowStreams.put("measurements", window);
					} //else if (name.compareTo("name") == 0) { ...
					//------------- In this area you have to implement your own classes depending on your stream data -------------
				}
			}
			/* HEAD ENDE */
			for (int innerLoop = 0; innerLoop < unionSave.get(curSave).size(); innerLoop++) {
				final int current = innerLoop;
				name = unionSave.get(curSave).get(current)[1];
				split = name.split(" ");
				uni = new ArrayList<String>();
				for (int splitLoop = 0; splitLoop < split.length; splitLoop++) {
					if (split[splitLoop].compareTo("FROM") == 0) {
						splitLoop++;
						uni.add(split[splitLoop].replace("_starqlout_stream", "").toLowerCase());
					}
				}
				if (uni.size() == 1) {
					JavaDStream<Row> window = windowStreams.get(uni.get(0))
							.transform(new Function<JavaRDD<Row>, JavaRDD<Row>>() {
								private static final long serialVersionUID = 1L;
								public JavaRDD<Row> call(JavaRDD<Row> rdd) throws Exception {
									if (!rdd.isEmpty()) {
										StructType schema = rdd.first().schema();
										SparkSession spark = SparkSession.builder().config(rdd.context().getConf()).getOrCreate();
										name = unionSave.get(curSave).get(current)[0].split(" ")[1];
										Dataset<Row> out = spark.createDataFrame(rdd.rdd(), schema);
										out.createOrReplaceTempView(name);
										return out.toJavaRDD();
									} else {
										return ssc.sparkContext().emptyRDD();
									}
								}
							});
					name = unionSave.get(curSave).get(current)[0].split(" ")[1].replace("_strminfo", "").toLowerCase();
					windowStreams.put(name, window);
				} else if (uni.size() > 1) {
					List<JavaDStream<Row>> unify = new ArrayList<JavaDStream<Row>>();
					for (int unifyLoop = 1; unifyLoop < uni.size(); unifyLoop++) {
						unify.add(windowStreams.get(uni.get(unifyLoop)));
					}
					JavaDStream<Row> win = ssc.union(windowStreams.get(uni.get(0)), unify);
					JavaDStream<Row> window = win.transform(new Function<JavaRDD<Row>, JavaRDD<Row>>() {
						private static final long serialVersionUID = 1L;
						public JavaRDD<Row> call(JavaRDD<Row> rdd) throws Exception {
							if (!rdd.isEmpty()) {
								StructType schema = rdd.first().schema();
								SparkSession spark = SparkSession.builder().config(rdd.context().getConf()).getOrCreate();
								name = unionSave.get(curSave).get(current)[0].split(" ")[1];
								Dataset<Row> out = spark.createDataFrame(rdd.rdd(), schema);
								out.createOrReplaceTempView(name);
								return out.toJavaRDD();
							} else {
								return ssc.sparkContext().emptyRDD();
							}
						}
					});
					name = unionSave.get(curSave).get(current)[0].split(" ")[1].replace("_strminfo", "").toLowerCase();
					windowStreams.put(name, window);
				}
			}
			/* UNION ENDE */
			for (int innerLoop = 0; innerLoop < tailSave.get(curSave).size(); innerLoop++) {
				final int current = innerLoop;
				name = tailSave.get(curSave).get(current)[1];
				if (name.contains("_stream")) {
					name = tailSave.get(curSave).get(current)[1].split(" ")[6].replace("_stream", "").toLowerCase();
				} else if (name.contains("_strminfo")) {
					name = tailSave.get(curSave).get(current)[1].split(" ")[6].replace("_strminfo", "").toLowerCase();
				}
				JavaDStream<Row> run = windowStreams.get(name).transform(new Function<JavaRDD<Row>, JavaRDD<Row>>() {
					private static final long serialVersionUID = 1L;
					public JavaRDD<Row> call(JavaRDD<Row> rdd) throws Exception {
						if (!rdd.isEmpty()) {
							SparkSession spark = SparkSession.builder().config(rdd.context().getConf()).getOrCreate();
							for (int runLoop = 0; runLoop < tailSave.get(curSave).get(current).length - 2; runLoop++) {
								name = tailSave.get(curSave).get(current)[runLoop].split(" ")[1];
								runLoop++;
								spark.sql(tailSave.get(curSave).get(current)[runLoop])
										.createOrReplaceTempView(name);
							}
							name = tailSave.get(curSave).get(current)[tailSave.get(curSave).get(current).length - 2]
									.split(" ")[1];
							Dataset<Row> out = spark.sql(
									tailSave.get(curSave).get(current)[tailSave.get(curSave).get(current).length - 1]);
							out.createOrReplaceTempView(name);
							return out.toJavaRDD();
						} else {
							return ssc.sparkContext().emptyRDD();
						}
					}
				});
				name = tailSave.get(curSave).get(current)[tailSave.get(curSave).get(current).length - 2].split(" ")[1]
						.replace("_starqlout", "").toLowerCase();
				starqlStreams.put(name, run);
			}
		}
		/* TAIL ENDE */
		name = tailSave.get(tailSave.size() - 1).get(tailSave.get(tailSave.size() - 1).size() - 1)[0].split(" ")[3]
				.replace("_starqlout", "").toLowerCase();
		starqlStreams.get(name).foreachRDD(new VoidFunction<JavaRDD<Row>>() {
			private static final long serialVersionUID = 1L;
			public void call(JavaRDD<Row> rdd) throws Exception {
				if (!rdd.isEmpty()) {
					StructType schema = rdd.first().schema();
					SparkSession spark = SparkSession.builder().config(rdd.context().getConf()).getOrCreate();
					spark.createDataFrame(rdd.rdd(), schema).show(false);
				}
			}
		});
		ssc.start();
		try {
			ssc.awaitTermination();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
