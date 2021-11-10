package com.basic.day7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapModification {

	public static void main(String[] args) {
		
		//HashMap<String, String> map=new HashMap();
		ConcurrentHashMap<String,String> map=new ConcurrentHashMap();
		
		map.put("first", "1");
		map.put("second", "2");
		map.put("third", "3");
		
		for(Entry<String, String> en : map.entrySet()) {
			System.out.println(en.getKey() +" >>> "+en.getValue() );
			map.put("four", "4"); 
			map.put("five", "5"); 
			
			map.remove("second");
		}
		
		System.out.println(map);
	}
}
