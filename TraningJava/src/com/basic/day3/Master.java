package com.basic.day3;

public class Master {

	long statTime;
	long endTime;
	
	public long CalculateStatTime() {
		return System.currentTimeMillis();
	}
	
	public long CalculateEndTime() {
		return System.currentTimeMillis();
	}
	
	public void extactExecutionTime(long start, long end) {
		System.out.println("Time taken --> "+(end - start));
	}
}
