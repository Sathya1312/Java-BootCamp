package com.cognizant.constructors;

public class Main {

	public static void main(String[] args) {
		BankAccount sathyaAcct = new BankAccount(123456, 0.00, "Sathya", "sathyapriya@gmail.com", 044-123456);
		System.out.println("Customer Name = " + sathyaAcct.getName());
		System.out.println("Account Number = " + sathyaAcct.getAccountNumber());
		
		sathyaAcct.withdrawFund(100.0);
		
		sathyaAcct.depositFund(50.0);
		sathyaAcct.withdrawFund(100.0);
		
		sathyaAcct.depositFund(51.0);
		sathyaAcct.withdrawFund(100.0);
		
		BankAccount vinoAcct = new BankAccount("Vinodhini", "vino@gmail.com", 14785236);
		System.out.println("\n"+ vinoAcct.getAccountNumber() + " name " + vinoAcct.getName());
		
		VIPCustomer customer1 = new VIPCustomer();
		System.out.println(customer1.getName());
		
		VIPCustomer customer2 = new VIPCustomer("Sathya", 50000);
		System.out.println(customer2.getName());
		
		VIPCustomer vip = new VIPCustomer("Priya", 100, "priya@gmail.com");
		System.out.println("\nCustomer Name = " + vip.getName() + " Credit limit " + vip.getCreditLimit() + " Email Address = " + vip.getEmailAddress());

	}

}
