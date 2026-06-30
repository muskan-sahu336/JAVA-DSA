package com.muskan;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	
	static int[] mergesort(int[] arr) {
		//base condition :
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		// copy the array into new array object for this specific range. 		
		int[] left_arr = mergesort(Arrays.copyOfRange(arr, 0, mid));
		int[] right_arr = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
				
		return  merge(left_arr, right_arr);
	
	}
	
	static int[] merge(int[] arr1, int[] arr2) {
	
		int[] mix = new int[arr1.length + arr2.length];
		
		int i=0; // pointer of arr1.
		int j=0; // pointer of arr2.
 		int k=0; // pointer of new array mix.
		
		while(i < arr1.length && j < arr2.length) {
			// add arr1 element into mix if smaller than arr2 and vice verse, then increment mix pointer . 
			if(arr1[i] < arr2[j]) {
				mix[k] = arr1[i];
				i++;
			}else {
				mix[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		// it may be possible that one array may not be complete i.e. have longer length than other arr
		// copy the remaining element .either of these two will be true, not both. 		
		while(i < arr1.length) {
			mix[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j < arr2.length) {
			mix[k] = arr2[j];
			j++;
			k++;
		}
		
		return mix;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		System.out.print("Enter "+arrsize+" array elements : ");
		for(int i = 0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		arr = mergesort(arr);
		System.out.print("Sorted array : "+Arrays.toString(arr));
		sc.close();
	}
}