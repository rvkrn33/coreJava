package com.basic.wrapper;

public class WarpperClass {

	public static void main(String[] args) {
		
		String s="235.55";
		
		//converstion of String to Primitive data types
		//int i =Integer.parseInt(s);
		
		double d=Double.parseDouble(s);
		
		System.out.println(s);
		
		//Primitive to String 
		double ss=4523.66699;
		
		String str= String.valueOf(ss);
		
		System.out.println(str);
		
		
		Integer is=new Integer(588);
		int a=is; // unBoxing - Object to Primitive conversion
		
		double f=7855.66;
		
		Double ds=new Double(f); // Autoboxing - Primitive to Object conversion
		
	}
}
