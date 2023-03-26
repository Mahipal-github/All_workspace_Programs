package com.cg.String;

public class StringInt {

	public static void main(String...args) {
		String emp1="Kundhan";
		String emp2="kundhan";
		String emp3=emp1;
		String emp4=new String("Kundhan");
		System.out.println(emp1==emp4); //false
		System.out.println(emp1.equals(emp4)); //true
		System.out.println(emp1); //kundhan
		System.out.println(emp3);// kudnhan
	}
	
}
