package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
	/* 
	 Set 
-Any type of object you can store (int, Employee, boolean, String)
-Duplication elements/ Object not allowed (12, 12)
- Insertion order not preserved 
- Null allowed (only one time)
	 */
	public static void main(String[] args) {
		
		//Set s=new HashSet();
		
		Set s=new LinkedHashSet();
		
		Student st=new Student("Amit",785421542555L);
		Student st1=new Student("Amit",785421542555L);
		
		String  sss=new String("ravi");
		
		//Add object
		
		System.out.println("first time >> "+s.add(st)); //true
		s.add(st);
		
		s.add("ravi");
		s.add('D');
		s.add(45);
		s.add(453.888);
		s.add(false);
		s.add(785545522222244L);
		s.add(null);
		s.add('D');
		s.add(false);
		
		
		System.out.println("second time >> "+s.add(st)); //false
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
		
		
	}

}
