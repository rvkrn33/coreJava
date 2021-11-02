package com.basic.day4;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		
		String s="sachin";
		
		StringBuffer sb=new StringBuffer("sachin");
		
		StringBuilder builder=new StringBuilder("sachin");
		
		long startTime=getCurrentTime();
		for (int i = 0; i < 10000; i++) {
			s=s+i;
		}
		System.out.println("Time Taken (String ) :: "+(getCurrentTime()-startTime));
		
		startTime=getCurrentTime();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println("Time Taken (StringBuffer ) :: "+(getCurrentTime()-startTime));
		
		startTime=getCurrentTime();
		for (int i = 0; i < 100000; i++) {
			builder.append(i);
		}
		System.out.println("Time Taken (StringBuilder ) :: "+(getCurrentTime()-startTime));
		
		int i=100;
		
		String d=String.valueOf(i);
		
		String f=String.valueOf(true);
	}

	private static long getCurrentTime() {
		return System.currentTimeMillis();
	}
}

