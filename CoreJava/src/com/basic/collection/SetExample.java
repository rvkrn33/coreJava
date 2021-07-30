package com.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetExample {

	//- set not allowed duplicate object /elements/objects
	//- insertion order not preserved
	//- null allowed 
	//- you can store any data type of elements 

	//HashSet - insertion order not preserved
	//LinkedHashSet - insertion order preserved

	public static void main(String[] args) {
		
		Vendor v=new Vendor();
		v.setAge(45);
		v.setName("abhijit");
		
		//Set hs=new HashSet();
		
		Set hs=new LinkedHashSet();
		
		//add elements
		int i=12;
		
		hs.add(i); // primitve to Object using wrapper classes 
		//(Integer a= Interger.parseInt(String.valueOf(i)))
		//Auboxing
		hs.add(52.6669);
		hs.add(true);
		hs.add('F');
		hs.add("ravi");
		hs.add(null);
		hs.add(45222L);
		hs.add("ravi");
		hs.add(v);
		
		System.out.println("Print details : "+hs);
		System.out.println("Before Size :"+hs.size());
		
		hs.remove('F');
		System.out.println("After Size :"+hs.size());
		System.out.println("Print details : "+hs);
		
		System.out.println(hs.contains("sdfsdf")); //true
		
		if(hs.contains("ravi")) {
			hs.remove("ravi");
		}
		System.out.println("Print details : "+hs);
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			System.out.println("---> "+it.next());
		}
		
	}
}
