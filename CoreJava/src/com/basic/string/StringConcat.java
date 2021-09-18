package com.basic.string;

public class StringConcat {

	public static void main(String[] args) {
		
		String s="ravi";
		System.out.println(s.hashCode());
		s=s.concat(" patil"); // ravi patil
		
		
		  System.out.println(s.hashCode()+" -- "+s);
		  
		  s=s.concat(" 1254235 ");
		  
		  System.out.println(s.hashCode()+" -- "+s);
		  
		  //StringBuffer
		  
		  StringBuffer sb=new StringBuffer("prasad");
		  System.out.println(sb.hashCode()); sb.append(" sonvane");
		  System.out.println(sb.hashCode()+" "+sb);
		 
		Long statTime=System.currentTimeMillis();
		String s1="abc";
		
		for (int i = 0; i < 100; i++) {
			s1=s1.concat(" a");
		}
		Long endTime=System.currentTimeMillis();
		
		System.out.println("String time taken :"+(endTime-statTime));
		
		
		Long statTime1=System.currentTimeMillis();
		StringBuffer sb1=new StringBuffer("prasad");
		
		for (int i = 0; i < 10000000; i++) {
			sb1.append(" aa");
		}
		Long endTime1=System.currentTimeMillis();
		
		System.out.println("StringBufer time taken :"+(endTime1-statTime1));
		
		
		Long statTime2=System.currentTimeMillis();
		StringBuilder strBui=new StringBuilder("prasad");
		
		for (int i = 0; i < 10000000; i++) {
			strBui.append(" aa");
		}
		Long endTime2=System.currentTimeMillis();
		
		System.out.println("StringBuilder time taken :"+(endTime2-statTime2));
		
	}
	
}
