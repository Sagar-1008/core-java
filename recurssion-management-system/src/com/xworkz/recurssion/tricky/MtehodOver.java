package com.xworkz.recurssion.tricky;

public class MtehodOver {
     
	public void method1(long i) {
		System.out.println("long");
	}
	
	public void method1(int i){
		System.out.println("int");
	}
	
	public void method1(byte i){
		System.out.println("byte");
	}
	
	public void method1(short i){
		System.out.println("short");
	}
	
	
	public static void main(String[] args) {
		MtehodOver check = new MtehodOver();
		check.method1(10L);
	}
	
	
}
