package com.basic.day4;

import java.util.Scanner;

public class BankApplication {

	static Customer[] array=new Customer[10];
	
	static int recordCount=0;
	
	public static void main(String[] args) {
		
		System.out.println("************Welcome ******************");
		
		print("1. Add Customer");
		print("2. Update");
		print("3. View");
		print("4. Exit");
		Scanner sc;
		sc=new Scanner(System.in);
		while(true) {
			print("Please Enter your choice :");
			
			switch (sc.next()) {
					case "1": add(sc,args[0]);
						break;
					case "2": //update(sc);
						break;
					case "3": view();
						break;
					case "4": System.exit(0);
						break;
					default: print("Wrong choice");
						break;
			}
		}
	}

	private static void view() {
		
		System.out.println(" ---> "+recordCount);
		if(recordCount==0) {
			print("Data Not Found");
		}else
			print("ID      NAME      Address");
		
		for (int i = 0; i < recordCount; i++) {
			Customer cc=array[i];
			System.out.println(cc.getId() +"	 "+cc.getName()+"		"+cc.getAddress() );
		}
			
	}

	private static void add(Scanner sc, String role) {
		
		if(role.equals("Admin")) {
			
			print("Please enter id :");
			Customer c=new Customer();
			c.setId(sc.nextInt());
			print("Pleser enter name :");
			c.setName(sc.next());
			print("Pleser enter address :");
			c.setAddress(sc.next());
			
			if(recordCount==0) 
				array[recordCount]=c;
			else
				array[recordCount]=c;
			
			recordCount++;
		}
		else
			print("Not allow, you can just view");
		
	}

	private static void print(String str) {
		System.out.println(str);
	}
}
