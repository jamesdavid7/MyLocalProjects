package com.spring.employee;

public class Employee {

	private int empID;
	private String empName;
	private Address empAddress;
	
	public Employee()
	{
		
	}
	
	public Employee(int empID, String empName, Address empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public void showEmployeeDetails() {
		System.out.println("*******************************************************************************");
		System.out.println("Employee ID   		: " + empID);
		System.out.println("Employee Name 		: " + empName);
		if(empAddress == null)
			System.out.println("Employee Address 	: NA");
		else
			System.out.println("Employee Address 	: " + empAddress.getDoorNo() + " , " + empAddress.getStreet() + ", "
				+ empAddress.getCity() + ", " + empAddress.getPincode());
		System.out.println("*******************************************************************************");
	}
}
