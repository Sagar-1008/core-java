package com.xworkz.recurssion.string;

public class StrBuilder {
       public static void main(String[] args) {
		
    	  /* String b = "babi";
    	   b += " Raashi khanna"; //Multiple objects are created in the memory
    	   
    	   StringBuilder builder = new StringBuilder("babi");
    	   builder.append("Raashi Khanna"); // in one object only it is stored multiple objects will not stored
    	   /* Strings are immutable whereas the StringBuilder and StringBuffer are mutable
    	    * immutability means the content of the string cannot be change in the objcet it creates the separate 
    	    * object*/
     	 /*  System.out.println(b);
    	   System.out.println(builder);
    	   b.charAt(2);*/
    	   
    	   String str = "abcdef";
    	   char[] str1 = str.toCharArray();
    	   for(int i=str1.length-1; i>=0; i--) {
    		   System.out.print(str1[i]);
    	   }
	}
       
}
