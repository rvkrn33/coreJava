package com.exception;

public class ExceptionString {

	public static void main(String[] args) {
		
		String[] arr=new String[2];
		
		try {
			arr[0]="ravi";
			arr[1]="patil";
			//arr[2]="abc";
			
			String s=null;
			System.out.println("--> "+(s.substring(2)));
			
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Exception occured  : "+e.toString());
			
		} /*
			 * catch(NullPointerException e) {
			 * System.out.println("Exception occured Nullpointer: "+e.toString()); }
			 */
		catch( Exception ex) {
			System.out.println("Handle All type of exception ");
		}
		finally {
			System.out.println("finally called");
		}
		
		
		
	}
}
