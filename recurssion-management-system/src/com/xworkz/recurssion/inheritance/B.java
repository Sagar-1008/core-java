package com.xworkz.recurssion.inheritance;

public class B extends A {
        
	B(){
		System.out.println("Inside child");
		System.out.println(this.hashCode()+ "  "+ this.getClass().getSimpleName());
		System.out.println(this.hashCode()+ "  "+ super.hashCode());
		System.out.println("child is ended");
	}
}
