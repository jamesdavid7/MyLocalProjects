package com.spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		
//		Employee employeeJames = new Employee();
		Employee employeeJames =	context.getBean("employeeJames",Employee.class); 

//		Address addressJames = new Address();
		
		//Setter Injection
		Address addressJames = context.getBean("addressJames",Address.class);
		
//		addressJames.setDoorNo(22);
//		addressJames.setStreet("New Nainar Street");
//		addressJames.setCity("Subramaniyapuram");
//		addressJames.setPincode(628251);
//
//		employeeJames.setEmpID(1);
//		employeeJames.setEmpName("James");
//
//		employeeJames.setEmpAddress(addressJames);

//		Employee employeeDavid = new Employee();

		Employee employeeDavid =	context.getBean("employeeDavid",Employee.class); 

//		Address addressJames = new Address();
		
		//Setter Injection
		Address addressDavid = context.getBean("addressDavid",Address.class);
//		addressDavid.setDoorNo(1);
//		addressDavid.setStreet("GH Road");
//		addressDavid.setCity("Pandaravilai");
//		addressDavid.setPincode(628251);
//
//		employeeDavid.setEmpID(2);
//		employeeDavid.setEmpName("David");
//
//		employeeDavid.setEmpAddress(addressDavid);
		
		//Construnctor Injection
		
		Employee employeeJabez =	context.getBean("employeeJabez",Employee.class);

//		Address addressJabez = new Address(140, "Balamudali street", "Kelambakkam", 603103);
//		Employee employeeJabez = new Employee(3, "Jabez", addressJabez);

		employeeJames.showEmployeeDetails();
		employeeDavid.showEmployeeDetails();
		employeeJabez.showEmployeeDetails();

	}
}
