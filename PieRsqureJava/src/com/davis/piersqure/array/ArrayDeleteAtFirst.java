package com.davis.piersqure.array;

public class ArrayDeleteAtFirst {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		for(int var:arr) {
			System.out.print(var+ " ");
		}
		
		int[] newArr = new int[arr.length-1];
		
		for(int i = 0 ;i< newArr.length; i++ ) {
			newArr[i]=arr[i+1];
		}
		
		arr = null;
		arr = newArr;
		
		System.out.println("\nAfter deletion: ");
		for(int var:arr) {
			System.out.print(var+ " ");
		}

	}

}
