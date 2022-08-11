package com.xworkz.recurssion.array;

public class FindArrayElement {
	public static void main(String[] args) {
        
		int[] arr = {24, 45, 63, 84, 56};
		System.out.println(find(arr, 56, 0));
	}
	
	public static boolean find(int[] arr, int target, int index) {
		
		if(index == arr.length) {
			return false;
		}
		
		return arr[index]==target || find(arr, target, index+1) ;
	}
	
}
