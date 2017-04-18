package de.uzl.ifis.Starqlpostgres.Main;

public class Images {
	private static Images instance;
	
	public static Images getInstance() {
        if (instance == null) {
            instance = new Images();
        }
        return instance;
    }
}
