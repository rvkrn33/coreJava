package com.basic.abstraction;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
	     String accountNo= sc.next();
	     
	     String role=sc.next();
	     
	     String opt=sc.next();
	     
	     Bank bank=new Bank();
	     
	     bank.transaction(accountNo, role, opt);
	     //cleark, manager, cashier
	}

}
