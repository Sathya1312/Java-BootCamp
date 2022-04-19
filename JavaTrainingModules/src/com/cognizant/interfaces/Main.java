package com.cognizant.interfaces;

public class Main {

	public static void main(String[] args) {
		ITelephone sathyaPhone;
		sathyaPhone = new DeskPhone(123456);
		sathyaPhone.powerOn();
		sathyaPhone.callPhone(123456);
		sathyaPhone.answer();
		
		sathyaPhone = new MobilePhone(987654);
		sathyaPhone.powerOn();
		sathyaPhone.callPhone(987654);
		sathyaPhone.answer();
		

	}

}
