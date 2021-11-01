package com.basic.day3;

//oldTaxcalculation <- GstTaxCalculation <- TaxLatest   (Multilevel )

public class TaxLastest extends GstTaxCalculation{

	TaxLastest(){
		System.out.println("TaxLastest");
	}
	
	public void calculate() {
		super.TaxCalculation(45222);
		super.message();
	}
	
	public static void main(String[] args) {
		new TaxLastest().calculate();
		
	}
}
