package com.xworkz.assignment;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println( sumNAtural(num));
		sc.close();
             
	}
	
	public static int sumNAtural(int num) {
		int sum = 0 ;
		if(num <=0) {
			return 0;
		}else {
			for (int i = 1; i <=num; i++) {
				sum = sum+i;
			}
		}
		return sum;	
	}

}
