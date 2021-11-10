package com.basic.day6;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//boxing -> Primitive type to Object
		//Autoboxing -> Primitive type to Object Automatically
		//unboxing -> Object to Primitve  (Interger --> String --> int )
		
		Set hs=new HashSet();
		
		int i=10;  
		
		Integer num=new Integer(i);  //boxing  -> Primitive type to Object
		
		hs.add(num);
		
		int val= Integer.parseInt(String.valueOf(num));
		
		System.out.println("value : "+val);
		
		System.out.println(hs);
	}
}
