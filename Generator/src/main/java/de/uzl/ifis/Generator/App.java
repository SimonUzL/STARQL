package de.uzl.ifis.Generator;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class App {
	public static PrintStream outToServer;
	public static long cnt;
	public static Random rand = new Random();

	public static double speed(double dist, String time) {
		return Math.round(((dist / Double.parseDouble(time)) * 3.6) * 100.0) / 100.0;
	}
	
	public static String randomData(long t, long p) {
		Date time = new Date(t);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
		String formattedDate = sdf.format(time);
		double longitude = 53 + (55 - 53) * rand.nextDouble();
		double langtitude = 9 + (12 - 9) * rand.nextDouble();
		double height = Math.round((12 + (4200 - 12) * rand.nextDouble()) * 100.0) / 100.0;
		double distance = 0.2 + (8.1 - 0.2) * rand.nextDouble();
		long duration = rand.nextInt(30) + 1;
		return "'" + formattedDate + "'," + p + "," + longitude + "," + langtitude + "," + height + "," + distance + "," + duration + "," + speed(distance, String.valueOf(duration));
	}

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.err.println("Wrong number of parameters:");
			System.err.println("args[0]: number of profiles");
			System.err.println("args[1]: frequency in ms");
			System.exit(-1);
		}
		ServerSocket receiveSocket = new ServerSocket(9999);
		Socket sendSocket = receiveSocket.accept();
		System.out.println("Sendet!");
		cnt = -1 * Long.parseLong(args[1]);
		outToServer = new PrintStream(sendSocket.getOutputStream());
		while (true) {
			cnt += Long.parseLong(args[1]);
			for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
				outToServer.print(randomData(cnt, i) + "\n");
			}
			Thread.sleep(Long.parseLong(args[1]));
		}

	}
}
