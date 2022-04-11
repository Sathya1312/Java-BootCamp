package com.cognizant.array;

import java.util.Scanner;

public class MinimumElement {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		scanner.nextLine();
		
		int[] returnedArray = getIntegers(count);
		int returnedMin = findMin(returnedArray);
		
		System.out.println("Minimum Value = " + returnedMin);
		
	}
	
	private static int[] getIntegers(int count){
		int[] getValues = new int[count];
		for(int i=0; i<getValues.length; i++){
			System.out.println("Enter a number: ");
			getValues[i] = scanner.nextInt();
		}
		return getValues;
	}
	
	public static int findMin(int[] minArray){
		int min = Integer.MAX_VALUE;
		for(int i=0; i<minArray.length; i++){		
			int value = minArray[i];
			if(value < min){
				min = value;
			}
		}
		return min;
	}

}
