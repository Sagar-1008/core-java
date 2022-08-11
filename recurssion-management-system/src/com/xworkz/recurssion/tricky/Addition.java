package com.xworkz.recurssion.tricky;

public class Addition {
      
	public static void main(String[] args) {
		System.out.println(getAdd(8,5));
		System.out.println(getSub(8, 5));
	}
	
	public static int getAdd(int num1, int nuum2) {
		
		int c = num1 - (-nuum2);
		return c;
	}
	
	public static int getSub(int num1, int num2) {
		int c =  num1 +(~num2+1);
		
		return c;
	}
} 
