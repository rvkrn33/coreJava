package com.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("ravi");
		//list.add(452.66);
		list.add("abc");
		//list.add(8666);
		list.add("cds");
		
		System.out.println("List --> "+list); 
		
		//list to set
		
		Set s= new HashSet();
		s.addAll(list);
		
		System.out.println("List to set convertion --> "+s);
		
		//list.addAll(s);
		//System.out.println("Set to List convertion --> "+list);
		
		Collections.sort(list);
		
		System.out.println("sorted list --> "+list);
		
		Collections.reverse(list);
		
		System.out.println("reverse list --> "+list);
	}
}
