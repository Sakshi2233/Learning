package com.ey.emp;

public class Manager extends Employee {
	private double incentives;

	public Manager() {
		super();   //optional:by default a child class calls the default constructor of parent
		
	}

	public Manager(String empName, double salary, double incentives) {
		//constructor chaining:calling constructor of parent class with matching signature
		super(empName, salary);
		this.incentives=incentives;
	}

	@Override
	public void paysslip() {
		super.paysslip();    //calling payslip() method of super class  
		System.out.println("incentives: "+ incentives);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+incentives;  //source-->override/implement method
	}
	
	
	

}
