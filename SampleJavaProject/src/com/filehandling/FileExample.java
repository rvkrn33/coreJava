package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		//createFile();
		//writeFile();
		
		readFile();
	}

	private static void readFile() throws FileNotFoundException {
		File f=new File("D:abc.txt");
		
		Scanner scReader=new Scanner(f);
		
		while(scReader.hasNextLine()) {
			
			String str=scReader.nextLine();
			System.out.println("--> "+str);
		}
	}

	private static void writeFile() throws IOException {
		
		FileWriter fileWriter=new FileWriter("D:abc.txt");
		
		fileWriter.write("My first file handling program...");
		
		fileWriter.close();
		
	}

	private static void createFile() throws IOException {
		File file=new File("D:abc.txt");
		
		if(file.createNewFile()) 
			System.out.println("file name : "+file.getName());
		else
			System.out.println("File already exist");
	}
}
