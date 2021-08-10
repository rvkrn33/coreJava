package com.exception;

import java.util.Scanner;

public class ExceptionScanner {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			int a=sc.nextInt();
			System.out.println("input number : "+a);
			
			int b=sc.nextInt();
			
			System.out.println("Addition : "+(a+b));
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		
	}
}
