package com.xworkz.exceptionconcept;

public class Test {
        
	/* static ArithmeticException e = new ArithmeticException();
	
	public static void main(String[] args) {
		throw e;
	}
	  the runtime exception --> Arithmetic Exception
	*/ 
	
	static ArithmeticException e;
	public static void main(String[] args) {
		
		throw e;
	}
	//In above case we will get NullPoint Exception
}
