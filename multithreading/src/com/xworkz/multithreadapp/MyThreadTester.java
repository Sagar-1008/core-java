package com.xworkz.multithreadapp;

public class MyThreadTester {
	public static void main(String[] args) {
		   
 	   System.out.println("main Thread priority is "+Thread.currentThread().getPriority());
 	   MyThread mt = new MyThread();
 	   mt.start();
 	   System.out.println("child thread priority is "+MyThread.currentThread().getPriority());
	}
}
