package com.cg.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieComparable {

	public static void main(String[] args) {
		List<Movie> list1 = new ArrayList<Movie>();
		list1.add(new Movie("RRR",8.5,2022));
		list1.add(new Movie("KGF1",8.0,2020));
		list1.add(new Movie("BB",8.5,2019));
		
		Collections.sort(list1);
		
		for(Movie m:list1)
		{
			System.out.println(m.getMovieName()+" "+m.getMrating()+" "+m.getYear());
		}
		
		

	}

}
