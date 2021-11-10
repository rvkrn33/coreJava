package com.basic.day7;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht=new Hashtable();
		
		ht.put("first",1);
	//	ht.put(null,1);
		ht.put("second",1);
		
		System.out.println(ht);
		
		TreeMap<String, Integer> treemap=new TreeMap();
		treemap.put("first",9);
		treemap.put("second",5);
		treemap.put("arjun",1);
		treemap.put("arjun",55); //override
		treemap.put("52411",1);
		
		System.out.println(treemap);
	}
}
