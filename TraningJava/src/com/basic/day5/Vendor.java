package com.basic.day5;

public class Vendor {

	public void m3() {
		
		try {
			new Supplier().m4();
		}catch(Exception e) {
			System.out.println("Handle exception in Vendor :: "+e.getMessage());
			
		}
	
	}
}
