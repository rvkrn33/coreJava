package com.basic.day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	
	public static void main(String[] args) {
		
		List arrayList=new ArrayList();
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}
		
		List linkedList=new LinkedList();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		
		long startTime= System.currentTimeMillis();
		
		long endTime= add(arrayList);
		
		System.out.println("ArrayList time taken : "+ (endTime-startTime));
		
		startTime= System.currentTimeMillis();
		
		endTime= add(linkedList);
		System.out.println("LinkedList time taken : "+ (endTime-startTime));
		
		System.out.println("********** Getting/ searching  ");
		startTime= System.currentTimeMillis();
		
		endTime= search(arrayList);
		
		System.out.println("ArraList time taken Searching operation : "+ (endTime-startTime));
		
		
		startTime= System.currentTimeMillis();
		
		endTime= search(linkedList);
		
		System.out.println("LinkedList  time taken Searching operation : "+ (endTime-startTime));
		
	}

	private static long search(List list) {
		for (int i = 100; i < 10000; i++) {
			list.get(i);
		}
		return System.currentTimeMillis();
		
	}

	private static long add(List list) {
		
		for (int i = 100; i < 10000; i++) {
			list.add(i,i);
		}
		return System.currentTimeMillis();
	}
}
