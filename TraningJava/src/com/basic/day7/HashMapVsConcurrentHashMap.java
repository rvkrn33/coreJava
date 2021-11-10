package com.basic.day7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConcurrentHashMap {
	static ConcurrentHashMap<Integer, Double> map=new ConcurrentHashMap();
	
	public static void main(String[] args) {
		
		//get 10 student percentage data 
		map.put(1,76.00);
		map.put(2,98.00);
		map.put(4,46.00);
		map.put(3,86.00);
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Stud No :");
			int num=sc.nextInt();
			System.out.println("Enter student marks");
			switch (1) {
			case 1:
					addTopFive(num, sc.nextDouble());
				break;
			}
		}
		
	}

	private static void addTopFive(int num, double marks) {
		
		for(Entry<Integer,Double> en: map.entrySet()) {
			map.put(num,marks);
			
			boolean result=en.getValue()<  75.00;
			if(result) 
				map.remove(en.getKey());
		}
		System.out.println("--> "+map);
	}
}
