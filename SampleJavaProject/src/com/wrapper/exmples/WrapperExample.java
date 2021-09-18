package com.wrapper.exmples;

public class WrapperExample {

	//All Converstions
	//Wrapper class - Helps to convert premitive data type to Object
	//Wrapper Classes are Integer, Double, Long, Boolean, Character, Float
	
	public static void main(String[] args) {
		
		//1. String to int  and int to String 
		String a="123"; 
		int num=Integer.parseInt(a);
		System.out.println("Integer Value : "+num);
		
		String c=String.valueOf(num);
		
		System.out.println("String "+c);
		
	}
	
}
