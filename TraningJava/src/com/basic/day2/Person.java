package com.basic.day2;

public class Person {

	// default - within the package
	// public - global scope
	//protected - within package or outside package- only for its child class
	//private - within the class
	
	//private -> default -> protected -> public
	
	//Properties
	private String name;
	 protected int age;
	long mobile;
	public String address;
	
	public Person() {}
	
	public Person(String name, int age, long mobile, String address) {
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eligibleForVoting(Person p) {
		
		if(p.age> 18) {
			System.out.println(p.name +" is eligile for voting");
		}
		else
			System.out.println(p.name +" is not eligile for voting");
	}
	
	public static void main(String[] args) {
		
		Person ajit = new Person("ajit",25);
		ajit.eligibleForVoting(ajit);
		
		Person ravi = new Person("ravi", 16);
		ravi.eligibleForVoting(ravi);
		
		Person sahil = new Person("sahil",21);
		sahil.eligibleForVoting(sahil);

	}

}
