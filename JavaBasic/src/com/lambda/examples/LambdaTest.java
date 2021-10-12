package com.lambda.examples;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest implements Calculator{
//implements Calculator

	public static void main(String[] args) {
		
		Calculator c;
		c=(a,b)-> a+b;
	
		
		int result=c.addition(55, 20);
		System.out.println("result :: "+result);
		
		Calculator c1=new LambdaTest();
		c1.addition(45,5);
		
		predicateExample();
	}

	private static void predicateExample() {
	
		String str="ravi55";
		
		  Predicate<String> p = (j)->j.startsWith("r");
		  
		  boolean result=p.test(str);
		 
		  System.out.println("result : "+result);
	    
		  Predicate<String> p1= (f)->f.length()==4; 
		  
		  boolean r=p1.test(str);
		 
		  System.out.println("result : "+r);
		  
		  //Consumer 
		  Consumer<String> c=(s) -> System.out.println(s);
		  c.accept("abc");
		  
		  Supplier<Date> sup =()->{
			  return new Date();
		  };
		  
		  System.out.println("Date : "+sup.get());
		
		  Function<String, String> res= (s) -> 
		  {
			  return s.toUpperCase();
		  };
		  
		  System.out.println("rsult :: "+res.apply("welcome"));
}

	@Override
	public int addition(int a, int b) {
		System.out.println("Without Lambda addition "+(a+b));
		return (a+b);
	}

}
