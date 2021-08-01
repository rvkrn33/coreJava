package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListExample {

	
	public static void main(String[] args) {
		
		//List s=new ArrayList(); 
		
		//List s=new LinkedList();  
		
		List s=new Vector();  
		
		
		Student st=new Student("Amit",785421542555L);
		Student st1=new Student("Amit",785421542555L);
		
		String  sss=new String("ravi");
		
		//Add object
		
		//s.add(st);
		
		s.add("ravi");
		s.add('D');
		s.add(45);
		s.add(453.888);
		s.add(false);
		s.add(785545522222244L);
		s.add(null);
		s.add('D');
		s.add(false);
		s.add(st1);
		
		System.out.println("Print : "+s);
		System.out.println("Print : "+s.size());
		
		System.out.println(s.contains(453.880333)); //true
		
		//Remove
		s.remove("ravi");
		
		Object[] objArr=s.toArray();
		System.out.println("Print from Object Array:"+objArr[2]);
		
		
		System.out.println("Print : "+s);
		System.out.println("Print : "+s.size());
		
		
		//iterate 
		
		
		  Iterator i= s.iterator();
		  
		  while(i.hasNext()) { 
			  
			  System.out.println("--> "+i.next()); 
			  
		  }
		 
				System.out.println("List Iterator ");
				//ListIterator
				
				ListIterator li=s.listIterator();
				while(li.hasNext()) {
					System.out.println("List --> "+li.next());
				}
				
				System.out.println("List Iterator Reverse");
				//ListIterator
				
				ListIterator li1=s.listIterator();
				while(li.hasPrevious()) {
					System.out.println("List --> "+li.previous());
				}
		
	}
}
