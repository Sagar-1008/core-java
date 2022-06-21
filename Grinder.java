class Grinder
{
   static String name = "Bosch";
   static String color = "Black";
   static String material = "Plastic"; 
   static int price = 6899;
   static String modelName = "True Mix";
   static boolean isTurned ;
   static int maxSpeed = 5;
   static int minSpeed;
   static int currentSpeed;

   public static void main(String a[])
   {
    System.out.println("The brand name of the grinder "+ name);
	System.out.println("The Color of the Grinder "+ color);
	System.out.println("The Type of material of the grinder "+ material);
	System.out.println("The price of the grinder "+ price);
	System.out.println("The Model name of the Grinder "+ modelName);
    onOrOff();
	increseSpeed();
	increseSpeed();
	increseSpeed();
	increseSpeed();
	increseSpeed();
	increseSpeed();
	increseSpeed();
	onOrOff();
	decreaseSpeed();
	decreaseSpeed();
	onOrOff();
	decreaseSpeed();
	decreaseSpeed();
	decreaseSpeed();
	decreaseSpeed();
    onOrOff();
System.out.println("The main method is ended");	
   }
   

    public static void onOrOff()
  	{
	  System.out.println("The invoking the onOroff() ");
	  if(isTurned == false)
      {
	    isTurned = true;
		System.out.println("The Grinder is turned on ");
	
	  }	
	  
	  else if(isTurned == true)
	  {
	  isTurned = false;
      System.out.println("The grinder is turned off");	  
	  }
	} 
	
	static void increseSpeed()
	{
		System.out.println("The increseSpeed method is started");
		if(isTurned == true)
		{
			System.out.println("The Grinder is Turned on");
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed +1;
				System.out.println("The current speed of the grinder is "+ currentSpeed);
			}
			else{
				System.out.println("The Grinder reaches the maximum Speed");
			}
		}
		else{
			System.out.println("The Grinder is off");
		}
	}
	
	static void decreaseSpeed()
	{
		System.out.println("The decreaseSpeed method is started");
		if(isTurned == true){
			System.out.println("The Grinder is turned on ");
			if(currentSpeed > minSpeed)
			{
				currentSpeed = currentSpeed - 1;
				System.out.println("The current speed of the Grinder is "+ currentSpeed);
			}
			else{
				System.out.println("The The speed of the grinder reached minimum speed ");
			}
		}
		else {
			System.out.println("The Grinder is off");
		}
	}
 
 
 
 
}