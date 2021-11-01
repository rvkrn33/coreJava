package com.basic.day3;

public class CustomerDataImpl extends CustomerData{

	@Override
	public void insertData() {
		
		System.out.println("insert dat implementation");
	}

	
	public static void main(String[] args) {
		
		CustomerData cust;
		
		cust=new CustomerDataImpl();
		
		cust.printCustomer();
		cust.insertData();
		
	}
}
