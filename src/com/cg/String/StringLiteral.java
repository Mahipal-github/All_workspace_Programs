package com.cg.String;

public class StringLiteral {

	public static void main(String[] args) {
		
	String str="appllee";
	char ch[] = str.toCharArray();
	int count=1;
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
		if(ch[i]==ch[j])
		{
			++count;
			System.out.println(ch[i]+"="+count);
		}
		
		}
		count=1;
		
	}
}
}
