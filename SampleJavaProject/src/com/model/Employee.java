package com.model;

public class Employee {

	public static void main(String[] args) {
		//-128 to 127
		byte b=127;
		short s=129;
		int iw=2147483646;
		long l=2147483648343L;
		
		float f=4522.8552366555f;
		double d=4455222.55623584;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println("--> "+b);
		
		//My first program.
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
	}

}
