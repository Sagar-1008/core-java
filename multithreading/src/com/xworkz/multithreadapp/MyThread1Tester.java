package com.xworkz.multithreadapp;

public class MyThread1Tester {
         public static void main(String[] args) throws InterruptedException {
			Mythread1 t = new Mythread1();
			t.start();
			t.join();
			t.start();
			for (int i = 0; i < 10; i++) {
				System.out.println("Inside parent thread");
				
			}
		}
}
