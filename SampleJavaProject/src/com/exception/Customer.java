package com.exception;

public class Customer {

	private void m1(String name) throws NullPointerException,ArithmeticException {
			new PersonalDetails().m2(name);
	}
	
	public static void main(String[] args) {
		try {
			new Customer().m1("ravi");
		}catch(NullPointerException | ArithmeticException e) {
			System.out.println("Exception occured : "+e.toString());
			System.out.println("Please check the data ");
		}
		
	}

}
