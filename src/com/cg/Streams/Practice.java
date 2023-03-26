package com.cg.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("One","Two","Three","Four");
		List<Integer> list2=Arrays.asList(2,1,4,3,2,1);
		
		List<String>  descnum= list1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descnum);
		Optional<Integer> secondlarge = list2.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
		System.out.println(secondlarge.get());
		
		Set<Integer> duplicates = list2.stream().filter(i->Collections.frequency(list2,i)>1).collect(Collectors.toSet());
		System.out.println(duplicates);
		
		int sum = list2.stream().filter(i->i%2==1).map(n->n*n).reduce(0,Integer::sum);
System.out.println(sum);
	}
}
