class Microwave
{
   static String name = "Croma";
   static int price = 8900;
   static String color = "Black";
   static String material = "Stainless Steel";
   static boolean isTurned ;
   static int maxTemp = 8;
   static int minTemp;
   static int currentTemp;
   
   public static void main(String a[])
   {
	  System.out.println("The brand name of the Microwave "+ name);
	  System.out.println("The Price of the microwave is "+ price);
	  System.out.println("The Colour of the microwave is "+ color);
	  System.out.println("The material of the microwave is "+ material);
	  
     onOrOff();
	 increaseTemperature();
	 increaseTemperature();
	 increaseTemperature();
	 increaseTemperature();
	 increaseTemperature();
	 increaseTemperature();
	 decreaseTemperature();
	 onOrOff();
	 increaseTemperature();
	 increaseTemperature();
	 onOrOff();
	 decreaseTemperature();
	 decreaseTemperature();
	 decreaseTemperature();
	 decreaseTemperature();
	 onOrOff();
   }
   
   public static void onOrOff()
   {
     System.out.println("invoking the onOroff()");
	 if(isTurned == false)
	 {
	   isTurned = true;
	   System.out.println("The microve is turned on ");
	   
	 }
	 
	 else if(isTurned == true)
	 {
	    isTurned = false;
		System.out.println("The microve is turned off");
	 }
   }
   
   static void increaseTemperature()
   {
	   System.out.println("The increaseTemperature method is started");
	   if(isTurned == true)
	   {
		   System.out.println("The Microwave is turned on ");
		   if(currentTemp < maxTemp)
		   {
			   currentTemp = currentTemp + 1;
			   System.out.println("The current temperature is : "+ currentTemp);
		   
		  }
		  else{
			  System.out.println(" The microwave temperature reached maximum level");
		  }
	   }
	   else{
		   System.out.println("The Microwave is off");
	   }
   }
   static void decreaseTemperature(){
	   System.out.println("The decreaseTemperature method is started ");
	   if( isTurned == true ){
		   System.out.println("The microve is turned onn ");
		   if(currentTemp > minTemp){
			   currentTemp = currentTemp - 1;
			   System.out.println("The current temperature ofb the microwave is "+ currentTemp);
		   }
		   else {
			   System.out.println("The microwave temperature reaches the minimum value");
		   }
	   }
	   else{
		   System.out.println("The microwave is off");
	   }
   }
   


}