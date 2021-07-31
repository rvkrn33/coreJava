package com.polymorphism;

public class Mobile { //parent

	private static int camera;
	private static int frontCam;
	
	Mobile(){
		System.out.println("Mobile constructor");
	}
	
	public void cameraDetails() {
		camera=12;
		frontCam=2;
		System.out.println("Mobile Cam details : "+camera+","+frontCam);
	}
	
	public static  void abc() {
		System.out.println("Parent ABC");
	}
	
	
}
