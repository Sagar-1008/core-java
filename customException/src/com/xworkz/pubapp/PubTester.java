package com.xworkz.pubapp;

import java.util.Scanner;

import com.xworkz.pubapp.pub.Pub;

public class PubTester extends Pub {
	public static void main(String[] args) {
		System.out.println("main() started");
	    PubTester pub = new PubTester();
	    pub.members = 78;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		Bounce bou = new Bounce();
		try {
			bou.check(age);
		}catch(PubException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		System.out.println("main() ended");

	}
}
