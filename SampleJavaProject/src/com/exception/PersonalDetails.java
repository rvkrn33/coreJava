package com.exception;

public class PersonalDetails {

	public void m2(String name) throws NullPointerException,ArithmeticException{
		System.out.println("Personal details");
		System.out.println("name : "+name);
		
		new EducationalDetails().m3(name);
	}
}
