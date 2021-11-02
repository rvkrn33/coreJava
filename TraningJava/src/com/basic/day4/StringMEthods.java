package com.basic.day4;

public class StringMEthods {

	public static void main(String[] args) {
		
		String s="Sachin tendulkar";
		String s1="Tendulkar";
		
		display(s.toUpperCase());
		display(s.toLowerCase());
		display(s.substring(3));
		display(s.substring(2,6));
		display(s.concat(" sachin"));
		display(s.replace("ten", "TEN"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1)); 
		
		display(String.valueOf(s.charAt(6)));
		
		int i= s.lastIndexOf("a");
		System.out.println(i+" "+s.length());
		
		String[] arr= s.split("a");
		
		for(String str : arr) {
			display("--> "+str);
		}
		
		String name="sachin";
		System.out.println("Before --> "+name +"  "+name.hashCode() );
		name=name.concat(" tendulakar");
		
		System.out.println("After --> "+name+ "   "+name.hashCode() );
		
		String[] strArr= {"ravi", "amit", "ajit"};
		
		String result=""; 
		
		StringBuffer sb=new StringBuffer("sachin");
		System.out.println("Before sb -- >"+sb.hashCode()+" "+sb);
		
		sb.append(" tendulkar");
		System.out.println("After sb -- >"+sb.hashCode()+" "+sb);
		
		for(String sss: strArr) {
			result=result+sss+",";
		}
		display(result);
		
	}
	
	private static void display(String str) {
		System.out.println(str);
	}
	
}
