package com.basic.day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		Employee e1= new Employee(11, "ravi", "pune");
		//Employee e2= new Employee(12, "ram", "mumbai");
		Employee e3= new Employee(11, "ravi", "pune");
		//Employee e4= new Employee(13, "ajit", "nagpur");
		
		HashMap<Employee , String> hm = new HashMap();
		
		hm.put(e1, "first");
		//hm.put(e2, "fisecond");
		hm.put(e3, "third");  // override 
		//hm.put(e4, "fourth");
		
		List<Employee> list=new ArrayList();
		
		for(Entry<Employee, String> en : hm.entrySet()) {
			
			System.out.println(en.getValue()+"--> "+en.getKey().hashCode());
			System.out.println("value --> "+en.getValue());
			list.add(en.getKey());
		}
		System.out.println("**** compare objects");
		Employee emp1=list.get(0);
		Employee emp2=list.get(1);
		
		if(emp1.equals(emp2))
			System.out.println("both are same");
		else
			System.out.println("both are not same");
		
	
	}
}
