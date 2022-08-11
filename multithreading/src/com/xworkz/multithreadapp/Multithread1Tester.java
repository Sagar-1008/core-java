package com.xworkz.multithreadapp;

public class Multithread1Tester {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Multithraed1 mul = new Multithraed1();
		mul.start();
		//mul.run(2);
		for (int i = 0; i < 5; i++) {
			System.out.println("main Thread");
		}
		

	}
}
