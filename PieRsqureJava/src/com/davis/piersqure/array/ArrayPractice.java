package com.davis.piersqure.array;

public class ArrayPractice {

	public static void main(String[] args) {
		
		//1. Static initialization
		int arr[] = {3,78,2,32,89,31,65,89};
		System.out.println(arr.length);
		//System.out.println(arr[7]);
		
		//for loop
	/*	for(int i = 0 ; i< arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}*/
		
		//for each
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		//2.Dynamic initialization
		int[] arr1 = new int[5];
		arr1[0] = 54;
		arr1[1] = 34;
		arr1[2] = 1;
		arr1[3] = 24;
		arr1[4] = 67;
		
		//Using loop 
		int[] arr2 = new int[5];
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = i+5;
		}
	}

}
