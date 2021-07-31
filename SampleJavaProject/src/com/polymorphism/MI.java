package com.polymorphism;

public class MI extends Mobile{

	private int camera;
	private int frontCam;
	
	MI(){
		System.out.println("MI constructor");
	}
	MI(int camera){
		System.out.println("MI constructor");
	}
	
	public void cameraDetails() {
		camera=64;
		frontCam=32;
		System.out.println("MI Cam details : "+camera+","+frontCam);
	}
	
	public static  void abc() {
		System.out.println("MI ABC");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Mobile m=new Mobile(); m.cameraDetails();//
		 * 
		 * MI mi=new MI(); mi.cameraDetails();
		 */
		System.out.println("Runtime Poly =========");
		
		//Mobile mobile=new Samsug();
		//mobile.cameraDetails();
		
		Mobile m;
		m=new MI(); //heap 
		m.cameraDetails();

		m.abc();
	}
}
