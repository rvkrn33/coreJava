package com.basic.day5;

import java.io.IOException;
import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) throws AccountBalanceException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter withdraw amount ");
		
		int amt= sc.nextInt();
		
		try {
			transaction(amt);
		} catch (AccountBalanceException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("transaction is rollback "+(Account.balance+ amt));
			
			e.printStackTrace();
		}
		
	}

	private static void transaction(int amt) throws AccountBalanceException, IOException {

		if(amt >= (Account.balance- Account.minBal)){
			throw new AccountBalanceException("Min balance is required "+Account.minBal);
		}else {
			System.out.println("Transaction Successfull "
					+ ".. Account Balance ::  "+ (Account.balance- amt));
			//throw new IOException();
		}
		
	}
}
