package com.ey.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;             //private to protected
	
	protected List<Transaction> txns;
	
	//Application constants
	public static final int INIT_ACCOUNT_NO=10101;
	public static final double MIN_SAVINGS_BAL=1000;
	public static final double OPENING_CURRENT_BAL=5000;
	public static final double MIN_CURRENT_BAL=0;
	public static final double OVERDRAFT_LIMIT=10000;
	
	private static int autogen= INIT_ACCOUNT_NO;
	
	public Accounts() {
		
	}
//	private static int counter=1;

	public Accounts(String holder, double balance) {
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		txns=new ArrayList<>();
	}
	
	public void summary() {
		System.out.println("A/C no:" +acntNo);
		System.out.println("holder:"+ holder);
		System.out.println("balance"+ balance);
		System.out.println("\t");
	}
    public void deposit(double amount) {
    	balance+=amount;
    	txns.add(new Transaction("CR",amount,balance));
    }
    
//    public void withdraw(double amount) {
//    	if(amount<=balance) {
//    		balance-=amount;
//    	}
//    	else 
//    		System.out.println("insufficient Balance");
//    };
  //  public abstract void withdraw(double amount);
    
    @Override
	public void statement() {
    	txns.forEach(System.out::println);
    	
	}
}
