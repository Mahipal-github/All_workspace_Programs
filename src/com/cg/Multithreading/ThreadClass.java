package com.cg.Multithreading;

public class ThreadClass extends Thread{

	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("thread class");
			try {Thread.sleep(1000);} catch(Exception e) {};
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadClass tc1 = new ThreadClass();
		ThreadClass tc2 = new ThreadClass();
		tc1.start();
		tc1.join();
		System.out.println("with join");
		tc2.start();
	}

}
