package com.cg.Multithreading;

public class SynchronizationEg extends Thread{

	public synchronized void run()
	{
		for(int i=1;i<=3;i++)
		{
		System.out.println("hi");
		}
	}
	public static void main(String[] args) {
	SynchronizationEg se1 = new SynchronizationEg();
	SynchronizationEg se2 = new SynchronizationEg();
	se1.start();
	try{Thread.sleep(1000);} catch(Exception e) {};
	se2.start();
	}
	
}
