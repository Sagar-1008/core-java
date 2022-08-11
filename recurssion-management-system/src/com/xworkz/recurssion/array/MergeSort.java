package com.xworkz.recurssion.array;

import java.util.Arrays;

public class MergeSort {
      public static void main(String[] args) {
		int[] arr= {45, 28, 63, 58, 95};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}
      
      public static int[] mergeSort(int[] arr) {
    	  if(arr.length == 1) {
    		  return arr;
    	  }
    	  
    	  int mid = (arr.length)/2 ;
    	  int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    	  int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    			  
    		return merge(first, second);	 
      }
      
      public static int[] merge(int[] first, int[] second) {
    	  int i=0;
    	  int j=0;
    	  int m=0;
    	  
    	  int[] mixArr = new int[first.length+second.length];
    	  
    	  
    	  while( i<first.length && j<second.length) {
    		  if(first[i] < second[j]) {
    			  mixArr[m++]=first[i++];
    		  }
    		  else {
    			  mixArr[m++]=second[j++];
    		  }
    	  }
    	  
    	  while(i<first.length) {
    		  mixArr[m++] = first[i++];
    	  }
    	  
    	  while(j<second.length) {
    		  mixArr[m++]=second[j++];
    	  }
    	  
    	  return mixArr;
      }
      
}
