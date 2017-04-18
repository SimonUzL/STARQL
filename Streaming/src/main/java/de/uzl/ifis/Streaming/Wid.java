package de.uzl.ifis.Streaming;

import java.io.Serializable;

public class Wid implements Serializable {
	private static final long serialVersionUID = 1L;
	public Long wid;

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}	
}
