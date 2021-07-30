package com.basic.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListExample {

	//duplicate allowed
	//insertion order preserved
	//allowed all type of data
	//- ArrayList - indexed based - data structure - resizable array 
	//-Linked List - data structure - doubly linked list (store nodes )  P D N
	//-vector - legacy 
	
	public static void main(String[] args) {
		
		Vendor v=new Vendor();
		v.setAge(45);
		v.setName("abhijit");
		
		//List hs= new ArrayList();
		
		List hs= new LinkedList();
		//List hs= new Vector();
		
		hs.add(52.6669);
		hs.add(true);
		hs.add('F');
		hs.add("ravi");
		hs.add(null);
		hs.add(45222L);
		hs.add("ravi");
		hs.add(v);
		
		System.out.println("Print details : "+hs);
		System.out.println("Before Size :"+hs.size());
		
		hs.add(3,"prasad");
		System.out.println(hs.contains("ravi")); //false
		
		if(hs.contains("ravi")) {
			hs.remove("ravi");
		}
		System.out.println("Print details : "+hs);
		
		
		//listIterator
		
		ListIterator i=hs.listIterator();
		
		System.out.println("Forward order ");
		
		while(i.hasNext()) {
			System.out.println("--> "+i.next());
		}
		
		System.out.println("Reverse order ");
		
		while(i.hasPrevious()) {
			System.out.println("--> "+i.previous());
		}
		
	}
}
