package com.cg.String;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hi hello");
		System.out.println(str);
		System.out.println(str.append("how r u"));
		System.out.println(str.charAt(2));
		System.out.println(str.codePointAt(1));

	}

}
