package com.basic.polymorphism.overloading;

public class Calculator {
	// Compiler decide based on parameters 
	//(method name should be same)
	//Check parameter count then parameter sequence and data types and then hierachy
	
	//static and final can be overlaoded
	//We can overloading constructor as well
	
	private String name;
	
	Calculator(){
		System.out.println("Default constructor");
	}
	
	Calculator(String name){
		System.out.println("Parameterised constructor");
		this.name=name;
	}
	
	public final void addition(long b) {
		System.out.println("First : ");
	}
	
	public final void addition(int b) {
		System.out.println("Second : ");
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator(); // default constructor
		c.addition(2l); 
		
		
	}
}
