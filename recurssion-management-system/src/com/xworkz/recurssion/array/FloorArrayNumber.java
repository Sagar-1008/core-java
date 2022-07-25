package com.xworkz.recurssion.array;

public class FloorArrayNumber {
	public static void main(String[] args) {

		int[] arr = { 2, 6, 18, 26, 48, 61 };
		// int floor = floorNumber(arr, , 0, arr.length-1);

		// System.out.println("the floor value is "+floor);
		System.out.println("the ceiling value is " + ceileNumber(arr, 48, 0, arr.length-1 ));
	}

	public static int floorNumber(int[] arr, int target, int start, int end) {

		while (start <= end) {
			int mid = (start + end) / 2;

			if (target < arr[mid]) {
				end = mid - 1;

			} else if (target > arr[mid]) {
				
				start = mid + 1;
			} else {
				return arr[mid];
			}
		}

		return arr[end];
	}

	public static int ceileNumber(int[] arr, int target, int start, int end) {
		int number = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target <= arr[mid]) {
				number = arr[mid];
				end = mid - 1;
			}
			else if (target == arr[mid]) {
				return arr[mid];

			}   else {
				start = mid + 1;
			}
		}
		if(target >= arr[arr.length-1]) {
			return arr[0];
		}
		return number;
	}

}
