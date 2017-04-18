package de.uzl.ifis.Streaming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Directory {
	private File directory;
	
	public Directory() {
		directory = new File(".path.txt");
	}
	
	public String get() {
		if (directory.exists()) {
			try {
				FileReader fr = new FileReader(directory);
				BufferedReader br = new BufferedReader(fr);
				String out = br.readLine();
				br.close();
				fr.close();
				return out;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return System.getProperty("user.dir");
			} catch (IOException e) {
				return System.getProperty("user.dir");
			}
		} else {
			return System.getProperty("user.dir");
		}
	}
	
	public void set(String path) {
		if (directory.exists()) {
			try {
				directory.delete();
				directory.createNewFile();
				FileWriter fw = new FileWriter(directory);
			    BufferedWriter bw = new BufferedWriter(fw);
			    bw.write(path);
			    bw.close();
			    fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				directory.createNewFile();
				FileWriter fw = new FileWriter(directory);
			    BufferedWriter bw = new BufferedWriter(fw);
			    bw.write(path);
			    bw.close();
			    fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
