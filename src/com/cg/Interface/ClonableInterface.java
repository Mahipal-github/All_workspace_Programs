package com.cg.Interface;

public class ClonableInterface implements Cloneable {

	int i;
	String s;
	
	public ClonableInterface(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		 
		ClonableInterface obj = new ClonableInterface(10,"geeksforgeeks");
		ClonableInterface ob = (ClonableInterface)obj.clone();
		System.out.println(ob.i);
		System.out.println(ob.s);
	}

}
