package com.basic.day3;

public class Test extends Master{

	/*
	 * long statTime; long endTime;
	 * 
	 * public long CalculateStatTime() { return System.currentTimeMillis(); }
	 * 
	 * public long CalculateEndTime() { return System.currentTimeMillis(); }
	 * 
	 * public void extactExecutionTime(long start, long end) {
	 * System.out.println("Time taken --> "+(end - start)); }
	 */
	
	public void print() {
		long start=CalculateStatTime();
		String a="abc";
		for (int i = 0; i < 1000; i++) {
			a=a+i;
		}
		
		extactExecutionTime(start,CalculateEndTime());
	}
	
	public static void main(String[] args) {
		new Test().print();
	}
}

