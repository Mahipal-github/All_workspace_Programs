package com.cg.String;

public class FindEvenLengthWordsinString {

	public static void main(String[] args)
	{
		String str="Writing a Java String program";
		String st[] = str.split(" ");
		String word="";
		int len=0;
		for(int i=0;i<st.length;i++) {
		if(st[i].length()%2==0)
		{
		int	len1 = st[i].length();
		
		if(len1>len)
		{
			len=len1;
			word=st[i];
		}
		}
		}
		System.out.println(word);
	}
	
}
