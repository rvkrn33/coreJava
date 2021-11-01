package com.basic.reflection;

import com.basic.day2.Person;

 class ModifierTest extends Person{

	 
	 public void print() {
		 
		 System.out.println("--> "+super.age);
	 }
	
	public static void main(String[] args) {
		
		ModifierTest t=new ModifierTest();
		t.print();
	}
}
