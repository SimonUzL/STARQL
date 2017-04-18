package de.uzl.ifis.starql.query;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.Period;
import org.joda.time.DateTime;

public class Pulse {
	
	private int frequency;
	private Date stDate = null;
	private Date endDate = null;
	private String name = "";
	private Integer start = 0;
	private Integer end = 0;
	public Boolean hasIntegerDate = false;
	
	public String getName() {
		return name;
	}

	private Date readDate(String date) throws ParseException{
		Date tDate = null;
		
		if(date == null){
			return null;
		}
		
		if(!date.toLowerCase().contains("xsd:datetime")){
			return null;
		}
		date = date.substring(1);
		date = date.substring(0, date.indexOf("\""));
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz",Locale.ENGLISH);
		tDate = format.parse(date.toString());
		return tDate;
		
	}
	
	private Integer readInteger(String str) throws ParseException{
		if(str == null){
			return null;
		}
		 		
		if(!str.toLowerCase().contains("xsd:integer")){
			return null;
		}
		str = str.substring(1, str.indexOf("\"",1));
		return Integer.parseInt(str);	
	}
	
	public Pulse(String name, String st, String et, int fq){
		try {
			if(st != null)
				if(st.toLowerCase().contains("xsd:datetime")){
					stDate = readDate(st);					
				}else if(st.toLowerCase().contains("xsd:integer")){
					start = readInteger(st);
					this.hasIntegerDate = true;
				}
			if(et != null)
				if(et.toLowerCase().contains("xsd:datetime")){		
					endDate = readDate(et);
				}else if(st.toLowerCase().contains("xsd:integer")){
					end = readInteger(et);
					this.hasIntegerDate = true;
				}								
		} catch (ParseException e) {
			e.printStackTrace();
		}
		frequency = fq;
		this.name = name;
	}
	
	public DateTime getStart(){
		if(stDate == null)	
			return null;
		return new DateTime(stDate);
	}
	public Integer getStartInteger(){
		return start;
	}	
	public Integer getEndInteger(){
		return end;
	}	
	public DateTime getEnd(){
		if(endDate == null)	
			return null;
		return new DateTime(endDate);
	}
	public int getIntFreq(){
		return frequency;
	}
	
	public Period getFreq(){
		return new Period(frequency * 1000);
	}
}
