package com.cg.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args)
	{
		 Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		System.out.println(hm);
		hm.put(4,"D");
		hm.put(3, "E");
		System.out.println(hm);
		hm.remove(4);
		System.out.println(hm);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.size());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey()+" : "+m.getValue());
			if(m.getKey()==3)
			{
				hm.remove(3);
				
				hm.put(4,"E");
			}
			
		}
		
			System.out.println(hm);
	
	
	}

}
