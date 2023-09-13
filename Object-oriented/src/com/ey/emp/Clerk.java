package com.ey.emp;

public class Clerk extends Employee{
	private double commission;
  
	public Clerk() {
		
	}

	public Clerk(String empName, double salary, double commision) {
		super(empName,salary);
		this.commission = commision;
	}

	@Override
	public void paysslip() {
		// TODO Auto-generated method stub
		super.paysslip();
		System.out.println("commission: "+ commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary()+ commission;
	}
	
	
}
