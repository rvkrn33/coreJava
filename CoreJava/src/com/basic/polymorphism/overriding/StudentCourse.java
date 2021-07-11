package com.basic.polymorphism.overriding;

public class StudentCourse extends Student{

	public void printDetails(String courseName, String status) {
		System.out.println("Student Cources");
	};
	
	public static void main(String[] args) {
		Student s=new StudentCourse();
		
		s.printDetails("Java", "Completed");
		
	}

}
