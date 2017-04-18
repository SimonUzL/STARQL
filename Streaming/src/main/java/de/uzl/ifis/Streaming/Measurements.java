package de.uzl.ifis.Streaming;

import java.io.Serializable;

public class Measurements implements Serializable {
	private static final long serialVersionUID = 1L;
	public String timestamp;
	public long profile;
	public double longitude;
	public double langtitude;
	public double height;
	public double distance;
	public long duration;
	public double speed;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public long getProfile() {
		return profile;
	}

	public void setProfile(long profile) {
		this.profile = profile;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLangtitude() {
		return langtitude;
	}

	public void setLangtitude(double langtitude) {
		this.langtitude = langtitude;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
