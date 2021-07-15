package com.basic.string;

public class StringMethods {

	//equals - object content (String data)
	//== -> references address
	
	public static void main(String[] args) {
		
		
		String s="ravi Patil, Address- Pune"; //SCP
		//String s1="ravi";
		String s1=new String("raviKIran "); // SCP HM
		
		if(s.equals(s1))
			System.out.println("s and s1 are equals "); // 
		else
			System.out.println("s and s1 are not equals ");
		
		
		if(s==s1)
			System.out.println("s and s1 are equals ");
		else
			System.out.println("s and s1 are not equals "+s.hashCode()+"  "+s1.hashCode() );//
		
		System.out.println(s.equals(s1)+ " "+(s==s1)); // true false
		
		
		System.out.println("Upper  "+s.toUpperCase());
		
		System.out.println("Lower  "+s.toLowerCase());
		
		
		System.out.println("length "+s.length() +" "+s1.length());
		

		System.out.println("substring  "+s.substring(11));
		System.out.println("substring  "+s.substring(4,10));
		
		char[] c=s.toCharArray();
		
		for (char ch:c) {
			System.out.println(ch);
		}
		
		
	}
}



/*

String s="sachin tendulkar";

o/p:
->sachin 
-> tendulkar
-> Sachin Tendulkar
character count
-> s -> 1
-> a->2
*/