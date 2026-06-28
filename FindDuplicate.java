// Leetcode 287
package com.muskan;
import java.util.Scanner;
public class FindDuplicate {
	
	int findDuplicate(int[] arr) {
		int i=0;
		while (i < arr.length) {
			int correct_index = arr[i]-1; 
			
			if(arr[correct_index] != arr[i]) {
				int temp = arr[correct_index];
				arr[correct_index] = arr[i];
				arr[i] = temp;
			}else {
				i++;
			}
		}
		for(int index=0; index<arr.length; index++){
			// same as prev questions of cyclic sort, just instead of returning index no. return value stored at that location .			
			if(arr[index] !=index+1) {
				return arr[index];
			}
		}
		return -1; // return this if no duplicate found.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FindDuplicate duplicate = new FindDuplicate();
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		
		int[] arr = new int[arrsize];
		System.out.print("enter array elements : ");
		for(int i=0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("duplicate number : "+duplicate.findDuplicate(arr));
	}
}
