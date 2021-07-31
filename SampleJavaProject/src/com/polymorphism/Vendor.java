package com.polymorphism;

public class Vendor {

	private String name;
	private int age;
	
	public Vendor(){
		System.out.println("default constructor call");
	}
public Vendor(String name){
	System.out.println("parameter constructor call");
		this.name=name;
	}
	
	public final String getDatils(int a,String name) {
		System.out.println("Print details : "+name);
		return name;
		
	}
	
	public final void getDatils(String name,int age) {
		System.out.println("Print details : "+name +", "+age);
	}
	
	public static void main(String[] args) {
		Vendor v=new Vendor("amit"); //paramer
		v.getDatils("ravi",45);
		
	}
}
