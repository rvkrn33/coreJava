package com.string.example;

public class StringExample {

	public static void main(String[] args) {
		
		String a="ravi"; //SCP
		
		System.out.println("a hashcode --> "+a.hashCode());
		
		String m="ravi";
		
		String b=new String("abc"); //heap
		String c=new String("abc");
		
		boolean result=c.equals(b);
		
		if(result) {
			System.out.println("Equals");
		}else
			System.out.println("not eq");
		
		if(a.equals(m)) {
			System.out.println("--> Equals");
		}else
			System.out.println("--> not eq");
		
		//immutable 
		a=a.concat(" patil");
		System.out.println("a hashcode after concat --> "+a.hashCode());
		
		StringBuffer sb=new StringBuffer("sachin");
		System.out.println("before StringBuffer hashcode--> "+sb.hashCode() +" "+ sb);
		sb.append(" Tendulkar");
		System.out.println("after StringBuffer hashcode--> "+sb.hashCode()+" "+ sb);
		
		
	}
	
}
