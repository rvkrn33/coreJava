package com.basic.Exception;

public class Vendor {
	
	public void calculation() throws ArithmeticException{
		m1();
	}

	private void m1() throws ArithmeticException {
		m2();
	}
	
	private void m2()  throws ArithmeticException{
		int a = 2;
		int b = 0;
		int c = 0;
		String s ="ravi";

			if (a % 2 == 0) {
				System.out.println("Even"); // Even
				c = a / b; // Exception
			}

			int length = s.length(); //Exception
			System.out.println("Lenght >> " + length);
	}
	
	public static void main(String[] args){
		
		try {
			new Vendor().calculation();
		}catch(Exception e) {
			System.out.println("Exception occures ------"+e.toString());
			e.printStackTrace();
		}
		
	}
}
