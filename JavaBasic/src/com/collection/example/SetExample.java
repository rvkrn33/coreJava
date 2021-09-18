package com.collection.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.basic.oops.Employee;

public class SetExample {

	
	
	public static void main(String[] args) {
		
		//hashSetExample();
		
		treeSetExample();
		
		
	}

	private static void treeSetExample() {
	//	Set<Integer> ts=new TreeSet();
		
		Set<String> ts=new TreeSet();
		
		ts.add("ravi");  ts.add("amar");  ts.add("virendra");  ts.add("ajit");
		//ts.add(452);  ts.add(55);  ts.add(10);  ts.add(655);
		//System.out.println("--> "+ts);
		
		if(ts.contains("amar")) {
			System.out.println("Yes");
		}
		
		for(String s:ts)
		{
			System.out.println(s);
		}
	}

	private static void hashSetExample() {
		//Boxing - Primitive to Object conversion with the help of wrapper classes
		
		//Set hs=new HashSet();
		Set hs=new LinkedHashSet(); //insertion order is preserved
		
		//Set<String> hs=new LinkedHashSet(); /
		
		int i=12;
		Integer num=new Integer(i); //Boxing
		
		hs.add("ravi");
		hs.add(i); //auto boxing
		hs.add(25);
		hs.add(false);
		hs.add('D');
		hs.add(452336.85520);
		hs.add(52287145566222L);
		hs.add('D');
		hs.add(null);
		hs.add(new Employee() );
		hs.add(new Object());
		
		System.out.println("size "+hs.size()); 
		
		System.out.println("--> "+hs); 
		
		hs.remove(25);
		hs.remove("ravi");
		
System.out.println("size "+hs.size()); 
		
		System.out.println("--> "+hs); 
		
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			System.out.println("--> "+it.next());
		}
		
		
	}
}
