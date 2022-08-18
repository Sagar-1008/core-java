package com.xworkz.typeapp;

public class Downcast {

	//	@Override  
	//    public void m1() {
	//    	 System.out.println("Inside Child m1()");
	//    }



	public static void m2() {
		System.out.println("Inside child static m2()");
	}

	public Downcast() {
		System.out.println(getClass().getSimpleName() + " class called");
	}
}
