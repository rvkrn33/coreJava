package com.basic.test;

import com.basic.model.Employee;

public class Sample
{

	
	public static void main(String[] args) {
		
		Employee emp;
		emp=new Employee(); //Heap
		
		emp.setName("abc");
		emp.setAddress("pune");
		emp.setAge(32);
		
		
		Employee emp1=new Employee(); //Heap
		
		emp1.setName("abc");
		emp1.setAddress("pune");
		emp1.setAge(32);
		
		System.out.println(emp.getName()+" ,"+emp.getAddress()+" ,"+emp.getAge());
		
		//System.out.println("Emplyee Details -->"+emp.hashCode());  //employee@4545
		
		System.out.println(emp);  //employee@4545
		
		System.out.println(emp==emp1); //compare reference
		
		System.out.println(emp.equals(emp1)); //containt
		
		System.out.println(emp.hashCode()+", "+emp1.hashCode()); 
		
		/* 
Employee All Details [abc,pune,32]
false
false
2018699554, 1311053135
		 */
				
	}
}
