package com.string.example;

public class StringMethods {

	public static void main(String[] args) {
		
		String a="ravi patil";
		System.out.println(a.toUpperCase() + " "+a.toLowerCase());
		
		char[] ch=a.toCharArray();
		
		System.out.println(a.substring(4));
		
		System.out.println(a.substring(2,4));
		
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("t"));
		System.out.println(a.lastIndexOf("i"));
		
		System.out.println(a.replace("pa", "sa"));
		
		char i='c';
		
		System.out.println(String.valueOf(i));
	}
}
