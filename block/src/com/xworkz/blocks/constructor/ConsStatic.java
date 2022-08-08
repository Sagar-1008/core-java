package com.xworkz.blocks.constructor;
import java.util.Scanner;

public class ConsStatic {
         
	 int num = 100;

	 ConsStatic() {
		num = 200;
	}
	
	public static void main(String[] args) {
		
		ConsStatic con = new ConsStatic();
		con.num = 300;
		System.out.println(con.num);
		/*String name = "VijayaNagar";
		System.out.println("Enter city name");
	   Scanner sc = new Scanner(System.in);
	   String city = sc.nextLine().toLowerCase().trim();
	   String city1 = sc.nextLine().toLowerCase().trim();
	   
	   System.out.println("the city name is "+ city);
	   System.out.println("the city name is "+ city1);
	   System.out.println(city.equals(city1));
		*/
		
	/*	String str = new String("Abc");
		String str1 = str.toLowerCase();
		String str2 = str.toUpperCase();
		
		System.out.println(str == str1);
		System.out.println(str == str2);*/
	   
		
		
	}
	
	 
}
