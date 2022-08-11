package com.xworkz.assignment;

import java.util.Scanner;

public class WordsArray {
          
	  public static void main(String[] args) {
		  System.out.println("Enter the words");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.nextLine();
		 // String str = "Welcome to the Bengaluru";
		words(str);
		sc.close();
	}
	  
	  public static void words(String str) {
		   String[] words = str.split(" ");
		  for (String newStr : words) {
			System.out.println(newStr);
		}
		     
	  }
}
