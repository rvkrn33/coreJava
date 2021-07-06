package com.basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentDetails {


    public static void main(String[] args)
    {
    	Customer s1 = new Customer();
  
        // Getting hold of Class
        // object created by JVM.
        Class c1 = s1.getClass();  //heap memory
  
        // Printing type of object using c1.
        System.out.println(c1.getName());  // student
  
        // getting all methods in an array
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());
  
        // getting all fields in an array
        Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());
    }
}
  
// A sample class whose information
// is fetched above using its Class object.
class Student {
    private String name;
    private int roll_No;
  
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getRoll_no() { return roll_No; }
    public void setRoll_no(int roll_no)
    {
        this.roll_No = roll_no;
    }
}
