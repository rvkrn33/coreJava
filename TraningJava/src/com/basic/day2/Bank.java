package com.basic.day2;

import java.util.Scanner;

public class Bank {

	private int account; 
	private String role;
	
	public void transaction(String role, int acc) {
		
		if(role.equals("Cashier")) {
			System.out.println("Audit or tally "+acc);
		}
		else if(role.equals("Cleark")) {
			System.out.println("Account open/close "+acc);
		}
		else if(role.equals("Manager")) {
			System.out.println("approval loan for this "+acc);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter your role");
		String role=sc.next();
		
		new Bank().transaction(role, 451254252);
	}
}
