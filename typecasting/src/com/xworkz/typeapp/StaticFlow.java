package com.xworkz.typeapp;

public class StaticFlow
{
	static int i = 10;

	static  TypeCasting t = new TypeCasting(10);
    StaticFlow s = new StaticFlow(25);
	Downcast downcast = new Downcast();

	static {
		m1();
		System.out.println(" first static block started");

		{
			System.out.println("A started");
			{
				System.out.println("B");
			}
			{
				System.out.println("C");
			}
			System.out.println("A Ended");
		}

		{
			System.out.println("D");
		}
		System.out.println(" first static block ended");

	}



	public StaticFlow(int j) {
		System.out.println("the value of j : "+ j); 
	//	TypeCasting t1 = new TypeCasting(j);
	}
	public static void main(String[] args) {
		System.out.println("Main() Started");
		m1();
		System.out.println(k);
		System.out.println("main() ended");
	}

	static void m1() {
		System.out.println(j);
	}

	static {
		System.out.println("Inside Second static block");
	}

	static int j = 20;
	static int k = 15;
}
