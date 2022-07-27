package com.xworkz.blocks;

public class WraperTester {
      
	public static void main(String[] args) {
		   
		Integer baba = 89;
		int baba1 = 89;
		
		int baba2 = baba.intValue();
		Integer baba3 = baba;
		
		System.out.println(baba == baba1);
		System.out.println(baba2 == baba);
		System.out.println(baba3 == baba);
		
		Integer baba5 = 89;
		Long baba6 = 89L;
		//System.out.println(baba5 == baba6);
		
		System.out.println(baba5 == baba6.intValue());
		
		int baba7 = 95;
		long baba8 = 95L ;
		System.out.println(baba7 == baba8);
		
	}
}
