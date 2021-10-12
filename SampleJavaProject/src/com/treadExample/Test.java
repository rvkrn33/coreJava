package com.treadExample;

public class Test implements Runnable {

	BankApp bank=new BankApp();
	
	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("debit")) {
			bank.debit(6000);
		}
		
		if(Thread.currentThread().getName().equals("credit")) {
			bank.credit(4000);
		}
	}
	
	public static void main(String[] args) {
		
		Runnable bank=new Test();
		
		Thread t1=new Thread(bank);
		t1.setName("debit");
		t1.start();
		
		Thread t2=new Thread(bank);
		t2.setName("credit");
		t2.start();
		
		/*
		 * new Thread() { public void run() { bank.debit(6000); } }.start();
		 * 
		 * 
		 * new Thread() { public void run() { bank.credit(4000); } }.start();
		 */
	}

	
}
