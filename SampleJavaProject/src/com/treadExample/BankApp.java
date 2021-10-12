package com.treadExample;

public class BankApp {

	int balance=5000;
	
	synchronized void debit(int amount) {
		System.out.println("Debit process start ....");
		
		System.out.println("Account Balance : "+balance);
		
		if(balance < amount) {
			System.out.println("Less balance .. Waiting for credit/deposit");
			
			try {
				wait();
			}catch(Exception e) {
				System.out.println("Exception e : "+e.getMessage());
			}
		}
				
		balance=balance - amount;
		
		System.out.println("Amount deducted : "+balance);
	}
	
	synchronized void credit(int crAmt) {
		System.out.println("credit process start ....");
		
		balance=balance + crAmt;
		
		System.out.println("Credited amount :: "+balance);
		
		notify();
	}
}
