package com.basic.abstractExample;

class TaxCalculatorImpl extends TaxCalculator{

	@Override
	public void monthlyDeduction() {
		System.out.println("monthlyDeduction implementation");
	}
	
	public static void main(String[] args) {
		TaxCalculator t;
		t=new TaxCalculatorImpl();
		t.commonDeduction();
		
		t.monthlyDeduction();
		
	}
	
}