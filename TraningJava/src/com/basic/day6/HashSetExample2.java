package com.basic.day6;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet();
		
		hs.add("kishor");
		hs.add("kiran");
		hs.add("rajesh");
		hs.add("amit");
		
		TreeSet ts=new TreeSet();
		
		ts.addAll(hs);
		System.out.println("==> "+ts);
		
		System.out.println("size () --> "+hs.size());
		System.out.println(hs);
		
		if(hs.contains("cds")) {
			System.out.println("yes");
		}else
			System.out.println("No");
		
		hs.remove(null);
		
		System.out.println("size () --> "+hs.size());
		System.out.println(hs);
		
		
		TreeSet<Integer> t=new TreeSet();
		t.add(452);
		t.add(52);
		t.add(2);
		t.add(42);
		//t.add("ravi");
		
		System.out.println("Sorted Tree Set --> "+t); //[2,42,52,452]
		
	}
}
