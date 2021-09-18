package com.basic.oops;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Samsung extends Mobile{

	public static  void print(String ram, String company) {
		System.out.println("Samsung mobile details : "+ram+", "+company);
	}

	public static void main(String[] args) {
		Mobile m=null;
		Scanner sc=new Scanner(System.in);
		String brandName=sc.next();
		
		if(brandName.equals("Samsung")) {
			 m=new Samsung(); 
			m.print("32", "Samsung");
		}
		
		if(brandName.equals("MI")) {
			 m=new MI(); 
			m.print("32", "MI");
		}
		
				
	}
}

class MI extends Mobile{

	public static void print(String ram, String company) {
		System.out.println("MI mobile details : "+ram+", "+company);
	}
	
}
