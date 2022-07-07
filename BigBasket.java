public class BigBasket{

	 private String id;
     private String owner;
	 private String originPlace;
	 private String type;
	
	 
	 public String getId(){
	   return id;
	 }
	 public void setId(String id) {
	   this.id = id;
	 }
	 
	 public String getOwner(){
	   return owner;
	 }
	 public void setOwner(String owner) {
	   this.owner = owner;
	 }
	 
	 
	 public String getOriginPlace(){
	   return originPlace;
	 }
	 public void setOriginPlace(String originPlace) {
	   this.originPlace = originPlace;
	 }
	 
	 public String getType(){
	   return type;
	 }
	 public void setType(String type) {
	   this.type = type;
	 }
	 
	 public void useOfBigBasket(){
		 
		 System.out.println("online supermarket for daily needs ");
	 }
	 
	 
}