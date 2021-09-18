package com.basic.abstractExample;

public abstract class TaxCalculator {

	//concreate , abstract 
	
	//concreate method --- Exact imlementation 
	public void commonDeduction(){
		System.out.println("common deductino ");
	}
	
	public abstract void monthlyDeduction();
}


