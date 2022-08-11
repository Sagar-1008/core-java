package com.xworkz.assignment;

import java.util.Scanner;

public class Spaces {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll(" ", "");
		System.out.println(str);
		sc.close();
	} 
}
