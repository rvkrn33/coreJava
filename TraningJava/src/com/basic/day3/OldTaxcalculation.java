package com.basic.day3;

public class OldTaxcalculation {

	double tax=552;
	
	public OldTaxcalculation(){
		System.out.println("calling OldTaxcalculation constructor");
	}
	
	public void TaxCalculation(double taxableAmount) {
		//Provide tax calculation without GST
		tax=4200.66;
		System.out.println("Calculate old tax without gst >> " +tax);
	}
	
	public void message() {
		System.out.println("Hello");
	}
	
}
