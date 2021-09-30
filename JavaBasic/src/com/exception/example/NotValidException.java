package com.exception.example;

public class NotValidException extends Exception{

	public NotValidException(String msg){
		System.out.println(msg);
	}
}
