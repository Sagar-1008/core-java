class TransportTester{


    public static void main(String a[]){
	
	 Bus bus = new Bus();
	 bus.price = 800000;
	 bus.type = "RoadWays";
	 bus.noOfPassenger = 60;
     bus.color = "yellow";	
    
      System.out.println("the price of the bus "+ bus.price+" the type is  "+bus.type+" the no of passenger are "+bus.noOfPassenger + " the color is "+bus.color);	
	
      bus.usesOfTransports();
	
	
	
	}



}