package com.xworkz.exceptionconcept;

public class ExceptionTester {

	
	public static void main(String[] args) {
		System.out.println("The main method started");
		try {
			System.out.println("Inside try");
			String str = null;
			System.out.println(str.charAt(2)); 
			System.out.println("ended try block");
		}catch(Exception e) {
			System.out.println("inside catch");
			System.out.println("Cannot access the null object");
			System.out.println("ended catch");
		}
		
		try {
			
			 System.out.println("inside the array try");
			   int arr[] = new int[3];
			   arr[0] = 5;
			   arr[1] = 7;
			   arr[2] = 8;
			   arr[3] = 10;
			   
			   for (int i = 0; i < arr.length; i++) {
				   
				   System.out.println(arr[i]);
			}
			System.out.println("ended arr try");
		}catch(Exception e) {
			System.out.println("array index is more than the specified");
		}
		

		System.out.println("ended main()");
	}
	
}
//abnormal termination at run time by jvm 