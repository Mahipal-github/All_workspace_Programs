package com.cg.Multithreading;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Runnable interface");
			try{Thread.sleep(1000);} catch(Exception e) {}
		}

	}
	public static void main(String[] args) {

		Runnable r = new RunnableInterface();
		Thread t  = new Thread(r);
		t.start();

	}

}
