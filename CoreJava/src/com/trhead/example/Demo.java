package com.trhead.example;

public class Demo  implements Runnable{

	@Override
	public void run() {
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("thread enters ");
			
			synchronized (this.getClass()) {
				System.out.println("--> "+i);
				i++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Thread t1=new Thread(d);
		t1.setName("first");
		Thread t2=new Thread(d);
		
		t2.setName("second");
		t2.start();
		t1.start();
		
	}

}
