package com.ey.bank;

public class TestAcccounts {
	
	public static void main(String[] args) {
		Bank s1= AccountsFactory.createSavingsAccount("Ben");
		s1.deposit(3000);
		try {
			s1.withdraw(1000);
		} catch (BalanceException e) {
			
			e.printStackTrace();
		}
		s1.deposit(5000);
		
		try {
			s1.withdraw(4000);
		} catch (BalanceException e) {
		
			e.printStackTrace();
		}
		s1.statement();
	}
	

}
