package com.basic.day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList list=new ArrayList();
		
		CopyOnWriteArrayList list =new CopyOnWriteArrayList();
		
		list.add("ravi");
		list.add("abc");
		list.add("xyz");
		
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			list.add("pune");
			list.remove("abc");
		}
		System.out.println("Final "+list);
		
		Set e=new HashSet();
		e.addAll(list);
		
		System.out.println("set ->  "+e);
	}
}
