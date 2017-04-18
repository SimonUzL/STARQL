package de.uzl.ifis.starql.query.base;

import de.uzl.ifis.starql.query.Duration;

public class Window {
private String name = "";
private Duration slack = new Duration("0");
private Duration slide = new Duration("0");
private int timewindow = 0;
private String startTime = "";
private String endTime = "";

public Window(){
	
}

public int getTimewindow() {
	return timewindow;
}

public void setTimewindow(String timewindow) {
	int tw = 0;
	if(!timewindow.equals("")){
		tw = Integer.parseInt(timewindow);
	}
	this.timewindow = tw;
}

public void setName(String nName){
	name = nName;
}
public Duration getSlide() {
	return slide;
}

public void setSlide(Duration slide) {
	this.slide = slide;
}
public void setStartTime(String nStartTime){
	startTime = nStartTime;
}
public void setEndTime(String nEndTime){
	endTime = nEndTime;
}

public String getName(){
	return name;
}

public Duration getSlack() {
	return slack;
}

public void setSlack(Duration slack) {
	if(slack != null)
		this.slack = slack;
}

public String getStartTime(){
	return startTime;
}
public String getEndTime(){
	return endTime;
}


}
