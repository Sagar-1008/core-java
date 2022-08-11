package com.xworkz.multithreadapp;

public class Display {
	public synchronized void wish(String name) {
	
				for(int i=1; i<7;i++) {
					System.out.print(name);
				}

	}

}
