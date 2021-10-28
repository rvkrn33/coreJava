package basic.datatype;

import java.io.*;

public class DataTypeExample {

	static int k;
	static char ch;
	static boolean v;
	static float fl;
	
	public static void main(String[] args) {
		
		byte b=100;
		byte n= 127; 
		//byte s= 128;
		
		short sh=32767;
		//short h=32768;
		
		int i=1620770569;
		//int j=2620770569;
		
		long g= 7845125428569L; 
		
		//Implicit casting vs Explicit 
		
		i=sh; //implicit 
		
		i=(int) g; //explicit

		System.out.println("Result : "+i);
		
		char c='F'; 
		boolean flag=true;
		
		float f=5286.6585885555222f;
		
		System.out.println(f);
		
		double d= 854422.965541225588;
		
		System.out.println(d);
		
		
		
		System.out.println("Values : "+k +" "+ch +" "+v+" "+fl);
		
		
		
	}

}
