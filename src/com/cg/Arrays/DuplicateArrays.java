package com.cg.Arrays;

import java.io.File;
import java.util.Arrays;

public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,3,2,1,4,5,4,6};
int arr2[] = new int[arr.length];
int j=0;
Arrays.sort(arr);
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("\n");
for(int i=0;i<arr.length-1;i++)
{
	if(arr[i]!=arr[i+1])
	{
		arr2[j]=arr[i];
		j++;
	}
	
}
arr2[j++]=arr[arr.length-1];

		for(int i=0;i<j;i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
	}