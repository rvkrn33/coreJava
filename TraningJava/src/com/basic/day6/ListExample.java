package com.basic.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.basic.day2.Customer;

public class ListExample {

	public static void main(String[] args) {
		
		//List list=new ArrayList();  // not syncronized  --> allow multiple threads for execution
		//List list=new LinkedList(); //not syncronized -> allow multiple treads for execution
		List list=new Vector(); //syncronized - > allow only one thread for execution
		
		list.add("ravi");
		list.add(3333);
		list.add(4555.667788);
		list.add(true);
		list.add("ravi");
		list.add('f');
		list.add(new Customer());
		list.add(new Object());
		list.add(null);
		list.add(522366585555744L);
		list.add(4522.884f);
		list.add('f');
		list.add(args);
		
		System.out.println("size() --> "+list.size());
		System.out.println("Elements --> "+list);
		
		
	}
}
