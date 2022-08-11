package com.xworkz.recurssion.pattern;

import java.util.Arrays;

public class Triangle {
	public static void main(String[] args) {
	//	triangle(4, 0);
		int arr[] = {58, 42, 27, 65, 51};
	//	bubbleSort(arr, arr.length-1, 0);
		
		selectionSort(arr, arr.length, 0, 0);
		System.out.println(Arrays.toString(arr));
	}

	public static void triangle(int row, int column) {

		if(row == 0) {
			return ;
		}
		if(column < row) {
			System.out.print("*");
			triangle(row, column+1);
		}
		else {
			System.out.println();
			triangle(row-1, 0);
		}
	}
	
	public static void bubbleSort(int[] arr,  int row, int column) {

		if(row == 0) {
			return ;
		}
		if(column < row) {
			if(arr[column]<arr[column+1]) {
				int temp = arr[column+1];
				arr[column+1] = arr[column];
				arr[column]=temp;
			}
			bubbleSort(arr, row, column+1);
		}
		else {
			
			bubbleSort(arr, row-1, 0);
		}

	}
	
	public static void selectionSort(int[] arr,  int row, int column, int max) {

		if(row == 0) {
			return ;
		}
		if(column < row) {
			if(arr[column]>arr[max]) {
				
				selectionSort(arr, row, column+1, column);
			}else {
				selectionSort(arr, row, column+1, max);
			}
			
		}
		else {
			int temp = arr[max];
			arr[max] = arr[row-1];
			arr[row-1]=temp;
			
			selectionSort(arr, row-1, 0, 0);
		}

	}
	
	
}
