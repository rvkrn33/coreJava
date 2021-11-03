package com.basic.day5;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		try {
			String st="sachin";
			
			System.out.println("Result "+ st.substring(4)); //StringIndexOutOfBoundsException
			
			String[] s=new String[3];
			
			//s[5]= "ravi"; // ArrayIndexoutOfbountException
			
			st="fff";
			System.out.println(st.charAt(1));
			
			System.out.println("--> "+s);
		}
		catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Exception >>> "+e.toString());
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Exception ------"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Generic Exception ------"+e.getMessage());
		}
		finally {
			System.out.println("cleaning opertion ");
		}
	}
}
