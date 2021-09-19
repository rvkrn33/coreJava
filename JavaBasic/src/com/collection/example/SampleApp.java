package com.collection.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SampleApp {

	static Map<Integer,Employee> map=null;
	
	public static void main(String[] args) {
		map=new HashMap();
		
		System.out.println("Welcome -----");
		
		System.out.println("1. Add");
		System.out.println("2. view");
		System.out.println("2. view by name");
		System.out.println("3. exit");
		
		
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println(" ******************  ");
			System.out.println("Please enter your choice : ");
			String ch=sc.next();
			
			switch (ch) {
			case "1": add(sc);
			break;
			case "2": view();
			break;
			case "3": System.exit(0);
			break;
			}
			
		}
	}

	private static void view() {

		if(map.size() > 0){
			System.out.println("ID   Name   City");
			
			for(Entry<Integer, Employee> entry: map.entrySet()){
				
				//int id=entry.getKey();
				Employee e=entry.getValue();
				System.out.println(e.getId()+"   "+e.getName()+"   "+e.getCity());
				
			}
			
		}
		else
			System.out.println("Data not available");
	}

	private static void add(Scanner sc) {
		
		System.out.println("Please enter id :");
		int id=sc.nextInt();
		
		System.out.println("Please enter name :");
		String name=sc.next();
		
		System.out.println("Please enter city :");
		String city=sc.next();
		
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setCity(city);
		
		map.put(id,e);
		
		System.out.println("Data inserted ....");
	}

}
