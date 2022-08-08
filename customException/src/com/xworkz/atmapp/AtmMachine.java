package com.xworkz.atmapp;

public class AtmMachine {

	public void withdrawnAmount(double amt) throws AtmException {
		System.out.println("inside withdrawAmount()");
		double balance = 25000;
		if(amt>=40000 ) {
			throw new AtmException("The amount is exceded limit");
		}else if(amt%100 != 0){
			throw new AtmException("Enter the amount in multiple of 100");
		}
		else if(amt >balance){
			throw new AtmException("Insuffeicient balance");
		}
		else {
			System.out.println("Withdraw is successfull");
		}
		System.out.println("withdrawnAmount() ended");
	}

}
