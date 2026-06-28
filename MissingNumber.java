// leetcode 912 : Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// sol : use cyclic sort because element are between 0 to n . use WHILE LOOP, NOT FOR LOOP.
package com.muskan;
import java.util.Scanner;

public class MissingNumber {
	int missingNumber(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			//given range is 0 to N. e.g. 3 index = 3 as value.
			int correct_index = arr[i];
			// check if index and value at it is same .if not: swap them.
			if(correct_index < arr.length && arr[correct_index]!=arr[i]) {
				int temp = arr[correct_index];
				arr[correct_index] = arr[i];
				arr[i] = temp;
			}else {
				i++;
			}
		}
		// continue if index and value at it is same i.e. in correct pos else return index value 
		//because according to pattern, at each index, it should have same value stored.
		for(int index =0; index < arr.length; index++) {
			if(index != arr[index]) {
				return index; 
			}
		}
		// return length if all element at correct pos.
		return arr.length;										
	}
	
	public static void main(String[] args) {
		MissingNumber num = new MissingNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		
		int[] arr = new int[arrsize];
		System.out.print("enter array elements : ");
		for(int i=0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Missing number : "+num.missingNumber(arr));
	}
}
