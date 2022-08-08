package com.xworkz.exceptionconcept;

public class Test6 {
	public static void main(String[] args) {
          System.out.println("Inside main()");
		try {
			Class.forName("com.xworkz.exceptionconcept.ClassLoader");
			System.out.println("Inside Try");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Inside catch");
		}
		System.out.println("main() Ended");
	}
}
