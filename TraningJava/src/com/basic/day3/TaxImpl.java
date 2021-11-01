package com.basic.day3;

public class TaxImpl implements OldTax, GstTax{
	@Override
	public void tax() {
		
		System.out.println("Tax calculation "+OldTax.x);
		
	}
	@Override
	public void tax1() {
		
		
	}

	
	public static void main(String[] args) {
		
		TaxImpl tax=new TaxImpl();
		tax.tax();
		tax.tax1();
	}
	

}
