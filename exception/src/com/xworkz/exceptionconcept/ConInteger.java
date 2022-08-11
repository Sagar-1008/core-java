package com.xworkz.exceptionconcept;

public class ConInteger {

	public static void main(String[] args) {

		System.out.println("Inside the main method");
		String i = "112";
		int i1 = 0;
		try{
			i1 = Integer.parseInt(i);
			int y= 10/0 ;

		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("The format mismatch");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("New i value is "+ i1); 
		System.out.println("Ended main method");
	}
} 
