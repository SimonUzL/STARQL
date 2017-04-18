package de.uzl.ifis.starql.query;

import java.util.ArrayList;
import de.uzl.ifis.starql.query.base.*;

public class From {
	private ArrayList<Window> listOfWindows = new ArrayList<Window>();

	public From(){
		
	}
	
	public void addWindow(Window nWindow){
		listOfWindows.add(nWindow);
	}
	
	public void remWindow(Window nWindow){
		listOfWindows.remove(nWindow);
	}
	
	public ArrayList<Window> getList(){
		return listOfWindows;
	}
}

