// Leetcode 442 :

package com.muskan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicates2 {
	List<Integer> findDuplicate(int[] arr) {
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
		List<Integer> res = new ArrayList<Integer>();
		for(int index=0; index<arr.length; index++){
			// same as prev question of findDuplicate(448), just instead of returning one value, we store all twice appeared value in res list.			
			if(arr[index] != index+1) {
				res.add(arr[index]);
			}
		}
		return res; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FindDuplicates2 duplicate = new FindDuplicates2();
		System.out.print("enter array size : ");
		int arrsize = sc.nextInt();
		
		int[] arr = new int[arrsize];
		System.out.print("enter array elements : ");
		for(int i=0; i< arrsize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("duplicate numbers : "+duplicate.findDuplicate(arr));
		sc.close();
	}
}
