package com.basic.day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetVsCopyOnWriteArraySet {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet();
		CopyOnWriteArraySet hs=new CopyOnWriteArraySet();
		
		hs.add("ravi");
		hs.add("abc");
		hs.add("xyz");
		
		Iterator it=hs.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			hs.add("pune");
			hs.remove("abc");
		}
		System.out.println("Final "+hs);
		
		
	}
}
