package com.basic.test;

public class InterfceTest implements Abc, Xyz{

	@Override
	public void addition(int a, int b) {
		
		System.out.println((a+b));
	}
	
	public static void main(String[] args) {
		
		Abc b; //reference
		 b=new InterfceTest();
		
		InterfceTest t=new InterfceTest();
		t.addition(45, 5);
	}

}
