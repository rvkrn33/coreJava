package oops.exmple;

import java.util.Scanner;

public class BankMainApplication {

	
	public static void main(String[] args) {
		
		int acNo=123456789;
		
		System.out.println("=======Welcome Bank===========");
		
		System.out.println("1. Credit");
		System.out.println("2. Debit");
		System.out.println("3. Loan Approval");
		System.out.println("4. Logout");
		
		System.out.println("----------------------");
		
		
		Bank b=new Bank(5000);
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("Please enter your choice : ");
			int ch=sc.nextInt();
			
			switch (ch) {
				case 1:  
						System.out.println("Your Current Balance : "+b.balance);
						System.out.println("Enter credit Amount ");
						int amount=sc.nextInt();
						
						b.drCrAmount(123456789, amount, "CR", "dd",b);
						System.out.println("Your updated Balance : "+b.balance);
						
					break;
				case 2:  
					System.out.println("Your Current Balance : "+b.balance);
					System.out.println("Enter Debit Amount ");
					int amt=sc.nextInt();
					
					b.drCrAmount(123456789, amt, "DR", "Cleark",b);
					System.out.println("Your updated Balance : "+b.balance);
				break;
				
				case 3:  
					System.out.println("Display Loan status ");
					b.drCrAmount(123456789, 0, "DR", "Manager",b);
					
				break;
	
				case 4: 
					System.out.println("Logout ..");
					System.exit(0);
			}
		}
		
	}
}
