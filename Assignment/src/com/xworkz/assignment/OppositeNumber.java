package com.xworkz.assignment;

import java.util.Scanner;

public class OppositeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enterv the number");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         System.out.println("The opposite number is : "+ (~num+1));
         sc.close();
	}

}
