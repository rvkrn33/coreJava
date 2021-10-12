package com.file.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		try {
			File f=new File("D:ravi.txt");
			
			  if(f.createNewFile()) { 
				  System.out.println("File is created "); 
			} else
			  System.out.println("file already exist");
			 
			
			FileWriter fileWriter=new FileWriter(f);
			String s="Java programming ..";
			fileWriter.write(s+ "Welcome user... this is my ");
			
			fileWriter.close();
			
			//Reading file
			Scanner sc =new Scanner(f);
			
			while(sc.hasNextLine()) {
				String str= sc.nextLine();
				System.out.println(str);
			}
		
			sc.close();
			
			
			FileReader reader= new FileReader(f);
			StringBuffer sb=new StringBuffer();
			
			while(reader.read()!=-1) {
				
				char c=(char) reader.read();
				sb.append(c);
				
			}
			System.out.println(">>>> "+ sb );
			
			reader.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
}
