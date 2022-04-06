package com.cognizant.constructors;

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	private String name;
	private String email;
	private long phoneNumber;
	
	BankAccount(){
		this(789456, 0.00, "Default name" , "Default email", 45789123);
		System.out.println("Called no arg constructor!!");
	}
	
	BankAccount(long accountNumber, double balance, String name, String email, long phoneNumber){
		System.out.println("Account constructor with parameter called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public BankAccount(String name, String email, long phoneNumber) {
		this(99999, 100.5, name, email, phoneNumber);		
	}

	public void depositFund(double depositAmount){
		double balance = this.balance += depositAmount;
		System.out.println("Balance Amount = " + balance);
	}
	
	public void withdrawFund(double withdrawalAmount){
		if(this.balance - withdrawalAmount <0){
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");			
		}else{
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
		}
	}
	
	public long getAccountNumber(){
		return this.accountNumber;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String getName(){
		return this.name;		
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public long getPhoneNumber(){
		return this.phoneNumber;
	}
	
	public void setAccountNumber(long accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(long balance){
		this.balance = balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	


}
