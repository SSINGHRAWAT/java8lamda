package com.suresh.domain;

import java.util.List;

public class Artist {

	private String name;
	private List<Artist> members;
	private String origin;

	public Artist(String name, String origin) {
		this.name = name;
		this.origin = origin;
	}

	public Artist(String name) {
		this.name = name;
	}

	public Artist(String name, String origin, List<Artist> members) {
		this.name = name;
		this.origin = origin;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Artist> getMembers() {
		return members;
	}

	public void setMembers(List<Artist> members) {
		this.members = members;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
