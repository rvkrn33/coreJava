package com.basic.day2;

public class OperatorsBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arithmatic(2,3);
		
		//logical(10,50);
		
		//increment_decrement(5);
		
		conditional(45,"ravi44");
	}

	private static void conditional(int i, String s) {
		// TODO Auto-generated method stub
		
		boolean flag= 45==45?true:false;
		
		String result = "ravi".equals(s)?"Both r same": "Not same";
		
		System.out.println("flag "+flag);

		System.out.println("Result "+result);
	}

	private static void increment_decrement(int i) {
		i++;  // ++i
		System.out.println(" ++ "+(i));
		i--; // --i
		System.out.println("-- "+(i));
		
		i+=i;
		System.out.println("+= "+(i));
		
		i-=i;
		System.out.println("-= "+(i));
		
	}

	private static void logical(int i, int j) {
		boolean result= i < j;
		System.out.println("< "+ result); // true
		
		result= i > j;
		System.out.println("> "+ result); //false
		
		result= i <= j;
		System.out.println("<= "+ result);// true
		
		result= i >= j;
		System.out.println(">= "+ result); //false
		
		result= i == j;
		System.out.println("== "+ result);//false
		
		result= i != j;
		System.out.println("!= "+ result);//true
	}

	private static void arithmatic(int i, int j) {
		System.out.println("Addition :"+(i+j));
		System.out.println("Sub :"+(i-j));
		System.out.println("Mul :"+(i*j));
		System.out.println("Div :"+(i/j));
		System.out.println("Modules :"+(i%j));
	}

}
