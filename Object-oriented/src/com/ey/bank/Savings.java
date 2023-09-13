package com.ey.bank;

public class Savings extends Accounts {

	public Savings() {
		super();		
	}

	public Savings(String holder) {
		//super(holder, OPENING_CURRENT_BAL);
		super(holder, MIN_SAVINGS_BAL);
		txns.add(new Transaction("OB",MIN_SAVINGS_BAL,balance));

	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount<=(balance-1000))   {          
			balance-=amount;
		txns.add(new Transaction("DR",amount,balance));}
		
		else
		throw new BalanceException("Insufficient balance");
	}

}
