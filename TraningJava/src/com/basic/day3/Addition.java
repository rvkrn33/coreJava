package com.basic.day3;

public class Addition {
int a;

	Addition(){
		System.out.println("default cunstructor");
	}
	
	Addition(int a){
		this.a=a;
		System.out.println("param cunstructor");
	}
	
	public int add(int a,int b) {
		System.out.println("addition two ");
		return (a+b);
	}
	
	public long add(int a,int b, int c) {
		return (a+b+c);
	}
	
	public long add(int ...b ) {
		
		for(int a : b) {
			System.out.println("---> "+a);
			
		}
		System.out.println("array ..");
		return 1;
	}
	
	/*
	 * public void print(String s) { System.out.println("String param"); }
	 */
	public StringBuffer print (StringBuffer bf) {
		System.out.println("StringBuffer param");
		return null;
	}
	
	  public String print(Object s) { 
		  System.out.println("object param"); 
		  return "abc";
		  }
	
	
	public static void main(String[] args) {
		String s= null;
		Object obj=null;
		
		Addition a=new Addition(5);
		a.print(null); 
		
		
		a.add(4,7,556,77,889,33,44);
		
		//System.out.println("Addition is : "+a.add(45, 5));
		
		//System.out.println("Addition is : "+a.add(45,10, 5));
	}
	
}
