package com.basic.day5;

public class AccountBalanceException extends Exception {

	public AccountBalanceException(String msg){
		//System.out.println(msg);
		m1(msg);
	}
	
	public void m1(String s) {
		System.out.println(s);
	}
}
