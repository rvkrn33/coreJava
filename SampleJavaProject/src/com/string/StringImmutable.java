package com.string;

public class StringImmutable {

	
	public static void main(String[] args) {
		
		
		String str=new String("abc");
		System.out.println("1 "+str.hashCode());
		
		str=str.concat("xyz");
		System.out.println("2 "+str.hashCode());
		
		str=str+"pqr";
		System.out.println("3 "+str.hashCode());
		
		System.out.println("str "+str);
		
		System.out.println("--------- StringBuffer-----------");
		
		StringBuffer sb=new StringBuffer("ravi");
		System.out.println("1 "+str.hashCode());
		sb.append("patil");
		System.out.println("2 "+str.hashCode());
		System.out.println(sb);
		
		String st="acb";
		
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			st=st+"asdf";
		}
		long endTime=System.currentTimeMillis();
		System.out.println("String time : "+(endTime-startTime));
		
		StringBuffer sbuf=new StringBuffer("ravi");
		
		long startTime1=System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sbuf.append("dddd");
		}
		long endTime1=System.currentTimeMillis();
		System.out.println("StringBuffer time : "+(endTime1-startTime1));
		
		
		StringBuilder builder=new StringBuilder("ravi");
		
		startTime1=System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			builder.append("dddd");
		}
		endTime1=System.currentTimeMillis();
		System.out.println("StringBuilder time : "+(endTime1-startTime1));
	}
}
