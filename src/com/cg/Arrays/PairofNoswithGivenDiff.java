package com.cg.Arrays;

import java.util.TreeSet;

public class PairofNoswithGivenDiff {

	public static void main(String[] args) {
		
		int arr[]= {1, 5, 2, 2, 2, 5, 5, 4};
		int k=3;
		TreeSet<Integer> ts = new TreeSet<Integer>();
	
		for(int i:arr)
		{
			if(ts.contains(i-k))
			{
				System.out.println("("+i+","+(i-k)+")");
			}
			if(ts.contains(i+k))
			{
				System.out.println("("+(i+k)+","+i+")");
			}
			ts.add(i);
		}
	}
}
