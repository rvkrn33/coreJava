package com.basic.oops;

public class Calculator {

	private int a=100; 
	
	Calculator(){
		System.out.println("Calculator default constructor");
	}
	public Calculator(int a){
		a=a;
		System.out.println("Calculator constructor => "+a);
	}
	
	public int add(int a, int b) {
		return (a+b);
	}
	

	public int sub(int a, int b) {
		return (a-b);
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator(800);
		
		Calculator c1=new Calculator(600);
		
		
	}
	
}
