package com.muskan;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		
		System.out.print("Enter array elements : ");
		for (int i =0; i<arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<arrsize-1; i++) {
			int minValueIndex = i; // consider current value from front of array as minimum.
			// traverse from the next element till the end.			
			for(int j = i+1; j<arrsize; j++) {
				// Check if index of min value > curr value(j), if yes: then make the curr value index minIndex ;else, continue.					
				if(arr[minValueIndex] > arr[j]) {
					minValueIndex = j;
				}
			}
			// after getting the min value index from unsorted section , swap it with curr slot from beginning. 			
			int temp = arr[i];
			arr[i] = arr[minValueIndex];
			arr[minValueIndex] = temp;
		}
		
		System.out.print("Sorted Array : ");
		for(int i =0; i< arrsize; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
