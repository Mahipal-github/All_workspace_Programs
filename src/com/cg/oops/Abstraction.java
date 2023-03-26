package com.cg.oops;

public abstract class Abstraction {

	private int id;
	private String name;
	private double sal;
	public static int addSal(int sal)
	{
		sal = sal+1000;
		return sal;
	}
	public abstract int diffsal(int sal); 
}
