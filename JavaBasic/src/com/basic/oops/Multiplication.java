package com.basic.oops;

public class Multiplication extends Calculator{

	private int a;
	private int b;
	Multiplication(){
		System.out.println("Multiplication Default Constructor ");
	}
	public Multiplication(int a,  int b) {
		this.a = a;
		this.b = b;
	}
	
	public int multi(int a, int b) {
		System.out.println(super.add(a, b));
		System.out.println(super.sub(a, b));
		return (a*b);
	}
	
	public static void main(String[] args) {
		Multiplication m =new Multiplication();
		System.out.println(m.multi(10, 5));
		
	}
	
}
