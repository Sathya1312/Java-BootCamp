package com.cognizant.interfaceschallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Player sathya = new Player("Sathya", 10, 15);
		System.out.println(sathya.toString());
		saveObject(sathya);
		
		sathya.setHitPoints(8);
		System.out.println(sathya);
		sathya.setWeapon("Stormbringer");
		saveObject(sathya);
		//loadObject(sathya);
		System.out.println(sathya);
		
		ISaveable wereWolf = new Monster("Werewolf",20, 40);		
		System.out.println(wereWolf);
		System.out.println("Strength= " + ((Monster)wereWolf).getStrength());
		saveObject(wereWolf);

	}
	
	public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
	
	public static void saveObject(ISaveable objectToSave){
		for(int i=0; i<objectToSave.write().size(); i++){
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
		}
	}
	
	public static void loadObject(ISaveable objectToLoad){
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}

}
