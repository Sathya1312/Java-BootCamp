package com.cognizant.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[] getArray = getIntegers(5);
		printIntegers(getArray);
		int[] sortedArray = sortArray(getArray);
		printSortIntegers(sortedArray);

	}
	
	public static int[] getIntegers(int numbers){
		System.out.println("Enter " + numbers +" integer values");
		int[] getValues = new int[numbers];
		for(int i=0; i<getValues.length; i++){
			getValues[i] = scan.nextInt();
		}
		
		return getValues;
	}
	
	public static void printIntegers(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.println("Elements before sorting " + i + " values is " + array[i] + "\r");
		}
	}
	
	public static void printSortIntegers(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.println("Elements after sorting " + i + " value is " + array[i]);
		}
	}
	
	public static int[] sortArray(int[] array){
		/*int[] newArray = new int[array.length];
		for(int i=0; i<array.length; i++){
			newArray[i] = array[i];
		}*/
		int[] newArray = Arrays.copyOf(array, array.length);
		int temp=0;
		for(int i=0; i<newArray.length; i++){			
			for(int j=i+1; j<newArray.length; j++){
				if(newArray[i] < newArray[j]){
					temp = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}
			}
		}
		return newArray;
	}

}
