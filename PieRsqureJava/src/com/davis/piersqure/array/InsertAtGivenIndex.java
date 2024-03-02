package com.davis.piersqure.array;

public class InsertAtGivenIndex {

	public static void main(String[] args) {

		// Problem 3: insert element (5) at 3rd index
		int[] arr = { 2, 3, 4, 6, 7, 8 };
		int index = 3;
		int value = 5;
		
		System.out.println("old array:");
		for(int var:arr) {
			System.out.print(var+ " ");
		}
		
		int size = arr.length+1;
		int[] newArr = new int[size];
		
		for(int i =0 ; i< arr.length; i++) {
			if(i<index) {
				newArr[i]=arr[i];
			}else {
				newArr[i+1]=arr[i];
			}
		}
		newArr[index] = value;
		
		arr = null;
		arr = newArr;
		
		System.out.println("\nnew array:");
		for(int var:arr) {
			System.out.print(var+ " ");
		}

	}

}
