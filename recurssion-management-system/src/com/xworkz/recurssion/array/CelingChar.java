//smallest of greater than the target  of the character and wrap the first letter of the array
package com.xworkz.recurssion.array;

public class CelingChar {
	
	public static void main(String[] args) {

		char[] arr = {'a', 'c', 'f', 'g', 'l', 's'};
		//char floor =  floorNumber(arr, 's', 0, arr.length-1);
		
		

		//System.out.println("the floor value is "+floor);
		System.out.println( "the ceilie value is "+ceileNumber(arr, 's', 0, arr.length-1));
	}

	public static char floorNumber(char[] arr,int  target, int start, int end) {

		while(start <= end) {
			int mid = (start+end)/2 ;

			if(target < arr[mid]) {
				end = mid -1 ;

			}
			else if(target >arr[mid]) {
				start = mid+1;
			}
			
		}
		
		
		return arr[end];
	}

	public static char ceileNumber(char[] arr,int  target, int start, int end) {

		while(start <= end) {
			int mid = (start+end)/2 ;

			if(target < arr[mid]) {
				end = mid -1 ;

			}
			else if(target >arr[mid]) {
				start = mid+1;
			}
		}
		
		if(target > arr[arr.length-1]) {
			return arr[0];
		}


		return arr[start];
	}


}
