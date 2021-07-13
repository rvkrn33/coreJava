package com.basic.Exception;

import java.util.Scanner;

public class Course {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) throws CourseNotValidException {

		Course c = null;
		c = new Course();

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if (null == s) {
			throw new NullPointerException("Course name is null");
		} 
		else if (s.equals("java"))
			c.setName(s);
		else
			throw new CourseNotValidException("Couse not valid exception");
		
		System.out.println("Course "+c.getName());
	}

}
