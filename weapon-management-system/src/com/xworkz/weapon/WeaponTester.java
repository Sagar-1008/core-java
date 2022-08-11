package com.xworkz.weapon;

import java.util.Scanner;

import com.xworkz.weapon.dto.BulletDTO;

public class WeaponTester {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id =sc.nextInt();
		System.out.println("Enter the name of the weapon");
		String gunName=sc.next();
		System.out.println("Enter the no of bullets");
		int noOfBullets = sc.nextInt();
		System.out.println("Enter the type of the weapon");
		String type=sc.next();

		BulletDTO bullet = new BulletDTO();
		bullet.setId(id);
		bullet.setGunName(gunName);
		bullet.setNoOfBullets(noOfBullets);
		bullet.setType(type);

		System.out.println(bullet);
	}
}
