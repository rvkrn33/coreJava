package com.exception.example;

public class ExceptionExampleTry {

	public static void main(String[] args) {
		String userName="ravi";
		String oldPassword="ravi123";
		String newPass=null;
		
		try {
			
			String[] st= {"sdf","gggg"};
			String s="ravi";
			
			newPass="abc";
			oldPassword=null;
			
			int i=oldPassword.length();
			
				//System.out.println("Result -> "+s.charAt(10));
				
				System.out.println("String --> "+st[5]);
			
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException ");
		}
	catch (IndexOutOfBoundsException e) {
		System.out.println(" IndexOutOfBoundsException");
	}
		catch (Exception e) {
			System.out.println("General Exception "+e.getMessage() +" --> "+e.toString());
			e.printStackTrace();
			
		}
		finally {
			//rollback
			System.out.println("rollback");
			oldPassword="ravi123";
			newPass=null;
			System.out.println("finally executed ...");
		}
		
	}
}
