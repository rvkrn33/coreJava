package com.basic.day4;

public class ArrayExample {

	public static void main(String[] args) {
		

		String[] st= new String[4]; // 4
		
		String[] str= {"ravi","satish","sanju"}; // 3
		
		String[][] arr=new String[3][3];
		
		arr[0][1]="Hari";
		arr[2][2]="Jagdish";
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println(">>>> "+arr[i][j]);
			}
		}
		
		String[][] ar= {
					{"abc","asd","ddd"},
					{"rrr","ggg","dd"},
					{"g","jj","kk"}
				};
		
		System.out.println("First "+st.length);
		System.out.println("Second "+str.length);
		
		st[2]="dinesh";
		
		st[1]="Ganesh";
		
		for (int i = 0; i < st.length; i++) {
			System.out.println("--> "+st[i]);
		}
		
		for(String s: str) {
			System.out.println("===> "+s);
		}
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar.length; j++) {
				System.out.println("---------> "+ar[i][j]);
			}
		}
	}
}
