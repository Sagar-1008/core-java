package com.xworkz.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string");
		String str1 = sc.next();
		System.out.println("Enter the first string");
		String str2 = sc.next();
		System.out.println(sortedString(str1, str2));
		sc.close();

	}

	public static String sortedString(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		sb.append(s1).append(s2);

		String conString = sb.toString();
		String str = "";

		for (int i = 0; i < conString.length(); i++) {
			if (!str.contains(String.valueOf(conString.charAt(i)))) {
				str += conString.charAt(i);
			}
		}
		char[] ch = str.toCharArray();
		Arrays.sort(ch);


		return String.valueOf(ch);

	}
}
