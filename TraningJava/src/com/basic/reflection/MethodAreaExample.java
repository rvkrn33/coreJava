package com.basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.basic.Bank;

public class MethodAreaExample {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		
		Method[] methods = Bank.class.getDeclaredMethods();
		
        int nMethod = 1;
        System.out.println("1. List of all methods of Bank class");
        for (Method method : methods) {
            System.out.printf("%d. %s", ++nMethod, method);
            System.out.println();
        }
        System.out.printf("%d. End - all  methods of Bank class", ++nMethod);
    
        System.out.println();
        Field[] fields= Bank.class.getDeclaredFields();
        
        for(Field field: fields) {
        	System.out.println("--> "+field);
        }
	}

}
