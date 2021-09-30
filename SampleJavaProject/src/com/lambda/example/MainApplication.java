package com.lambda.example;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainApplication {//implements Calculator{

	public static void main(String[] args) {
		
		Calculator cal=(a,b)-> System.out.println("Addition "+(a+b));
		
		cal.addition(10, 50);
		
		Calculator cal1=(a, b)->{
			//Buisness Logic
			System.out.println("Addition "+(a+b));
		};
		
		cal.addition(10, 50);
		
		//In build Functional Interfaces
		//Predicate  --> Test()
		//(i >10 && i < 20)
		
		 Predicate<Integer> result = (i) -> i > 10;
		 
		 System.out.println("result "+result.test(14));
		  
	        // Creating predicate
	        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
	        boolean result1 = result.and(lowerThanTwenty).test(9);
	        System.out.println(result1);
	  
	        // Calling Predicate method
	        boolean result2 = result.and(lowerThanTwenty).negate().test(15);
	        System.out.println(result2);
		
	        
	        Consumer<String> display = a -> System.out.println("Print value ::"+a);
	        
	        // Implement display using accept()
	        display.accept("Data not Found");
	      
	        Supplier result5 = ()-> "Hello";
	        
	        System.out.println("Supplier result "+result5.get());
	        
	        
	        Function<String, Integer> func = x -> x.length();

	       System.out.println(func.apply("Hello"));   // 6

		/*
		 * Calculator calsi=new MainApplication(); calsi.addition(10, 50);
		 */
	}

	/*
	 * @Override public void addition(int a, int b) {
	 * System.out.println("Addition "+(a+b)); }
	 */
}
