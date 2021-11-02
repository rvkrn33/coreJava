package com.basic.day4;

public class StringExample {

	public static void main(String[] args) {
		
		String ss="abc"; // String literal  --> SCP
		
		String str=new String("abc"); // -> heap area
		
		String s=new String("abc"); // object -> heap area
		 
		
		System.out.println(" == "+(s==ss)); // comapre the reference 
		System.out.println("equals "+(s.equals(ss))); // compare the actual value 
		
		System.out.println(s.hashCode() +" : "+ss.hashCode() +" : "+str.hashCode());
		
		
		Customer c=new Customer();
		c.setId(1);
		c.setName("Kavita");
		c.setAddress("Pune");
		
		Customer c1=new Customer();
		c1.setId(1);
		c1.setName("Kavita");
		c1.setAddress("Pune");
		
		System.out.println(c.equals(c1)); 
		
	}
}
