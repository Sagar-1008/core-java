class Laptop{

     private String name;
	 private double price;
	 private String ram;
	 private String color;
	 private String operatingSystem;
	 
	 public String getName(){
	    return name;
	 }
	 
	 public void setName(String name){
	    this.name = name;

	 }
	 
	 public double getPrice(){
	    return price;
	 }
	 
	 public void setPrice(double price){
	    this.price = price;
	 }
	 
	 public String getRam(){
	    return ram;
	 }
	 public void setRam(String ram) {
	    this.ram = ram;
	 }
	 
	 public String getColor(){
	    return color;
	 }
	 public void setColor(String color){
	     this.color = color;
	 }
	 
	 public String getOperatingSystem(){
	     return operatingSystem;
	 }
	 public void setOperatingSystem(String operatingSystem){
	     this.operatingSystem = operatingSystem;
	 }
	 
	 public void display(){
	    System.out.println("The laptop is used to watch and play the games");
	 }
	   



}