package com.threds.example;

public class Sample implements Runnable{

//public class Sample extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			
			if(Thread.currentThread().getName().equals("Ravi")) {
				if(i%2!=0)
					System.out.println("Ravi > "+i);
			}
			
			if(Thread.currentThread().getName().equals("Amit")) {
				if(i%2==0)
					System.out.println("Amit > "+i);
			}
		}
}
	
	public static void main(String[] args) {
		
		//Sample t1= new Sample(); //object as a thread
		
		Runnable r=new Sample();
		
		Thread t1=new Thread(r);
		t1.setName("Ravi");
		
		//Sample t2= new Sample(); 
		Thread t2=new Thread(r);
		t2.setName("Amit");
		
		Long start=System.currentTimeMillis();
		t2.start();
		t1.start();
		
		System.out.println("Time taken : "+(System.currentTimeMillis()-start));
		/*
		 * for (int i = -10; i < -5; i++) {
		 * 
		 * System.out.println(Thread.currentThread().getName()+" -> "+i); }
		 */
	}
}
