package com.basic.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDifferece {

	public static void main(String[] args) {
		
		
		List arrayList=new ArrayList(); // serching operation faster than LL
		
		Long startTime=System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			arrayList.add(i,i);
		}
		
		Long endTime=System.currentTimeMillis();
		System.out.println("ArrayList Taken time :: "+(endTime- startTime) );
		
		
		List linkedList=new LinkedList(); // Add data then it is faster than arrayList
		
		Long startTime1=System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			linkedList.add(i,i);
		}
		
		Long endTime1=System.currentTimeMillis();
		
		System.out.println("LinkedList Taken time :: "+(endTime1- startTime1) );
		
		
		//performance for serching operation
		Long startTime2=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			arrayList.get(i);
		}
			
		Long endTime2=System.currentTimeMillis();
		
		System.out.println("arraylist Taken time for searching :: "+(endTime2- startTime2) );
		
		
		Long startTime3=System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			linkedList.get(i);
		}
			
	Long endTime3=System.currentTimeMillis();
	
	System.out.println("linkedlist Taken time for searching  :: "+(endTime3- startTime3) );
	
	}
}
