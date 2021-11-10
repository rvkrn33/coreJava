package com.basic.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = null;
		
		list=new ArrayList();
		System.out.println(" --> "+list.isEmpty());
		
		if(list.isEmpty()) {
			System.out.println("List is empty");
		}
		
		list.add("ravi");
		list.add("amit");
		list.add("satish");
		list.add("ravi");
		list.add("ajit");
		
		System.out.println(list.get(1));
		
		Collections.sort(list);
		
		System.out.println("Sorted List -> "+list);
		
		Collections.reverse(list);
		
		System.out.println("Decending order -> "+list);
		
	
		ListIterator<String> listIterator=list.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(" ===> "+listIterator.next());
		}
		
		System.out.println("back word --- ");
		
		while(listIterator.hasPrevious()) {
			System.out.println(" ===> "+listIterator.previous());
		}
		
		for(String s: list) {
			System.out.println(" ** "+s);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(">>>>>>>>>>> "+list.get(i));
		}
		
		HashSet<String> hs=new HashSet();
		hs.addAll(list);
		
		System.out.println(" Convert ArrayList to HashSet -> "+hs);
		
		list.addAll(hs);
		list.add("amit");
		
		System.out.println("---> "+list);
	}
}
