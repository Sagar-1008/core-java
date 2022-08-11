package com.xworkz.assignment;

import java.util.ArrayList;
import java.util.List;


public class SumNumbers {
	public static void main(String[] args) {
		System.out.println(sumNumbers());
	}
	
	public static int sumNumbers() {
		
		List al = new ArrayList();
		al.add(1);
		al.add("35");
		al.add(4);
		al.add("135");
		System.out.println("The array is : "+ al);
		int sum = 0;
		for(int i=0; i<al.size();i++) {
			sum += Integer.parseInt(al.get(i).toString());
		}
		return sum;
	} 
}

	


