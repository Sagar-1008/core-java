package com.xworkz.multithreadapp;

public class Multithraed1 extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread no parameters");

	}
	
	
	public void run(int num) {
		System.out.println("parameters run method");
	}

}
