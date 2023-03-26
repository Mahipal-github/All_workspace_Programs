package com.cg.Collections;

import java.util.*;

public class Arraylist {

	public static void main(String[] args)
	{
		
		ArrayList<String> al = new ArrayList<>();
		al.add("eat");
		al.add("healthy");
		al.add("food");
		System.out.println(al);
		ArrayList<String> al2 = new ArrayList<>();
		al.addAll(al2);
		System.out.println(al);
		al.set(0,"food");
		System.out.println(al);
		System.out.println("Remove element " +al.remove("food"));
		System.out.println(al);
		System.out.println("Element at 2nd position "+al.get(1));
		
	}
}
