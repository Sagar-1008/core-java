package com.xworkz.blocks;

public class BlockTester {
      
	
	static {
		
		System.out.println("The static block is created for BlockTester");
		/*Block bt = new Block(10);
		System.out.println(bt.blockInit);*/
		{
			System.out.println("inside block");
		}
	}


	{
		System.out.println("the block is craeted");
		//blockInit = 10;
		
	}
	
	{
		System.out.println("second instance block is created");
	}
	
	public static void main(String[] args) {
		System.out.println("the main method is started");
		Block bt = new Block(20);
		System.out.println(bt.blockInit);
		
		System.out.println("the main method is ended");
	}
	
}
