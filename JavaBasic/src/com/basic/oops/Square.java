package com.basic.oops;

public class Square extends Multiplication{

	Square(){
		System.out.println("Square default constructor");
	}
	
	public void cal(int a, int b) {
		System.out.println(super.add(a, b)); // 15
		System.out.println(super.sub(a, b)); //5
		System.out.println(super.multi(a, b));//50
		System.out.println(a*a); //100
	}
	
	public static void main(String[] args) {
		Square s =new Square();
		s.cal(10, 5);
		
	}
}
