package com.cg.main;

public class Mainvar {

	 static int a=20;
	 public int sum(int a,int b) {
		 int sum =a+b;
		 return sum;
	 }
	public static void main(String[] args) {
		Mainvar obj= new Mainvar();
		int x = obj.sum(2,3);
		System.out.println(x);

	}

}
