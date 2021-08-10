package com.exception;

public class ExceptionBasic {

	public static void main(String[] args) {
		
		int a=50; //-10  -5  exception 5 10 15  ...50
		
		for (int i = -10; i < 49; i=i+5) {
			
			try {
				if(i!=0) {
					int result=a/i;
					System.out.println(result);  //10 20 exception 10 5 3 2 2 1 1 1 1
				}
			
			}
			catch(Exception e) {
				System.out.println("Exception occured in my application "+e.toString());
				e.printStackTrace();
			}
			
			
		}
	}
}
