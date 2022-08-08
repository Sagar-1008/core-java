package com.xworkz.exceptionconcept;

public class Finally {
      public static void main(String[] args) {
		
    	  try {
    		  System.out.println("Inside try Block");
    		  System.out.println("The try Block contains Risky code");
    		  try {
    			  System.out.println("Inside try");
    			  System.out.println(10/0);
			} catch (Exception e) {
				System.out.println("Inside catch");
			}
    		  finally {
				System.out.println("Inside finaly");
			}
    		  
    		  System.out.println("The try block is Ended");
    	  }catch(Exception e) {
    		  System.out.println("Inside catch block");
    		  System.out.println(50/0);
    	  }finally {
			System.out.println("Inside the finally block");
		}
    	  System.out.println("The main method is ended");
	}
}
