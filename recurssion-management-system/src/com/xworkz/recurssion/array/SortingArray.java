package com.xworkz.recurssion.array;

import java.util.Scanner;

public class SortingArray {
        
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<size;i++) {
			 arr[i] = sc.nextInt();
		}
		System.out.println(sort(arr, 0));
		
	}
	
	public static boolean sort(int[] arr, int index) {
		
		if(index == arr.length-1) {
			return true;
		}
		
        return arr[index]<arr[index +1] && sort(arr, index+1);
	}
}
