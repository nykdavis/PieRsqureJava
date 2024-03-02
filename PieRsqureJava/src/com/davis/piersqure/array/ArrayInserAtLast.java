package com.davis.piersqure.array;

public class ArrayInserAtLast {

	public static void main(String[] args) {
		
		//Problem 2: insert element (9) at last
		int[] arr = {2,3,4,6,7,8};
		
		System.out.println("old array:");
		for(int value:arr) {
			System.out.print(value+ " ");
		}
		
		int size = arr.length+1;
		
		int[] newArr = new int[size];
		
		for(int i = 0 ;  i<arr.length; i++) {
			newArr[i]=arr[i];
		}
		newArr[arr.length]=9;
		arr= null;
		arr = newArr;
		
		System.out.println("\nnew array:");
		for(int value:arr) {
			System.out.print(value+ " ");
		}

	}

}
