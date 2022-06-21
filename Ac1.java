class Ac1
{
   static String name = "Lg";
   static double price = 85000;
   static String color = "white";
   static boolean isTurned ;
   static int maxTemp = 28;
   static int currentTemp;
   static int minTemp;
   
   public static void main(String a[])
   {
	   System.out.println("The main method is started");
   System.out.println("The brand name of the AC "+ name);
   System.out.println("The price of the Ac "+ price);
   System.out.println("The color of the AC "+ color);
   onOrOff();
   increaseTemp();
   decreaseTemp();
   increaseTemp();
   increaseTemp();
   increaseTemp();
   onOrOff();
   increaseTemp();
   onOrOff();
   decreaseTemp();
   decreaseTemp();
   increaseTemp();
   decreaseTemp();
   onOrOff();
   System.out.println("The main method is ended");
   
   }
   
   public static void onOrOff()
   {
      System.out.println("The invoking of onOroff() ");
	  if(isTurned == false)
	  {
	    isTurned = true;
		System.out.println(" The Ac is Turned ON");
		
	  }
	  
	  else if(isTurned == true)
	  {
	    isTurned = false;
		System.out.println(" The Ac is off");
	  }
   
   }
   
   public static void increaseTemp()
   {
	   System.out.println("The increaseTemp method started");
	   if(isTurned == true)
	   {
		   System.out.println("The AC is turned on");
		   if(currentTemp < maxTemp)
		   {
			   currentTemp = currentTemp + 1 ;
			   System.out.println("The the temperature is "+ currentTemp );
		   }
		   else{
			   System.out.println("The Ac temp reaches the maximum level");
		   }
	   
	   }
	   
	   else
	   {
		   System.out.println("The AC is off");
	   }
	   
   }
   
   public static void decreaseTemp(){
	   System.out.println("The decreaseTemp method is started ");
	   if(isTurned == true)
	   {
		   System.out.println("The Ac is turned on");
		  if(currentTemp > minTemp)
		  {
			  currentTemp = currentTemp - 1;
			  System.out.println("The Current temperature of the ac is "+ currentTemp);
		  }
		  else {
		  System.out.println("The Temperature of the ac reaches min level");
		  }
	   }
	   else{
		   
		   System.out.println("The AC is off ");
	   }
   	   
   }
      



}