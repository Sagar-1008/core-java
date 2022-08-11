package com.xworkz.exceptionconcept;

public class ClassLoader {
	public static void main(String[] args) {

		System.out.println("Inside the main method");
		try {
			m1();
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Please Enter the number correctly");
		}
		System.out.println("main() Ended");
	}

	static void m1() throws ArithmeticException {
		System.out.println("m1() started");
		m2();
		System.out.println("m1() ended");
	}

	static void m2() throws ArithmeticException {
		System.out.println("m2() started"); 
		m3();
		System.out.println("m2() ended");
	}
	static void m3() throws ArithmeticException {
		System.out.println("m3() started");
		System.out.println(10/0);
		System.out.println("m3() ended");
	}

}
// throws keyword will helps to specify the exception (if the method will not to handle specify the exception)
// Exception propogation (stack widening) done by throws keyword 