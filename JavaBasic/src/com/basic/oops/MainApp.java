package com.basic.oops;

public class MainApp {

public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		emp.setAge(32);
		emp.setName("Ravi");
		emp.setEmail("sdf@gmail.com");
		emp.setPhone(78552222222l);
		
		System.out.println("Emp -> "+emp.getAge());
		
		Employee emp1=new Employee();
		emp1.setAge(33);
		emp1.setName("Ajit");
		emp1.setEmail("ajit@gmail.com");
		emp1.setPhone(744522254411l);
		
		System.out.println("Emp1 -> "+emp1.getAge());
	}

}
