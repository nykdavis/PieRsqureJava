package com.davis.piersqure.array;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int value = 2;
		int left = 0;
		int right = arr.length-1;
		boolean flag = false;
		int mid = 0;
		
		while(left<=right) {
			mid = left+(right-left)/2;
			//System.out.println("mid :"+mid);
			if(value == arr[mid]) {
				flag = true;
			//	System.out.println("index: "+mid);
			}
			
			if(value>arr[mid]) {
				left = mid+1;
			}else {
				right = mid -1;
			}
		}
		
		if(flag) {
			System.out.println("Element exist on index no. "+mid);
		}else {
			System.out.println("Element not exist insde the given array.");
		}
	}

}
