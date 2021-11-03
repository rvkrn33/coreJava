package com.basic.day5;

public class TestException {

	public static void main(String[] args) {
			for (int i = -3; i < 3; i++) {
				int result=0;
				
				try {
					result = 2/i;
					
					String s=null;
					
					System.out.println("Lenth : "+s.length());
					
				} catch (ArithmeticException e) {
					e.printStackTrace();
				}
				catch (Exception e) {
					System.out.println("Handle Null pointer exception ");
					e.printStackTrace();
				}
				
				System.out.println(">>> "+result);
				
				if(result==0) {
					System.out.println("a. Result is not even and odd");
				}
				else if(result%2==0)
					System.out.println("b. Result is even");
				else
					System.out.println("c. Result is odd");
			}
			
		
		
	}
}
// 2/-3 	2/-2	2/2		2/0			2/1		2/2		
// 0 		-1 		-2 		exception   2		1
// a  		c  		b  		a			b		c
