class Factorial
{
  public static void main(String a[])
  {
    fact(4,1);
    
  }

  public static void fact(int a,int b)
  {
   System.out.println("The factorial of the number "+ a);

   for(int i=1;i<=a;i++)
   {
     b=b*i;
   }
  System.out.println(b);
  }
 
} 