package com.xworkz.pubapp;

public class Bounce {
       
	public void check(int age) throws PubException {
		System.out.println("Inside Bounce()");
		if(age >=18) {
			System.out.println("go and Enjoyyyy");
		}else {
			
			throw new PubException("putta...... go read books") ;
			
		}
		System.out.println("Bounce() Ended");
	}
}
