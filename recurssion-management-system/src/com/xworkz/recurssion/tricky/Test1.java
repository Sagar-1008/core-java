package com.xworkz.recurssion.tricky;

public final class Test1 {

	Test1(int i){
		System.out.println("test1");
		Test  t3 = new Test(i);
	}

	Test t = new Test(10);

	//  Test1 t1 = new Test1(9);



	public static void main(String[] args) {
		// t.num = 68;

		System.out.println("main");
		Test1 t2 = new Test1(5);
	}
	

}

/*Access Modifiers- public, default, protected, private, static, abstract, synchronized, strictfp,  trancient, final
 * */

