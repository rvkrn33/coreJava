package com.exception.example;

public class Calculator {

	
	public static void main(String[] args) {
		try {
		
			int num=-3; 
			for (int i = 1; i < 8; i++) {
					System.out.println("result -> "+(i/num));
				num++;
			}
		
		} catch (ArithmeticException e) {
			System.out.println("Arith ..block");
			e.printStackTrace();
		}
	 catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}
}


// o/p  0 -1 -3 exception   5 3 2