package com.cognizant.array;

import java.util.Scanner;

public class Array {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] intArrays = getInteger(5);
		for(int i=0; i<intArrays.length; i++){
			System.out.println("Element " + i + ", value is " + intArrays[i]);
		}
		
		System.out.println("The average is " + getAverage(intArrays));
	}
	
	public static int[] getInteger(int numbers){
		System.out.println("Enter " + numbers + " integer values.\r");
		int[] values = new int[numbers];
		for(int i=0; i<values.length; i++){
			values[i] = scan.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] array){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum+= array[i];
		}
		
		return (double) sum / (double) array.length;
	}

}
