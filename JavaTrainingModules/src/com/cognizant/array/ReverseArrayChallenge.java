package com.cognizant.array;

import java.util.Arrays;

public class ReverseArrayChallenge {

	public static void main(String[] args) {
		
		int[] array = {10,12,15,16,78,15,12};
		System.out.println("Array is : " + Arrays.toString(array));
		
		reverse(array);
		System.out.println("Reverse Array is : " + Arrays.toString(array));

	}
	private static void reverse(int[] reverseArray){
		
		int maxIndex = reverseArray.length-1;
		int halfLength = reverseArray.length / 2;
		for(int i=0; i<halfLength; i++){
			int temp = reverseArray[i];
			reverseArray[i] = reverseArray[maxIndex-i];
			reverseArray[maxIndex-i] = temp;
		}
	}
}
