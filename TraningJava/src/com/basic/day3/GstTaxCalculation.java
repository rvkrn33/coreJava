package com.basic.day3;

public class GstTaxCalculation extends OldTaxcalculation{

	double gstTax;
	
	GstTaxCalculation(){
		System.out.println("calling GstTaxCalculation ");
	}
	
	public void TaxCalculation(double taxableAmount) {
		//Provide tax calculation with GST
		
		super.TaxCalculation(taxableAmount);
		
		super.tax=56633;
		System.out.println("fetch parent valiable --> "+super.tax);
		
		gstTax=7800.66;
		System.out.println("Calculate old tax with gst >> " +gstTax);
		
		super.message();
		
	}
	
	public static void main(String[] args) {
		
		GstTaxCalculation gst =new GstTaxCalculation();
		gst.TaxCalculation(4522222.88);
		
		Object obj= gst;  //upcasting
		
		OldTaxcalculation old=gst; //upcasting
		gst=(GstTaxCalculation) old;  //parent class obj assign to child class 
		
		gst=(GstTaxCalculation) obj;  //down casting
		
		int i=9 ;
		double d=i; //implicit 
		
	}
}

