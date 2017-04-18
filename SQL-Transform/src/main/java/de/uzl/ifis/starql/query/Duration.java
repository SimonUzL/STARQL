package de.uzl.ifis.starql.query;
import org.joda.time.Period;

public class Duration {
	private String duration = "";
	private int intDuration = 0;
	
	private int years, months, days, hours, minutes, seconds = 0;
	
	public Period getPeriod() {
		return new Period(years, months, 0, days, hours, minutes, seconds, 0);
	}
	
	public int getYears() {
		return years;
	}

	public int getMonths() {
		return months;
	}

	public int getDays() {
		return days;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	private int readHMS(String hms){
		int res = 0;
		if(hms.contains("H")){
			hours = Integer.valueOf(hms.substring(0, hms.indexOf("H")));
			res += hours * 3600;
		    hms = hms.substring(hms.indexOf("H") + 1, hms.length());
		}
		if(hms.contains("M")){
			minutes = Integer.valueOf(hms.substring(0, hms.indexOf("M")));
			res += minutes * 60;
		    hms = hms.substring(hms.indexOf("M") + 1, hms.length());
		}
		if(hms.contains("S")){
			seconds = Integer.valueOf(hms.substring(0, hms.indexOf("S")));
			res += seconds;
		    hms = hms.substring(hms.indexOf("S") + 1, hms.length());
		}
		return res;
	}
	
	private int readYMD(String hms){
		int res = 0;
		if(hms.contains("Y")){
			years = Integer.valueOf(hms.substring(1, hms.indexOf("Y")));
			res += years * 31536000;
		    hms = hms.substring(hms.indexOf("Y") + 1, hms.length());
		}
		if(hms.contains("M")){
			months = Integer.valueOf(hms.substring(0, hms.indexOf("M")));
			res += months * 2592000;
		    hms = hms.substring(hms.indexOf("M") + 1, hms.length());
		}
		if(hms.contains("D")){
			days = Integer.valueOf(hms.substring(0, hms.indexOf("D")));
			res += days * 86400;
		    hms = hms.substring(hms.indexOf("D") + 1, hms.length());
		}
		return res;
	}
	
	public Duration(String iv){
		int res = 0;
		String tStr = "";
		if(!iv.toLowerCase().contains("xsd:duration")){
			intDuration = res;
			return;
		}
		tStr = iv.substring(1);
		tStr = tStr.substring(0, tStr.indexOf("\""));
		if(tStr.startsWith("P")){
			tStr = tStr.substring(1);
			if(tStr.contains("T")){
				res = readHMS(tStr.substring(tStr.indexOf("T") + 1));	
				res += readYMD(tStr.substring(0, tStr.indexOf("T")));
			}else{
			res += readYMD(tStr);
			}
			intDuration = res;
		}
		intDuration = res;
	}
	
	public Duration(){
	}
	
	public int getInt(){
		return intDuration;
	}
	
	
}