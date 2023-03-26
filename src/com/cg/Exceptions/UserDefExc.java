package com.cg.Exceptions;

public class UserDefExc {
	
	public int findEmpId(int id,int den) 
	{
		return id/den;
		
	}
	public static void main(String[] args) {
		UserDefExc obj = new UserDefExc();
		System.out.println(obj.findEmpId(1,0));
	}

}
