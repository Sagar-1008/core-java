package com.xworkz.multithreadapp;

public class Multithraed1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5 ; i++)
		System.out.println("Child Thread no parameters");

	}
	
	
	public void run(int num) {
		System.out.println("parameters run method");
	}

}