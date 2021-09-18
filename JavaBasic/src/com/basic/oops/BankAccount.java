package com.basic.oops;

import java.util.Scanner;

class BankAccount{

	private static String loanStatus;
	private static String accountStatus;
	
	public static  void checkStatus(String role){
		
		if(role.equals("manager")){
			loanStatus="pending";
			System.out.println(loanStatus);
		}
		
		if(role.equals("cleark")){
		accountStatus="Active";
			System.out.println(accountStatus);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String role=sc.next();
		checkStatus(role);
	}
}