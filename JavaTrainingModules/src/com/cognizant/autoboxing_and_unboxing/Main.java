package com.cognizant.autoboxing_and_unboxing;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank("National Australian Bank");
		if(bank.addBranch("Adelaide")){
			System.out.println("Adelaide branch are created");
		}
		
		
		bank.addCustomer("Adelaide", "Sathya", 50.5);
		bank.addCustomer("Adelaide", "Mike", 175.34);
		bank.addCustomer("Adelaide", "Percy", 220.12);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Bob", 150.54);
		
		bank.addCustomerTransaction("Adelaide", "Sathya", 44.22);
		bank.addCustomerTransaction("Adelaide", "Sathya", 12.44);
		bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
		
		bank.listCustomers("Adelaide", true);
		bank.listCustomers("Sydney", true);
		
		bank.addBranch("Melbourne");
		
		if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
			System.out.println("Melbourne branch does not exists");
		}
		
		if(!bank.addBranch("Adelaide")){
			System.out.println("Adelaide branch already exists");
		}
		
		if(!bank.addCustomerTransaction("Adelaide", "Priya", 55.52)){
			System.out.println("Customer does not exist at branch");
		}
		
		if(!bank.addCustomer("Adelaide", "Sathya", 55.55)){
			System.out.println("Customer Sathya is already exists");
		}

	}

}
