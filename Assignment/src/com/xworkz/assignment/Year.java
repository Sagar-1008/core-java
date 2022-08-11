package com.xworkz.assignment;

import java.util.Scanner;

public class Year {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		System.out.println(century(year));
		sc.close();

	}

	public static int century(int year) {
		if(year <=0) {
			System.out.println("Invalid Year Format");
			return -1;
		}else if( (year%100) == 0 ) {

			return (year/100)  ;	
		}

		return (year/100)+1 ; 
	}

}
