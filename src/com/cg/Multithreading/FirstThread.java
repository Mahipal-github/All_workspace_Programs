package com.cg.Multithreading;

public class FirstThread extends Thread{

	public void run() {
		System.out.println("thread1");
		//System.out.println(Thread.getState());
	}
	
	public static void main(String[] args)
	{
	FirstThread ft = new FirstThread();
	ft.run();
	System.out.println(ft.currentThread());
	}
}
	
	


