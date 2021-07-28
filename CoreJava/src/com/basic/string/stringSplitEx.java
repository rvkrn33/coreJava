package com.basic.string;

public class stringSplitEx {

	public static void main(String[] args) {
		
		String s="1 ravi pune 124566789,2 arjun nagpur 456231555,3 abhi mumbai 458745666";
		
		String[] record= s.split(",");
		
		//System.out.println("Lenght : "+record.length);
		for (String str : record) {
			//System.out.println("--> "+str);
		}
		
		//string more practical
		
		String st="  Maruti Sanrto Alto Tata Swift Scoepio";
		
		System.out.println(st.startsWith("M"));//true
		
		System.out.println(st.startsWith("h"));//false
		
		System.out.println(st.isEmpty());//true
		
		System.out.println(st.contains("Swi"));//true
		st=st.replace("Alto", "Breeza");
		System.out.println(st);
		
		System.out.println(st.trim());
		
	}
}
