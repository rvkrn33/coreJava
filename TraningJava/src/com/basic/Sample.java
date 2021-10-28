package com.basic;

public class Sample {
	
	public void dataTypeBasic() {
		
		byte b= 125;
		short s= 32767;
		
		int i=725412542;
		
		long l= 785522455666664L;
		
		char c= 's';
		
		boolean flag= true;
		
		float f= 45258.123456f;
		
		double d= 7452154.123456789102;
		
		System.out.println(" float --> "+f );
		System.out.println(" double --> "+d );
		
		//implicit casting - low to high
		
		i= b;
		
		//Explicit Casting  - High to low
		//double to int 
		int j = (int) d;
		
		System.out.println("double to int >> "+j);
	
	}
	public static void main(String[] args) {
		
		Sample s; // s is the reference and It will create in stack 
		s=new Sample(); //memory will created in Heap area
		System.out.println("Hash Code "+s.hashCode());
		
		Sample s1= new Sample();
		System.out.println(">> "+s1.hashCode());
		
				
		s.dataTypeBasic();
		
		String str="java"; // SCP
		String msg=new String("java"); // Heap 
		
		
		
	}

}
