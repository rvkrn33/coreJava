package com.basic.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

public static void nearestElement(){

	
	String str="This is java programming";

	String[] s=str.split(" ");
	System.out.println((s.length-1));

	int index=str.lastIndexOf(" ");
	System.out.println(">>> "+str.substring(index-1));
	
int[] arr={10,55,88,42,3};
int input=40;


	int temp=0;
	int prevDiff=0;
	int num=0;
	for(int i=0; i<arr.length; i++){
			
			if(input > arr[i])
			{
				prevDiff=input-arr[i]; 
				
			}
			else
			{
				prevDiff=arr[i]-input; 
			}
			if(i ==0){
				temp=prevDiff;
			}
			if(prevDiff < temp){
				temp=prevDiff;
				num=arr[i];
			}
			
	}
	System.out.println("Result :"+num);
}
	public static void main(String[] args) {
		nearestElement();
		
		Map<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(33,"ravi");
		hs.put(25,"prasad");
		hs.put(33,"patil"); //key duplication
		
	//	System.out.println(hs);
	}

}
