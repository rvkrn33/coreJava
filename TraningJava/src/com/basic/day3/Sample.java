package com.basic.day3;

public class Sample extends Master{

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
	
	public void display() {
		long start=CalculateStatTime();
		
		for (int i = 0; i < 10000000; i++) {
			//System.out.println("-- >"+(i%100==0));
		}
		
		extactExecutionTime(start,CalculateEndTime());
	}
	
	public static void main(String[] args) {
		new Sample().display();
		
	}
	
}
