package com.cg.Collections;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("apple");
		ll.add("mango");
		ll.add("grapes");
		ll.add("orange");
		ll.addFirst("first");
		ll.addLast("last");
		
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		ll.set(0, "pineapple");
		System.out.println(ll);
		//System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		LinkedList<String> l2 = new LinkedList<String>(ll);
		System.out.println(l2);
		System.out.println(l2 instanceof RandomAccess);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l2 instanceof Serializable);
	}

}
