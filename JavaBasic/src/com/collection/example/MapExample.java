package com.collection.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		//key value 
		//key -> String,collection, wrappers, object  (duplicate not allowed)
		//value -> String,collection, wrappers, object
		
		Map<String, Integer> map=new HashMap();
		
		map.put("ravi",45); //entry
		map.put("amit",66); 
		map.put("ravi",100); // 
		map.put("jivan",54); 
		
		System.out.println("size -->"+map.size());
		
		System.out.println("=> "+map);
		
		int i = map.get("amit");
		System.out.println("value "+i);
		
		//iterate 
		//Set<Entry<String, Integer>> setEntry=map.entrySet();
		
		for(Entry<String, Integer> entry: map.entrySet()) 
		{
			System.out.println(entry.getKey() +" ---> "+entry.getValue());
			
		}
		
		
	}
}
