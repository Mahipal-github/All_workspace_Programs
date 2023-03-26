package com.cg.Inheritance;

public class ChildClass extends ParentClass{

	public void display()
	{
		super.display();
		System.out.println("child class display");
	}
	
	public static void main(String[] args) {
		
		ChildClass pc = new ChildClass();
		pc.display();

	}

}
