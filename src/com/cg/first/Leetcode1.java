package com.cg.first;

public class Leetcode1 {

	    public int[] twoSum(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if(nums[i]+nums[j]==target)
	               return new int[] {i,j};
	            }
	        }
	        return null;
	        
	    }
	
	public static void main(String[] args) {
		
		Leetcode1 demo = new Leetcode1();
		int[] arr = {2,7,11,5};
		int[] a = new int[2];
				a=demo.twoSum(arr,13);
				for(int i=0;i<2;i++)
				{
		System.out.println(a[i]);
				}
	
	}
}
