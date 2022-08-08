package com.xworkz.multithreadapp;

public class SyncrhonisedThread extends Thread {
      Display d;
      String name;
	public SyncrhonisedThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	  @Override 
      public void run() {
		// TODO Auto-generated method stub
           d.wish(name);
	}
}
