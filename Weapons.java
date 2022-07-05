class Weapons{

	 private String id;
     private String name;
	 private String type;
	 private int price;
	 private int noOfBullets;
	 
	 public String getId(){
	   return id;
	 }
	 public void setId(String id) {
	   this.id = id;
	 }
	 
	 public String getName(){
	   return name;
	 }
	 public void setName(String name) {
	   this.name = name;
	 }
	 
	 public String getType(){
	   return type;
	 }
	 public void setType(String type) {
	   this.type = type;
	 }
	 
	 public int getPrice(){
	   return price;
	 }
	 public void setPrice(int price) {
	   this.price = price;
	 }
	 
	 public int getNoOfBullets(){
	   return noOfBullets;
	 }
	 public void setNoOfBullets(int noOfBullets) {
	   this.noOfBullets = noOfBullets;
	 }
	 
	 
	 public void useOfWeapon(){
		 
		 System.out.println("For Security purpose the weapons are used");
	 }
	 
	 
	 
}