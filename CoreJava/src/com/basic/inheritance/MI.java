package com.basic.inheritance;

public class MI extends Mobile {

	public MI() {
		super();
		System.out.println("Child constructor ..");
	}
	
	public void features(String model) {
		System.out.println("Advance features");
	}
	
	public void printAllMobileDtls() {
		System.out.println("printAllMobileDtls");
		super.getMobileDetails();
		super.camera="64 MP";
		System.out.println("camera -> "+super.camera);
	}
	
	public static void main(String[] args) {
		
		/*
		 * Mobile m; // Reference m=new Mobile(); //object creation
		 * m.features("MI-basic"); // parent method
		 */
		MI mi=new MI();
		mi.features("MI-advance"); //child method
		mi.printAllMobileDtls();
		
		/*
		 * Mobile mobile= new MI(); //Parent holds child object
		 * mobile.features("MI-high Advance");// Child method called
		 */
		//MI miObj= new Mobile(); // child cant not hold parent object
		
	}
}
