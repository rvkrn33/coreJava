package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {

	public static void main(String[] args) {
		//HashMap , HashTable, LinkedHashMap
		
		
//		Map<Integer, String> map=new LinkedHashMap<Integer,String>();
		
		//ConcurrentHashMap

		Map<Integer, String> map=new ConcurrentHashMap<Integer,String>();

		map.put(41,"ravi");
		map.put(55,"abc");
		map.put(4,"xyz");
		map.put(55,"yyy"); //ovrride
		
		System.out.println("--> "+map);
		System.out.println("size --> "+map.size());
		
		System.out.println("==> "+map.get(41));
		
		if(map.containsKey(4)) {
			System.out.println("Key is exist");
		}
		
		if(map.containsValue("ravi")) {
			System.out.println("value is exist");
		}
		
		map.replace(41, "ravi", "patil");
		
		System.out.println("map Details ==> "+map);
		
		//Iteration
		
		/*
		 * Set<Entry<Integer, String>> entrySet = map.entrySet();
		 * 
		 * for(Entry<Integer, String> entry : entrySet) {
		 * 
		 * System.out.println("--> {"+entry.getKey()+","+entry.getValue()+"}"); }
		 */
		
		 for(Entry<Integer, String> entry : map.entrySet()) {
			 
			 System.out.println("===>>> {"+entry.getKey()+","+entry.getValue()+"}");
			 
			map.put(66,"ttt");
		 }
		 
		 
		 map.remove(41);
		 System.out.println("map Details ==> "+map);
			
	}
}
