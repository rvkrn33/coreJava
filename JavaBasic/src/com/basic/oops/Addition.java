package com.basic.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Addition {

	static Map<String, String> map=null;
	
	static{
		map=new HashMap();
		map.put("ravi","patil");
		map.put("ajit","raj");
		map.put("rahul","prakash");
	}
	
	final public void search(String firstName){
		if(map.containsKey(firstName))
			System.out.println("Data Found "+firstName);
	}
	public void add(short i) {
		System.out.println("short");
	}
	
	public void add(int i) {
		System.out.println("int");
	}
	
	public void add(Integer i) {
		System.out.println("Integer");
	}
	
	
	public void search(String firstName, String lastName){
		System.out.println("search 2");
		if(map.containsKey(firstName) && map.containsValue(lastName))
			System.out.println("Data Found "+firstName+" "+lastName);
	}
	
	public void search(Object firstName, Object lastName){
		System.out.println("search 3");
		if(map.containsKey(firstName) && map.containsValue(lastName))
			System.out.println("Data Found 3 --> "+firstName+" "+lastName);
	}
	
	public static void main(String[] args) {
		Addition a; //reference  --> stack 
		a=new Addition(); // object creation --> heap
		a.search(null,null);
		a.add(new Integer(10));
	}
	
}
