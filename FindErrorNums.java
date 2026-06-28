// Leetcode 645 :

package com.muskan;
import java.util.Scanner;
public class FindErrorNums {

	int[] finderrornums(int[] arr) {
		int[] res = new int[2];
		int i=0;
		while(i < arr.length) {
			int correct_index = arr[i]-1;
			
			if(arr[correct_index] != arr[i]) {
				int temp = arr[correct_index];
				arr[correct_index] = arr[i];
				arr[i] = temp;
			}else {
				i++;
			}
		}
		// In this we already know that only one value is duplicate and one is missing, so total 2 value will need to be stored in array .
		// so, we can directly assign array size as 2.
		for(int index = 0; index< arr.length; index++) {
			// if index does not match the value that means the index is missing and the value stored here is duplicate.
			// so add these index and value in res.			
			if (arr[index] != index+1) {
				res[0] = arr[index];   // duplicate value.
				res[1] = index+1;  // missing value.
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FindErrorNums num = new FindErrorNums();
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		
		int[] arr = new int[arrsize];
		System.out.print("enter array elements : ");
		for(int i=0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = num.finderrornums(arr);
		System.out.print("missing and duplicate value : ["+res[0]+" "+res[1]+"]");
		sc.close();
	}
}
