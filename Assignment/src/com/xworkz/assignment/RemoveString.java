package com.xworkz.assignment;

import java.util.Scanner;

public class RemoveString {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(removeChar(str));
		sc.close();
	}

	public static String removeChar(String str) {

		str = str.substring(1, str.length()-1);

		return str;
	}

}
