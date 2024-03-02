package com.davis.piersqure.array;

public class ArrayProblems {

	public static void main(String[] args) {
		
		int[] arr = {3,7,4,89,23,76,45,90,134,65,456,34};
		System.out.println(arr.length);
		
		
		//Even, Odd, 90 -> ?
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == 90) {
			System.out.print(i);
			}
		}
		
		

	}

}
