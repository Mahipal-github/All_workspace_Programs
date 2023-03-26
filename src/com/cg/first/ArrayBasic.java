package com.cg.first;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		int n=arr.length;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the integers");
		for(int i=0; i<n;i++)
		{
			arr[i]=scan.nextInt();
		}

for(int i=n-1; i>=0;i--)
{
	System.out.println(arr[i]);
}
	}

}
