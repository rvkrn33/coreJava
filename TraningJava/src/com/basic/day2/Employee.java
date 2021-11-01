package com.basic.day2;

public class Employee{
	
		static String name="Ajit"; // class level variable --> method Memory
		
		String city; //instace variable  --> Heap Memory
		
		Employee(String city){
			System.out.println("Constructor call");
			this.city=city;
		}
		
		public void print(){
			String msg="Welcome"; //local variable --> Stack memory 
			System.out.println("local --> "+msg);
		}
		
		public static void main(String[] args){
		
			System.out.println("global --> "+name);
			
			Employee e; // reference 
			e= new Employee("Pune"); // object
			
			System.out.println("Instance --> "+e.city);
			
			
			Employee e1=new Employee("Mumbai"); // object
			
			System.out.println("Instance --> "+e1.city);
			
			System.out.println("global --> "+e.name);
			System.out.println("global --> "+e1.name);
			
			e.print();
			
		}
		
	}