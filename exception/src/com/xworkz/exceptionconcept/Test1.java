package com.xworkz.exceptionconcept;

public class Test1 {

	 public static void main(String[] args) {
		/*System.out.println(10/0);
		System.out.println("Namaskara");
		output-->
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		at com.xworkz.exceptionconcept.Test1.main(Test1.java:6)*/
		 
		/* throw new ArithmeticException("/ by zero explicitiley");
		 System.out.println("Namaskara");
		  In this time we will get compile time error i.e unreachable code 
		  we should not write any sop after throw*/
		 
		/* throw new Test();
		 * we will get error at runtime constructor must be subclass of throwable class*/
		 
	}
	
} 
