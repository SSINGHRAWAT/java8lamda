package com.suresh.java8;

import java.util.ArrayList;
import java.util.List;

import com.suresh.domain.Artist;

public class CreateDomainData {

	public static List<Artist> getMeArtistData() {
		List<Artist> artistList =  new ArrayList<>();
		artistList.add(new Artist("A1","London"));
		artistList.add(new Artist("A2","London"));
		artistList.add(new Artist("A3","Paris"));
		artistList.add(new Artist("A4","London"));
		artistList.add(new Artist("A5","US"));
		artistList.add(new Artist("A6","India"));
		artistList.add(new Artist("A7","London"));
		artistList.add(new Artist("A8","Gaba"));
		artistList.add(new Artist("A9","China"));
		
		return artistList;
	}
	
}
