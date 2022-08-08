package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		System.out.println("Enter the amount");
		Scanner sc = new Scanner(System.in);
		double amt = sc.nextDouble();
		AtmMachine atm = new AtmMachine();
		try{
			atm.withdrawnAmount(amt);
		}catch(AtmException e) {
			e.printStackTrace();
		}finally{
			sc.close();
		}


		System.out.println("main() ended");

	}

}


