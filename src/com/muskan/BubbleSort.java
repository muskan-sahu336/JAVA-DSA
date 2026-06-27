package com.muskan;

import java.util.Scanner ;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of Array : ");
		int arrsize = sc.nextInt();

		int arr[] = new int[arrsize];

		System.out.print("Enter "+arrsize+" Elements : ");
		for(int i=0; i<arrsize; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i<arrsize; i++ ) {
			boolean swapped = false;
			// move from 2nd element till last unsorted element bcoz there is no point comparing last sorted elements.
			for(int j=1;j<arrsize-i; j++) {
				// compare if curr value < prev value : if yes, then swap and make swapped true showing swapping done else, continue.
				if (arr[j-1] > arr[j] ) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			// after 1 iteration no swapping done , it means array is sorted so stop future iterations. helps to reduce TC.
			if (swapped == false) {
				break;
			}
		}

		System.out.print("Sorted array : ");
		for(int i=0; i< arrsize; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();// to prevent resource leakage chances.
	}
}
