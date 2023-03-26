package com.cg.String;

public class NoofPalindromes {

	public static void main(String[] args) {
		String str="Hi ala obo malayalam";
		String arr[] = str.split(" ");
		String nchar="";
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
		char ch[]=arr[i].toCharArray();
		for(int j=arr[i].length()-1;j>=0;j--)
		{
			nchar=nchar+ch[j];
			if(nchar==arr[i])
				count++;
		}
		System.out.println(count);
		}
		
		
	}
}
