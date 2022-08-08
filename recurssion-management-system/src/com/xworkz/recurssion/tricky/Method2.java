package com.xworkz.recurssion.tricky;

public class Method2 extends Method1{
	
	
	public Method2() {
		System.out.println("inside method2");
	}

	@Override
	public void display() {
		
		System.out.println("inchild method2 display");
	}
	
	@Override
	public void show() {
		System.out.println("in child method2 show");
	}
	
	public void m() {
		System.out.println("inside m()");
	}

}
