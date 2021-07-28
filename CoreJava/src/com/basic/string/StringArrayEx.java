package com.basic.string;

public class StringArrayEx {

	public static void main(String[] args) {

		String[] s = { "ravi", "prasad", "pune" };

		String[] s1 = new String[2];
		s1[0] = "abc";
		s1[1] = "patil";
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		for(String str : s1) {
			System.out.println("-- "+str);
		}
	}
}
