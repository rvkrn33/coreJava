package com.basic.string;

public class StringBasic {
	public static void main(String[] args) {

//String is immutable -> once object is created then You can not chnage the behavior. 

		String s = "RavI"; // String Literal (String contant pool)

		String s1 = new String("ravi"); // String object (heap Memory as well as String contant pool)

		String s2 = new String();
		s2 = "ravi";
		
		//equals - (case sensitive)If you want to comapare of content of objects thengo for equals method
		//equalIgnoreCase- This is not case sensitive
		
		//boolean flag=s.equalsIgnoreCase(s1);
		
		//System.out.println(flag);
		
		if(s.equalsIgnoreCase(s1))
			System.out.println("s and s1 are equals ");
		else
			System.out.println("s and s1 are not equals ");
		
		if(s1.equals(s2)) 
			System.out.println("s1 and s2 are equals ");
		else
			System.out.println("s1 and s2 are not equals ");
		
		System.out.println(s+" "+s1+" "+s2);

	}
}
