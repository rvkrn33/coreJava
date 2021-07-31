package com.polymorphism;

public class Samsug extends Mobile{
	private int camera;
	private int frontCam;
	
	Samsug(){
		System.out.println("Samsug constructor");
	}
	
	public void cameraDetails() {
		camera=128;
		frontCam=64;
		System.out.println("Samsug Cam details : "+camera+","+frontCam);
	}
}
