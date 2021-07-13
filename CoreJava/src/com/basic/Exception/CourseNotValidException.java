package com.basic.Exception;

public class CourseNotValidException extends Exception{

	public CourseNotValidException(String msg) {
		System.out.println(msg);
	}
}
