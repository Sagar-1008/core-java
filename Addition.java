class Addition
{

   public static void main(String a[])
   {
       System.out.println(add(98,59));
	   add(58, 85, 68);
   
   }

       public static int add(int a,int b)
	   {
	    return a+b;
	
	   }
	   
	   static void add(int a, int b, int c){
		   System.out.println(a+b+c);
	   }
}

// Method overloading - type parameter, number in the parameter are different