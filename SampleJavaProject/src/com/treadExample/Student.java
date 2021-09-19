package com.treadExample;

public class Student {

	int balance=10000;
	
	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("Withdraw .. ");
		
		if(this.balance < amount) {
			System.out.println("Less balance... waiting for deposit");
			wait(); 
		}	
			this.balance= this.balance - amount;
			
			System.out.println("Withdraw completed ...."+this.balance);
	}
	
	synchronized void deposit(int amount) throws InterruptedException {
		System.out.println("Deposit... ");
		
		Thread.sleep(20000);
		this.balance= this.balance + amount;
		
		System.out.println("Deposit  completed ...."+this.balance);
		
		notify();
	}
}
