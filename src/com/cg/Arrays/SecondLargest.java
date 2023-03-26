package com.cg.Arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args)
	{
	int temp=0;
	int arr[]= {4,5,5,2,4,6,1,2,3};
	
	Arrays.sort(arr);
	
	for(int i=arr.length-2;i>=0;i--) {
		if(arr[i]!=arr[arr.length-1]) {
			System.out.println("second largest element :"+arr[i]);
			return;
		}
	}
	
	
	}
	
}
