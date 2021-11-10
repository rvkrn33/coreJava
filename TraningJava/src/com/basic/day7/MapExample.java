package com.basic.day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap();
		
		//add/ insert 
		
		map.put(45, "ravi");
		map.put(50, "amit");
		map.put(61, "pune");
		map.put(16, "mumbai");
		map.put(32, "nahik");
		map.put(33, "nahik");
		

		Set<Entry<Integer, String>> entry=map.entrySet();
		
		for(Entry<Integer, String> en : entry) {
			
			System.out.println(en.getKey()+"--> "+en.getKey().hashCode()/16);
			
			//System.out.println("key :"+en.getKey()+ " :: "+en.getValue());
		}
		
		System.out.println(map);  // 45 =amit
	}
}
