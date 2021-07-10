package com.basic.inheritance;

public class Mobile {

	public int ram;
	public String camera;
	
	public Mobile() {
		System.out.println("Parent constructor ..");
	}
	
	public void getMobileDetails() {
		System.out.println("Display All feature");
	}
	
	public void features(String model) {
		System.out.println("Basic features");
	}
}
