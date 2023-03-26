package com.cg.Interface;

public class NestedClass implements NestedInterface.Test{

	@Override
	public void display() {
		System.out.println("interface method");
		
	}
	public void method() {
		System.out.println("nested class method");
	}
	
public static void main(String...args)
{
	NestedClass obj = new NestedClass();
	NestedInterface.Test x;
	//x.method();
	x=obj;
	x.show();
	obj.display();
	obj.method();
}
}
