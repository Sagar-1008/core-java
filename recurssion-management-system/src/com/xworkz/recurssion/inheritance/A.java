package com.xworkz.recurssion.inheritance;

public class A {
          
	
	A() {
		System.out.println("Inside parent");
		System.out.println(super.hashCode()+" "+super.getClass().getSimpleName());
		System.out.println("ended parent");
	}
} 
