package com.treadExample;

//Thread
//public class Customer extends Thread{

//Runnable
public class Customer implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <10; i++) {
			String threadName=Thread.currentThread().getName() ;
			
			if(threadName.equals("Ravi")) {
				if(i%2==0) 
					System.out.println(Thread.currentThread().getName() +"--> "+i);
			}
			if(threadName.equals("Amit")) {
				if(i%2!=0) 
					System.out.println(threadName+"--> "+i);
			}
			
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		//Customer c1=new Customer(); //As a thread
		Runnable runnable =new Customer();
		
		Thread c1=new Thread(runnable);
		
		c1.setName("Ravi"); //even no
		//c1.setPriority(5); //0 5 10
		
		//Customer c2=new Customer(); 
		Runnable r=new Customer();
		Thread c2=new Thread(r);
		c2.setName("Amit"); //odd number
		//c2.setPriority(10);
		
		c1.start();
		c2.start();
		System.out.println("Execution completed");
		
		/*
		 * for (int i = 1; i <11; i++) { System.out.println("main --> "+i);
		 * //Thread.sleep(2000); }
		 */
	}

}
