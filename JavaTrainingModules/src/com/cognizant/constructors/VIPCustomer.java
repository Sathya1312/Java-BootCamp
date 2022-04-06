package com.cognizant.constructors;

public class VIPCustomer {
	
		private String name;
		private int creditLimit;
		private String emailAddress;
		
		public VIPCustomer(){
			this("Default name", 0, "Default email");
			System.out.println("\nCalled no arg constructor");
		}
		
		
		
		public VIPCustomer(String name, int creditLimit) {			
			this(name, creditLimit, "Default email");
		}



		public VIPCustomer(String name, int creditLimit, String emailAddress) {			
			this.name = name;
			this.creditLimit = creditLimit;
			this.emailAddress = emailAddress;
		}


		public String getName() {
			return name;
		}


		public int getCreditLimit() {
			return creditLimit;
		}


		public String getEmailAddress() {
			return emailAddress;
		}
		
		
		
		

}
