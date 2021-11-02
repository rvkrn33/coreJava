package com.basic.day4;

public class ArrayExample2 {

	
	public static void main(String[] args) {
		
		Customer[] cust= new Customer[5];
	
		for (int i = 0; i < 5; i++) {
			Customer c=new Customer();
			c.setId(i);
			c.setName("Kavita"+i);
			c.setAddress("Pune"+i);
			
			cust[i]=c;
		}
		
		for(Customer cc : cust)
		{
			System.out.println(cc);
			System.out.println(cc.getId() + " "+cc.getName() );
		}
	}
}
