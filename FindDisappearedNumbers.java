// Leetcode 448:

package com.muskan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDisappearedNumbers {
	List<Integer> disappearednumbers(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			//given range is 1 to N. e.g. 2nd index should have 3 as value.			
			int correct_Index = arr[i]-1; 
			//swap if index and value stored is not same.			
			if(arr[correct_Index] != arr[i]) {
				int temp = arr[correct_Index];
				arr[correct_Index] = arr[i];
				arr[i] = temp;
			}else {
				//increment i pointer if value is at correct pos.			
				i++;
			}
		}
		//we used list instead of array because it grows dynamically which array can't. 		
		List<Integer> res = new ArrayList<Integer>();
		for(int index = 0; index < arr.length ; index++) {
			
			//If index is not equal to index+1 value stored then add index into res list. 		
			if(arr[index] != index+1) {
				res.add(index+1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		FindDisappearedNumbers num = new FindDisappearedNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		
		int[] arr = new int[arrsize];
		System.out.print("enter array elements : ");
		for(int i=0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("disappeared numbers : "+num.disappearednumbers(arr));
	}
}
