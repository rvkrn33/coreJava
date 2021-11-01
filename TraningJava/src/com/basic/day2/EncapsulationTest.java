package com.basic.day2;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Customer c=new Customer();
		
		c.setCity("Pune");
		
		System.out.println("-->"+c.getCity());
		
c.setCity("Mumbai");
		
		System.out.println("-->"+c.getCity());
	}
}
