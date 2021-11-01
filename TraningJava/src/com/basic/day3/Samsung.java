package com.basic.day3;

public class Samsung extends Mobile{

	int memory=128;
	int frontCam= 64;
	public void feature(String type) {
			
			System.out.println("print Features "+type);
			System.out.println("memory :: "+memory+"  "+frontCam);
		}
	public static void main(String[] args) {
		Mobile m= new Samsung();
		m.feature("Samsung");
		
	}
}

class MI extends Mobile{

	int memory=256;
	int frontCam= 128;
	public void feature(String type) {
			
			System.out.println("Features "+type);
			System.out.println("memory :: "+memory+"  "+frontCam);
		}
}
