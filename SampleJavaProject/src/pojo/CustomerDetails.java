package pojo;

import java.util.Scanner;

import com.model.Customer;

public class CustomerDetails {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		System.out.println("---> "+s);
		
		 Customer c;
		 c=new Customer(5);
		 
		 System.out.println(c.hashCode());
		 
		 c.i=45;
		 System.out.println(c.i); //45
		 System.out.println(c.name); //ajit
	}
}
