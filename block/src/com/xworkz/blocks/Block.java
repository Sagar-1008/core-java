package com.xworkz.blocks;

public class Block {
	int blockInit;
	public Block(int blockInit) {
		 System.out.println(this.getClass().getSimpleName()+ "Object is created");
		 this.blockInit=blockInit;
	}
	static{
		System.out.println("the Block is created for block");
	}
	
	
	{
		System.out.println("The block2 is created");
	}
	
	{
		System.out.println("The bloxk3 is created");
	}
}
