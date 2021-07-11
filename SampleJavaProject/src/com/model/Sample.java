package com.model;

public class Sample {

	
	public static void main(String[] args) {
		
		Vendor v=new Vendor();
		//v.name="ravi";
		//v.phone=875412356;
		
		v.setName("Ravi");
		v.setPhone(875412356);
		
		System.out.println(v.getName()+" --> "+v.getPhone());
		
	}
}
