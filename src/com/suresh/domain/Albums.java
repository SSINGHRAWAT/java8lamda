package com.suresh.domain;

import java.util.List;

public class Albums {
	private String name;
	private List<Track> trackList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Track> getTrackList() {
		return trackList;
	}

	public void setTrackList(List<Track> trackList) {
		this.trackList = trackList;
	}

	public List<Artist> getMusicians() {
		return musicians;
	}

	public void setMusicians(List<Artist> musicians) {
		this.musicians = musicians;
	}

	private List<Artist> musicians;

}
