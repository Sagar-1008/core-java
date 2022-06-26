class ElectronicDeviceTester{


     public static void main(String a[]){
	   
	   TubeLight tubeLight = new TubeLight(30,  "60watts", "LED", "White");
	   
	   System.out.println("The price of the tubelight is "+tubeLight.price+" Watt is "+tubeLight.watt+" type is "+tubeLight.type+ " color is "+tubeLight.color);
	    tubeLight.getLight();
	 
	 
	 }


}