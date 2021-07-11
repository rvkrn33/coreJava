package com.model;

 public class Customer {

	 public int i;
	 public String name="ravi";
	 
	 Customer(){
		System.out.println("Default Constructor"); 
	 }
	 
	 public Customer(int i){
		System.out.println("Parameterized Constructor"); 
		 this.i=i;
	 }
	
	 public Customer(int i, String name){
		System.out.println("Parameterized Constructor"); 
		 this.i=i;
		 this.name=name;
	 }
	
	 void printEmpDetails() {
		 System.out.println("Print details"); 
	}
	 
	/*
	 * public static void main(String[] args) {
	 * 
	 * Customer c=new Customer(5,"ajit"); c.i=45; System.out.println(c.i); //45
	 * System.out.println(c.name); //ajit }
	 */
}
