package com.muskan;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		System.out.print("Enter "+arrsize+" array elements : ");
		for(int i = 0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		//Insertion Sort logic : 		
		for(int i = 0; i < arrsize-1; i++) {
			//start from curr+1 element and move backward .
			for(int j = i+1; j >0; j--) {
				// swap if curr < prev elements .				
				if(arr[j-1]> arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}else {
					//stop if the current element reached its correct position . the elements prev to it are already sorted.
					break;
				}
			}
		}
		
		System.out.print("Sorted array : ");
		for(int i = 0; i< arrsize; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
