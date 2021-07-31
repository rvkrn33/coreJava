package com.string;

public class stringBasic {

	public static void main(String[] args) {
		
		String s="ravi"; //Literal  --> heap (String constant pool)
		
		String s1=new String("ravi");  //object --> heap
		
		boolean flag=(s==s1); // primitive (int ,double , long ,char)
		
		boolean c=(s.equals(s1));
		
		System.out.println("References :"+flag+" "+s.hashCode()+" "+s1.hashCode());
		System.out.println("Containt :"+c);
		
		
	}
}
