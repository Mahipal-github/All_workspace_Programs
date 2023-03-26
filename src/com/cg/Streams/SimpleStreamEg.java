package com.cg.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cg.Collections.Arraylist;

/*Intermediate Operations : map(),filter(),sorted(),peek(),distinct(),skip(),limit(),flatMap()

Terminal Operations : collect(),forEach(),reduce(),forEachOrdered(),toArray(),count(),max(),min()
anyMatch(),allMatch(),noneMatch(),findAny(),findFirst()

*/
public class SimpleStreamEg {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,5,3,8,6,5);
		list.stream().forEach(y->System.out.println(y));
		List<Integer> sf = list.stream().distinct().collect(Collectors.toList());
		long count = list.stream().count();
		Set<Integer> fe = list.stream().map(x->x/2).collect(Collectors.toSet());
		list.stream().map(x->x/2).forEach(y->System.out.println(y));
		System.out.println("distinct values: "+sf);
		System.out.println("count : "+count);
		System.out.println("Divide by 2: "+fe);
		List<Integer> lt = list.stream().sorted().peek(e->System.out.println(e)).skip(2).collect(Collectors.toList());
		System.out.println(lt);
		





	}
}
