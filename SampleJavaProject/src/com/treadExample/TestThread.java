package com.treadExample;

public class TestThread {

	public static void main(String[] args) {
		
		Student stud=new Student();
		
		new Thread() {
			public void run() {
				try {
					stud.withdraw(12000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
					try {
						stud.deposit(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}.start();
	}
}
