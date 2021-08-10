package com.exception;

public class EducationalDetails {

	public void m3(String name) throws NullPointerException, ArithmeticException{
		
		System.out.println("Education details ");
		name=null;
		System.out.println(name.length());
	}
}
