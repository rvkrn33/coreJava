package com.basic.programs;

import java.util.Scanner;

public class DataTypeSample  {

	public static void main(String[] args) {
		//byte --> short --> char --> int --> float--> double--> long
		
		byte b=127; //-128 to 127
		
		int i= 762077051;
		
		//byte to int --> implicit casting
		
		i=b;
		
		System.out.println("implicit casting --> "+i);
		
		//int to byte --> Explicit Casting
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		b=(byte)a; //Data loss
		
		System.out.println("Explicit casting --> "+b);
		
		char c=65;
		
		System.out.println("Character :: "+c);
		
		DataTypeSample data=new DataTypeSample(); //subclass
		
		Object obj =new Object(); //super
		
		obj=data; 
		
		data=(DataTypeSample) obj;  //explicit casting
		
		
	}
}
