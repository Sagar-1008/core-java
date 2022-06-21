class Factorial1
{
public static void main(String a[])
{
  int factValue = fact(5)/fact(5-3) ;
  System.out.println(factValue);
}

public static int fact(int factNum)
{  
    int f = 1 ;
   for(int i=1; i <= factNum ; i++){
       f = f * i ;
   }
   return f;
}
}