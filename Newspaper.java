class Newspaper{

	 private String id;
     private String name;
	 private double price;
	 private String type;
	 private String language;
	 
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
	 
	 
	 public double getPrice(){
	   return price;
	 }
	 public void setPrice(double price) {
	   this.price = price;
	 }
	 
	 public String getType(){
	   return type;
	 }
	 public void setType(String type) {
	   this.type = type;
	 }
	 
	 public String getLanguage(){
	   return language;
	 }
	 public void setLanguage(String language) {
	   this.language = language;
	 }
	 
	 public void infoNewspaper(){
		 
		 System.out.println("It gives daily information about politics, sports. ");
	 }
	 
	 
}