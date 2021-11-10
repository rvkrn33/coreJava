package com.basic.day6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.basic.day2.Customer;

public class SetExample {

	public static void main(String[] args) {
	
		//Collection hs=new HashSet(); //insertion order is not preserved
		Object h=new HashSet();
		
		Collection hs=new LinkedHashSet(); //insertion order is preserved 
		
		Set hash=new HashSet();
		
		HashSet hashSet=new HashSet();
		
		hash.add("amit");
		hash.add(45);
		hash.add("amit");
		hash.add("ganesh");
		
		System.out.println(hash.add("ramesh"));
		System.out.println(hash.add("ganesh"));
		System.out.println(hash);
		
		Customer[] s=new Customer[5];
		
		//insert any element - add()
		hs.add(s);
		hs.add("ravi");
		hs.add(3333);
		hs.add(4555.667788);
		hs.add(true);
		hs.add('f');
		hs.add(new Customer());
		hs.add(new Object());
		hs.add(null);
		hs.add(522366585555744L);
		hs.add(4522.884f);
		hs.add(hash);
		hs.add(args);
		
		System.out.println(hs);
		
		System.out.println("---- Iterator ----------");
		Iterator it= hs.iterator();
		int cnt=1;
		while(it.hasNext() && cnt <= 5) {
				System.out.println(it.next());
			cnt++;
		}
		
		System.out.println("----- for --------");
		for(Object obj: hs) {
			System.out.println(obj);
		}
	}

}
