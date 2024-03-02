package com.davis.piersqure.array;

public class ArrayInsert {

	public static void main(String[] args) {
		//Problem 1: insert element (1) at beginning
		
		int[] arr = {2,3,4,6,7,8};
		
		System.out.println("old array:");
		for(int value:arr) {
			System.out.print(value+ " ");
		}
		
		int size = arr.length+1;
		int[] newArr = new int[size];
		
		for(int i = 0; i< arr.length; i++) {
			newArr[i+1]=arr[i];
		}
		newArr[0] = 1;
		arr = null;
		arr = newArr;
		
		System.out.println("\nnew array:");
		for(int value:arr) {
			System.out.print(value+ " ");
		}

		//step 1: size old array
		//step 2: size+1 (new Array)
		//step 3: create new array (size+1)
		//step 4: transfer value 

	}

}
