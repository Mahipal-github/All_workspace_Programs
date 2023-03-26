package com.cg.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieComparator {

	public static void main(String[] args) {
		List<Movie> list1 = new ArrayList<Movie>();
		list1.add(new Movie("RRR",8.5,2022));
		list1.add(new Movie("KGF1",8.0,2020));
		list1.add(new Movie("BB",8.5,2019));
		Comparator<Movie> c1 = new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				if(o1.getYear() > o2.getYear())
					return 1;
				else
				return -1;
			}
			
		};
		
		Comparator<Movie> c2 = new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
					return o1.getMovieName().compareTo(o2.getMovieName());

			}
			
		};
		
		Collections.sort(list1,c1);
		System.out.println("sorted with year");
		for(Movie m:list1)
		{
			System.out.println(m.getMovieName()+" "+m.getMrating()+" "+m.getYear());
		}
		Collections.sort(list1,c2);
		System.out.println("Sorting with Name");
		for(Movie m:list1)
		{
			System.out.println(m.getMovieName()+" "+m.getMrating()+" "+m.getYear());
		}
	}

}
