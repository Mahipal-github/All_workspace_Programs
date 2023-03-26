package com.cg.Interface;

public class NestedInterface {

	interface Test{
		void display();
		default void show()
		{
			System.out.println("show method");
		}
	}
	public void method()
	{
		System.out.println("class method");
	}
}
