package com.cg.String;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("geeks for geeks");
		str.append("|");
		str.insert(0, "search");
		str.reverse();
		System.out.println(str.capacity());
		System.out.println(str);
		

	}

}
