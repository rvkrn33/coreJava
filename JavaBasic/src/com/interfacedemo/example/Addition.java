package com.interfacedemo.example;

public interface Addition {

	public void add(int a, int b);
	
	public default void sample() {
		System.out.println("default "); // jdk1.8
	}
	
	public static void demo() {
		System.out.println("demo");
	}
}
