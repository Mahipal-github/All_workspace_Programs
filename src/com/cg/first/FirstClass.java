package com.cg.first;

import java.util.Scanner;

public class FirstClass {

	public static int sum(int x, int y)
	{
		int z = 0;
		try {
		 z=x/y;
		
		}
		catch (ArithmeticException e){
			e.printStackTrace();
		}
		return z;
	}
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int sum1 = FirstClass.sum(a, b);
	System.out.println("sum is "+sum1);
	//System.out.println("sum is "+sum2);

	}

}
