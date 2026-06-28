package com.muskan;

//CYCLIC SORT : 
// Use when : the array elements are between 1 to N strictly. 
// element index = value - 1. 
// Most important from test viewpoint. always asked directly in product based companies interview. 
import java.util.Scanner;

public class CyclicSort {	
	void cyclicsort(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct_index = arr[i]-1; // correct index : ideal location for i'th element. 
			if(arr[correct_index] != arr[i]) {// check whether i index value is at its correct index loc or not . e.g. 3 should be in 2 index . 
				int temp = arr[correct_index];
				arr[correct_index] = arr[i];
				arr[i] = temp;
			}else { //move i pointer ahead if value is at its correct location.
				i++;
			}
		}
	}
	void printArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		CyclicSort cs = new CyclicSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		
		System.out.print("Enter "+arrsize+" array elements : ");
		for(int i = 0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		
		cs.cyclicsort(arr);
		cs.printArray(arr);
		sc.close();
	}
}
