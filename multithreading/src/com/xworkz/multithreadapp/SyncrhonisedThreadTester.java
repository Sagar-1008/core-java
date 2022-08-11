package com.xworkz.multithreadapp;

public class SyncrhonisedThreadTester {
         public static void main(String[] args) {
			Display d1 = new Display(); 
		
			//Display d2 = new Display(); 
			/*if two objects are created (the synchronized method class object) the irregular output we will gett. it creates lock for separate objects
			 * if the method is static synchronized we will get regular output because it static creates static level lock
			 * for static - class level lock  instance -object level lock
			*/
			SyncrhonisedThread t1 = new SyncrhonisedThread(d1, " dhoni ");
			SyncrhonisedThread t2 = new SyncrhonisedThread(d1, " ViratKohli ");
			t1.setPriority(3);
			t2.setPriority(10);
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			t1.start();
			t2.start();
			
	
		}
         
}
 