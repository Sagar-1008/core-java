class TvChannels{

	 private int id;
     private String name;
	 private String type;
	 private String language;
	 
	 public int getId(){
	   return id;
	 }
	 public void setId(int id) {
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
	 
	 public String getLanguage(){
	   return language;
	 }
	 public void setLanguage(String language) {
	   this.language = language;
	 }
	 
	 public void infoTv(){
		 
		 System.out.println("From tv we can watch movies, series, live news and live sports ");
	 }
	 
	 
}