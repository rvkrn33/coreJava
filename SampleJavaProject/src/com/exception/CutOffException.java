package com.exception;

public class CutOffException extends Exception{

	CutOffException(String msg){
		System.out.println("--> "+msg);
	}
}
