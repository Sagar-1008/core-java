class MusicPlayer{

	 private String id;
     private String name;
	 private String type;
	 private int subcription;
	 
	 
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
	 
	 public int getSubcription(){
	   return subcription;
	 }
	 public void setSubcription(int subcription) {
	   this.subcription = subcription;
	 }
	 
	 
	 public void useMusicPlayer(){
		 
		 System.out.println("To listen the songs");
	 }
	 
	 
	 
}