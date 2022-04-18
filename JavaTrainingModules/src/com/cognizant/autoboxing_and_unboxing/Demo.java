package com.cognizant.autoboxing_and_unboxing;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> intArrayList = new ArrayList<>();
		for(int i=0; i<=10; i++){
			intArrayList.add(Integer.valueOf(i));
		}
		
		for(int i=0; i<=10; i++){
			System.out.println(i+ "---->" + intArrayList.get(i).intValue());
		}
		
		Integer myIntValue = 56; //Integer.valueOf(56);
		int myInt = myIntValue; //myIntValue.intValue();
		
		ArrayList<Double> myDoubleValues = new ArrayList<Double>();
		for(double dbl = 0.0; dbl<=10.0; dbl += 0.5){
			myDoubleValues.add(Double.valueOf(dbl));
		}
		
		for(int i=0; i<myDoubleValues.size(); i++){
			System.out.println(i + "--->" + myDoubleValues.get(i).doubleValue());
		}

	}

}
