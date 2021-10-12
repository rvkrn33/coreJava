package com.lambda.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList();
		l.add("ravi"); l.add("ajit"); l.add("virat"); l.add("sachin"); l.add("rajiv");
		
		/*
		 * for(int i=1; i< 150000; i++) { l.add(String.valueOf(i)); }
		 */
		Long startTime= System.currentTimeMillis();
		List<String> ll=new ArrayList();
		System.out.println("size () "+l.size());
		for(int i=0; i<l.size(); i++) {
			String str=l.get(i);
			if(str.startsWith("r")) {
				System.out.println("upper case :"+l.get(i).toUpperCase());
				//System.out.println("length :: "+l.get(i)+" :: "+l.get(i).length());
				ll.add(str.toUpperCase());
			}
		}
		System.out.println("List >>>>> "+ll);
		System.out.println("1. Time taken : " +(System.currentTimeMillis()-startTime));
		
		//using stream
		
		startTime= System.currentTimeMillis();
		List list =l.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println("2. Time taken : " +(System.currentTimeMillis()-startTime));
		
		startTime= System.currentTimeMillis();
		List list1 =l.parallelStream().map(s->s.length()).collect(Collectors.toList());
		System.out.println("3. Time taken : " +(System.currentTimeMillis()-startTime));
		
		l.stream().filter((s)->s.startsWith("r")).forEach(System.out::println);
		
		List l2=l.stream()
				.sorted()
				.filter((s)->s.startsWith("r"))
				.map((x)->x.toUpperCase())
				.collect(Collectors.toList());
		
		List l3= l.stream()
				.sorted()
				.collect(Collectors.toList());
		
		Long c= l.stream().sorted().count();
		
		System.out.println(" L2 >>> "+l2);
		
		System.out.println("Sorted >>> "+l3);
		
		System.out.println("Total Count >> "+c);
	}
}
