package com.cg.String;

public class StringClass {

	public static void main(String[] args) {
		
		String str1="welcome";
		String str2="welcome";
		String str3=new String("welcome").intern();
		System.out.println(str1==str2); //true
		System.out.println(str2==str3); //true
		System.out.println(str2.equals(str3)); //true
		System.out.println(str1.charAt(0)); //w
		System.out.println(str1.indexOf('e')); //1
		System.out.println(str1.substring(2));//lcome
		System.out.println(str1.substring(1, 5)); //elco
		System.out.println(str1.concat("string"));
		System.out.println(str1.equals(str2)); //true
		//String str4=str3.intern();
		System.out.println(str2.equals(str3)); //true

	}

}
