package com.cg.String;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str = "Geeks for geeks";
		String nchar="";
		char ch[] = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			
			nchar=nchar+ch[i];
		}
		System.out.println(nchar);
	}

}
