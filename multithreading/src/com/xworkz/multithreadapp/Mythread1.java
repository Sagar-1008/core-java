package com.xworkz.multithreadapp;

public class Mythread1 extends Thread {
        
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
