package com.basic.polymorphism.overriding;

public class DemoImpl extends Demo{

	public void M(Object a) {
		System.out.println("Integer ");
	}
	
	public static void main(String[] args) {
		
		Demo a=new DemoImpl(); 
		a.M(null);
	}
}

