package com.basic.oops;

public class Employee {

	private int age;

	private String name;
	private String email;
	private long phone;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}


		
}
