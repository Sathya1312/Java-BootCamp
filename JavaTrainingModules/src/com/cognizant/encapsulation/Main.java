package com.cognizant.encapsulation;

public class Main {

	public static void main(String[] args) {
		Player player = new Player("Sathya", 50 ,"Sword");
		
		System.out.println("Initial Health = " + player.getHealth());
		player.loseHealth(10);
		
		System.out.println("**********************");
		Printer printer = new Printer(50, false);
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(5);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
	}

}
