package com.basic.day5;

public class StaticMainApp {

	static int accountBal;
	static int minBal;
	
	String name;
	
	static {
		System.out.println("Static block excecution Account balance ");
		System.out.println("1 accountBal :: "+accountBal);
		System.out.println("1 minBal :: "+minBal);
		accountBal=5000;
		minBal=2000;
		
		print("2 accountBal :: "+accountBal);
		print("2 minBal :: "+minBal);
	}
	
	public static void print(String msg) {
		System.out.println("Print method execut");
		System.out.println(msg);
	}
	
	StaticMainApp(String name){
		System.out.println("Constructor called ");
		this.name=name;
		System.out.println("Name :::: "+this.name);
	}
	
	//instance block 
	{
		System.out.println("Instance block execute");
		name="ravi";
		System.out.println("name : "+name);
	}
	
	public static void main(String[] args) {
		System.out.println("Excute main method in StaticMainApp ******* ");
		new StaticMainApp("ajay");
	}
	
	public static void main(int[] args) {
		System.out.println("Excute main method ");
		new StaticMainApp("ajay");
	}

}
