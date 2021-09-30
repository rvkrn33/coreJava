package com.exception.example;

import java.util.Scanner;

public class MainAppExample {

	public static void main(String[] args) throws NotValidException {
		
		
			int bal=2000;
		
			Scanner sc=new Scanner(System.in);
			if(sc.nextInt() < 18)
				throw new NotValidException("Not eligible "+sc.nextInt());
			else
			{
				
				//buisness 
				System.out.println("excution procced");
			}
			
			if(bal < 5000) {
				throw new NotValidException("Required Minimum balance "+bal);
			}
			MainAppExample m=new MainAppExample();
			try {
				m.m1("dd");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	private void m1(String s) throws Exception {
		
			new Order().m2(s);
		
	}
}
