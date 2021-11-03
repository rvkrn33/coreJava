package com.basic.day5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent{

	public void print() throws ArithmeticException{
		System.out.println("Parent method called");
	}
	
	public static void main(String[] args) throws Exception {
		Parent p =new Child();
		p.print();
	}
}

class Parent{
	public void print() throws Exception{
		System.out.println("Parent method called");
	}
}
