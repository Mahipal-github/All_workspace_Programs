package com.cg.practice;

public class String_Occurences {
	public static void main(String[] args)
	{
		int count=0;
	String str = "I am am am learning Java Java language";
	String[] str2 = str.split(" ");
	System.out.println("finding");
		for(int i=0;i<str2.length;i++)
	{
		for(int j=i+1; j<str2.length;j++ )
		{
		
			if(str2[i].equals(str2[j]))
			{
				count++;
				String str3=str2[j];
				System.out.println(count);
				
					
			}
			
		}
		
	}
		//System.out.print(count);
/*	for(int i=0; i<str2.length;i++) {
	System.out.print(str2[i]+" ");
	}
	*/
	}

}
