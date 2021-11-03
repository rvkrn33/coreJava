package com.basic.day5;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		System.out.println("Start  Execution");
		try {
			new ExceptionTest3().m1();
		}catch(Exception e){
			System.out.println("Exception in main ---> "+e.toString());
		}
		
		
	}

	private void m1() {
		new Customer().m2();
	}
}
