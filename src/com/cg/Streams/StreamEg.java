package com.cg.Streams;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEg {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,2,6,9,5,8,2);
		Integer res = list.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println(res);
		Stream<Integer> st = list.stream().parallel();
		Integer fa = st.filter(n->n%2!=0).findAny().get();
		System.out.println(fa);
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		int day = current.getDayOfMonth();
		System.out.println(day);
		long count = list.stream().filter(i->i%2==0).count();
		List<Integer> diselem = list.stream().distinct().collect(Collectors.toList());
		/*
		int count=0;
		for(int i:list)
		{
			if(i%2==0)
				count++;
		} */
		System.out.println(count);
		System.out.println(diselem);
		
	}

}
