package com.basic.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		//HashMap , LinkedHashMap, treeMap
		
		Map<Integer,String> mp=new TreeMap();
		mp.put(41,"ravi");
		mp.put(55,"pqr");
		mp.put(66,"abc");
		mp.put(33,"asd");
		
		System.out.println(mp);
		
		System.out.println("-->"+mp.get(66));
		
		if(mp.containsKey(66)) {
			System.out.println("Key is exits in Map");
		}else
			System.out.println("Key is not exits in Map");
		
		//Set<Entry<Integer, String>> entry= mp.entrySet();
		
		for(Entry<Integer, String> en: mp.entrySet()) {
			
			System.out.println("==> "+en.getKey()+"... "+en.getValue());
		}
		
		
		
	}
}
