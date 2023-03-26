package com.cg.Interface;

public class InterfaceClass implements Interface1,Interface2{

	public static void main(String[] args) {
		//Interface1.super.print();
		Interface1 i1 = new InterfaceClass();
		i1.print();
		Interface2 i2 = new InterfaceClass();
		i2.show();
		

	}

}
