package com.cg.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		Set<String> s= new TreeSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("b");
		s.add("A");
		Set<Integer> a= new TreeSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,3,5,6,0}));
		Set<Integer> b= new TreeSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {2,4,8,0,1,9}));
		//union
		Set<Integer> union=new TreeSet<Integer>(a);
		System.out.println("union elements"+union);
		union.addAll(b);
		System.out.println("union of two sets"+union);
		//Intersection
		Set<Integer> intersection=new TreeSet<Integer>(a);
		System.out.println("Interjection elements"+intersection);
		intersection.retainAll(b);
		System.out.println("Interjection of two sets"+intersection);
		//Difference
		Set<Integer> diff=new TreeSet<Integer>(a);
		System.out.println("Diff elements"+diff);
		diff.removeAll(b);
		System.out.println("Diff of two sets"+diff);
		
		Iterator<String> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
