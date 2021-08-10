package com.exception;

public class Student {

	public static void main(String[] args) throws CutOffException {
		
		int cutOff=80;
		int percentage= 85;
		
		if(percentage < 80) {
			throw new CutOffException("below percentage ");
		}else {
			System.out.println("Congrats.... you are eligible");
		}
	}
}
