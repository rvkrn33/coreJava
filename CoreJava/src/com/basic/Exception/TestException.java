package com.basic.Exception;

public class TestException {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = 0;
		String s = "ravi";

		try {
			if (a % 2 == 0) {
				System.out.println("Even"); // Even
				c = a / b; // Exeption
			}

			int length = s.length();
			System.out.println("Lenght >> " + length);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception ArithmeticException" + e);
		} catch (NullPointerException e) {
			
			System.out.println("NullPointerException " + e);
		}
	 catch (Exception e) {
		
		System.out.println("Genric Exception" + e);
	}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Finish");
	}
}
