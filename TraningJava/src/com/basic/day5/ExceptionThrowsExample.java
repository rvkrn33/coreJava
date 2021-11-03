package com.basic.day5;

import java.io.IOException;

public class ExceptionThrowsExample {

	public static void main(String[] args)  {
		
		Product p=new Product();
		try {
			p.productDetails();
			
		}catch(IOException i) {
			System.out.println("exception occured in product details --> "+i.toString());
			i.printStackTrace();
		}
	}
}


class Product{
	
	public void productDetails() throws IOException {
		
		String s="1022Prod1";
		
		throw new IOException();
		
	}
}
