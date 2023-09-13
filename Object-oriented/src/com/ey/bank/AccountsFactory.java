package com.ey.bank;

public final class AccountsFactory {  // cannot be abstract
	
	public AccountsFactory() {

	}
	public static Savings createSavingsAccount(String holder) {
		return new Savings(holder);
		
	}
	
	public static Current createCurrentAccount(String holder) {
		return new Current(holder);
	}

}
