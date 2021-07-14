package com.basic.project;

import java.util.Scanner;

public class MainApp {

	public static Registration r=null;
	
	public static void main(String[] args) {
		
		//take input from user and put into Register class
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println(" ");
			System.out.println("Welcome User Management");
			System.out.println("1. Registration");
			System.out.println("2. View");
			System.out.println("3. update");
			System.out.println("4. Exit");
			System.out.println(" ========================");
			int ch=sc.nextInt();
			
			switch(ch) {
			
				case 1: System.out.println("Please Enter Registration Details");
						newRegistration(sc);
						System.out.println("Registration Successful");
						break;
						
				case 2: System.out.println("---------Registration Details-------");
						viewDetails();
						break;
					
				case 3: System.out.println("System shutdown");
						System.exit(0);
			}
		}
	}

	private static void viewDetails() {
		
		if(null==r)
		{
			System.out.println("Data Not found");
		}else {
			System.out.println("Name	Email			Dob		password");
			System.out.println(r.getName()+"	"+r.getEmail()+"		"+r.getDob()+"	"+r.getPassword());
		}
		
	}

	private static Registration newRegistration(Scanner sc) {
		
			r=new Registration();
			
			System.out.println("Enter name");
			r.setName(sc.next());
			
			System.out.println("Enter Email");
			r.setEmail(sc.next());
			
			System.out.println("Enter Date of birth");
			r.setDob(sc.next());
			
			System.out.println("Enter Password");
			r.setPassword(sc.next());
			
			return r;
			
	}
}
