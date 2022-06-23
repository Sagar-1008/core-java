class Bus{

    String name;
    String colour;
    String type;
	
	public Bus(){
	 this("SRS Travels", "Yellow", "Multiaxle");
	System.out.println("The bus object is created");
	}
    
	public Bus(String name, String colour, String type){
	  	  
	  this.name = name;
	  this.colour = colour;
	  this.type = type;
	
	}
	public static void main(String a[]) {
	
	  Bus bus = new Bus();
	  System.out.println("the Name of the Travels "+bus.name+" The Colour of the bus is "+bus.colour+ " The bus type is  "+ bus.type);
	}
	
}