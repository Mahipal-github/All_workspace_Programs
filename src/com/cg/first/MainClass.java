package com.cg.first;

public class MainClass {

	public static void main(String[] args) {
	
		
	System.out.println(1+2+3+"welcome"+5+6);
	
	String s1="abcdef";
	String s2="gfg";
	String s3=new String("abc");
	String s5=new String("abc");
	String s6=new String("gfg");
	//String s4=s6.intern();
	if(s2==s6)
		System.out.println("==operator");
	if(s2.equals(s6))
		System.out.println("equals method");
	}
}

//main method should be public
/*we can overload static main method but cant override static methods, when we 
overload main methods the original main method gets called everytime,hence need to
invoke other methods from the main method*/
/*we can execute our program without main method in version prior to JDK7, 
after JDK 7 it will throw an exception to include main()*/
/*when String[] args is not included,the program will compile, but not run, because JVM will not recognize the main() 
 method. Remember JVM always looks for the main() method with a string type array as a parameter.
 */

