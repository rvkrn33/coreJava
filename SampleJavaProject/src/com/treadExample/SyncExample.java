package com.treadExample;

import java.util.HashMap;
import java.util.Map;

public class SyncExample extends Thread{

	static Map<String,Boolean> map=new HashMap();
	
	@Override
	public void run() {
		System.out.println("Thread Execution start");
		synchronized (map) {
			if(map.containsKey("amit")) {
				
				System.out.println(Thread.currentThread().getName()
						+" before amit --> "+map.get("amit")); // true
				map.put("amit",false);
				System.out.println(Thread.currentThread().getName()
						+" After amit --> "+map.get("amit")); // false
			}
		}
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		map.put("ravi",false);
		map.put("amit",true);
		map.put("rajiv",true);
		
		for (int i = 1; i < 10; i++) {
			
		}
		SyncExample t1=new SyncExample();
		t1.setName("first");
		
		
		SyncExample t2=new SyncExample();
		t1.setName("second");
		
		t1.start();
		t2.start();
		
	}
}
