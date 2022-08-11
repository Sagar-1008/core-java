package com.xworkz.exceptionconcept;

public class Test3 extends RuntimeException{
        public static void main(String[] args) {
			throw new Test3();
		}
}
/* Output -->
 * we will get run time error
 * Exception in thread "main" com.xworkz.exceptionconcept.Test3
   at com.xworkz.exceptionconcept.Test3.main(Test3.java:5)*/