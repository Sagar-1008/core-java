class Npr{
       static int b;
	   public static void main(String a[]){
	   
	   int value = permutation(5, 3);
	   System.out.println(value);
	       
	   }
	   
	   public static int permutation(int n, int r){
	     int f = 1;
	     int a = 1;
		 
		 
		  for(int i=1; i <= n; i++){
		  
		  f = f * i;
		  }
		  
		  for(int i = 1; i <= r; i++){
		  
		  a = a *i;
		  
		  }
		  
		  b = f/a ;
		  
		  return b;
		  
		  
	   
	   }



}