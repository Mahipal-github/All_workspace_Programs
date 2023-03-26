package com.cg.practice;

import java.util.Arrays;
import java.util.TreeSet;

public class FarthestFromZero {

	public int farthestElementFromZero(int arr[],int n)
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
	    for (int i=0; i<n; i++){
	          ts.add(arr[i]);
	    } 
	  int maxV = ts.last();
	  int minV = ts.first();
	  
	  if(Math.abs(minV) >= maxV){
	      return minV;
	  }
	  return maxV;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {-100,-200,5,600,200,500};
		int n=6;
		FarthestFromZero obj = new FarthestFromZero();
	int result = obj.farthestElementFromZero(arr,n);
	System.out.println(result);
}

}

/*
 * SELECT c.name Child, 
       MAX(CASE WHEN p.gender = 'F' THEN p.name END) Mother, 
       MAX(CASE WHEN p.gender = 'M' THEN p.name END) Father
FROM relation r
INNER JOIN people c ON c.id = r.cid
INNER JOIN people p ON p.id = r.pid
GROUP BY r.cid, c.name;
*/
