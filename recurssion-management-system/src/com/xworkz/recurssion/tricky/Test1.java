package com.xworkz.recurssion.tricky;
public class Test1 {
	
      Test1 t = new Test1(10);
      
     // Test1 t1 = new Test1(9);
       
      Test1(int i){
    	  System.out.println("test1");
    	// Test  t3 = new Test(i);
       }
       
       public static void main(String[] args) {
    	 //  t.num = 68;
    	   
    	   System.out.println("main");
    	   Test1 t2 = new Test1(5);
	}
       
}
