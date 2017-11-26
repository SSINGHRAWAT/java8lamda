package com.suresh.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.suresh.domain.Artist;

public class Java8Lambdas {

	private static List<Artist> artistList = CreateDomainData.getMeArtistData();

	public static void main(String... ags) {
		filterArtist();
	}

	public static void filterArtist() {
		//First 
		long artistFromLN = artistList.stream()
				.filter(artist ->"London".equals(artist.getOrigin())).count();
		System.out.println(artistFromLN);
		//Using predicate
		artistFromLN = artistList.stream()
				.filter(artistFromLondon).count();
		System.out.println(artistFromLN);
		
		//Collecting as list
		List<Artist> londonArtist =  artistList.stream().filter(artistFromLondon).collect(Collectors.toList());
		System.out.println(londonArtist);
		//Map Operation
		List<String> artistOriginAsupperCase = artistList.stream().map(artist -> artist.getOrigin().toUpperCase()).collect(Collectors.toList());
		System.out.println(artistOriginAsupperCase);
		
	}
	
	private static Predicate<Artist> artistFromLondon =  artist -> "London".equals(artist.getOrigin());

}
