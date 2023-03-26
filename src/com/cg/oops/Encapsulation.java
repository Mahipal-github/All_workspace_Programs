package com.cg.oops;

public class Encapsulation {
	
	private int a;
	private int b;
	
	public Encapsulation(int a, int b) {
		this.a=a;
		this.b=b;
		} 

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return ("Encapsulation example");
	}
	
	
}

