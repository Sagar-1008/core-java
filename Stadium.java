class Stadium{

     private String name;
	 private String id;
	 private int noOfCapacity;
	 private String location;
	 private String type;
	 
	 public String getName(){
	   return name;
	 }
	 public void setName(String name) {
	   this.name = name;
	 }
	 
	 public String getId(){
	   return id;
	 }
	 public void setId(String id) {
	   this.id = id;
	 }
	 
	 public int getNoOfCapacity(){
	   return noOfCapacity;
	 }
	 public void setNoOfCapacity(int noOfCapacity) {
	   this.noOfCapacity = noOfCapacity;
	 }
	 
	 public String getLocation(){
	   return location;
	 }
	 public void setLocation(String location) {
	   this.location = location;
	 }
	 
	 public String getType(){
	   return type;
	 }
	 public void setType(String type) {
	   this.type = type;
	 }
	 
	 
	 public void usesOfStadium(){
		 
		 
		 System.out.println("The stadium is used to play the games");
	 }
	 



}