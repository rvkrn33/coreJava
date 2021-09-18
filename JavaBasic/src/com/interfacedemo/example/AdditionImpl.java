package com.interfacedemo.example;

public class AdditionImpl implements Addition, Substraction{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition : "+(a+b));
	}

	@Override
	public void sub(int a, int b) {
	System.out.println("Sub :"+(a-b));
		
	}

	public static void main(String[] args) {
		
		AdditionImpl impl=new AdditionImpl();
		impl.add(10, 5);
		
		Addition a; // reference 
		//a=new Addition(); // cant create the object 
		a=new AdditionImpl();
		
		a.add(20, 10);
		
		Substraction b; // reference 
		//b=new Addition(); // cant create the object 
		b=new AdditionImpl();
		
		b.add(20, 50);
		
		b.sub(90, 50);
		
		Addition.demo(); //static
		a.sample(); //default
		
	}

}
