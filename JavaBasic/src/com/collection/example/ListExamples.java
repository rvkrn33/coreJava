package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import com.basic.oops.Employee;

public class ListExamples {

	public static void main(String[] args) {
		
		//arrayListExample();
		listSorting();
	}

	private static void listSorting() {
		//List<Integer> list=new ArrayList();
		List<String> list=new ArrayList();
		//list.add(450); list.add(22); list.add(88); list.add(4);
		list.add("ravi"); list.add("suresh"); list.add("amit"); list.add("atul");
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		List<Character> lc=new ArrayList();
		
		for(Character c:list.get(2).toCharArray())
			lc.add(c);
		
		Collections.sort(lc);
		
		System.out.println("Sorting >>> "+lc);
	}

	private static void arrayListExample() {
		//ArrayList LinkedList Vector
		List list=new ArrayList();
		
		int i=12;
		Integer num=new Integer(i); //Boxing
		
		list.add("ravi");
		list.add(i); //auto boxing
		list.add(num);
		list.add(false);
		list.add('D');
		list.add(452336.85520);
		list.add(52287145566222L);
		list.add('D');
		list.add(null);
		list.add(new Employee() );
		list.add(new Object());
		
		System.out.println("List - "+list.size());
		System.out.println("List - "+list);
		
		System.out.println("Forward ");
		ListIterator lt=list.listIterator();
		
		while(lt.hasNext()) {
			System.out.println("==> "+lt.next());
		}
		
		System.out.println("Backward ");
		
		while(lt.hasPrevious()) {
			System.out.println(lt.previous()+"<==");
		}
		
	}
}
