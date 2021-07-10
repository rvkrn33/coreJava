package com.basic.inheritance;

public class MI_Latest extends MI{

	public MI_Latest(){
		System.out.println("new child constructor ... ");
	}
	
	public void getAlldetails() {
		
		System.out.println("MI_Latest method");
		//super.getMobileDetails();
		super.printAllMobileDtls();
	}
	
	public static void main(String[] args) {
		
		MI_Latest miLatest=new MI_Latest();
		
		miLatest.getAlldetails();
		
		//Mobile mobile= new  MI_Latest(); 
		
		
	}
}
