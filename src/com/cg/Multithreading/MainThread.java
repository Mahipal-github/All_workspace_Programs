package com.cg.Multithreading;

public class MainThread extends Thread{

	public static void main(String[] args)
	{
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		t.setName("Geeks");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setPriority(10);
		System.out.println(t.getPriority());
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		Thread ct = new Thread() {
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("child thread");
				}
			}
		};
		System.out.println(ct.getPriority());
		ct.setPriority(MAX_PRIORITY);
		System.out.println(ct.getPriority());
	}

}
