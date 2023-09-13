
package com.ey.emp;




public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter;
	
	static {   //static initializer block- executers at a time of class loading
		System.out.println("account class loaded...");
		counter=901;
	}
	{
		System.out.println("Employee object created");
	}
	public Employee() {
		
	}
	

	public Employee(String empName, double salary) {
		System.out.println("Employee constructor..");
		this.empNo = counter ++;      //post increment
		this.empName = empName;
		this.salary = salary;
	}
	
	public void paysslip() {
		System.out.println("Emp No:"+empNo);
		System.out.println("Emp Name:"+empName);
		System.out.println("Salary:"+salary);
	}

	public double getSalary() {
		return salary;
	}
	

}



