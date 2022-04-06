package com.cognizant.classes;

public class Main {

	public static void main(String[] args) {
		
		Car_Class porsche = new Car_Class();
		porsche.setModel("COMMODRE");
		
		System.out.println("Model is : " + porsche.getModel());
		
		SimpleCalculator sc = new SimpleCalculator();
		sc.setFirstNumber(5.0);
		sc.setSecondNumber(4.0);
		System.out.println("\n************************");
		System.out.println("Addition = " + sc.getAdditionResult());
		System.out.println("Subtraction = " + sc.getSubtractionResult());
		sc.setFirstNumber(5.25);
		sc.setSecondNumber(0);
		System.out.println("Multiplication = " + sc.getMultiplicationResult());
		System.out.println("Division = " + sc.getDivisionResult());
		
		Person person = new Person();
		System.out.println("\n************************");
		person.setFirstName(""); //firstname is set to empty string
		person.setLastName(""); //lastname is set to empty string
		person.setAge(10);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.isTeen());
		person.setFirstName("Sathya");
		person.setAge(18);
		System.out.println("fullName = " + person.getFullName());
		System.out.println("teen = " + person.getAge());
		person.setLastName("Priya");
		System.out.println("fullName = " + person.getFullName());

	}

}
