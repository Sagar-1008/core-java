class Ipl{

	 private String teamName;
     private int totalNoTeams;
	 private int noOfTrophies;
	 private String owner;
	 private int noOfseasons;
	 
	 public String getTeamName(){
	   return teamName;
	 }
	 public void setTeamName(String teamName) {
	   this.teamName = teamName;
	 }
	 
	 public int getTotalNoTeams(){
	   return totalNoTeams;
	 }
	 public void setTotalNoTeams(int totalNoTeams) {
	   this.totalNoTeams = totalNoTeams;
	 }
	 
	 
	 public int getNoOfTrophies(){
	   return noOfTrophies;
	 }
	 public void setNoOfTrophies(int noOfTrophies) {
	   this.noOfTrophies = noOfTrophies;
	 }
	 
	 public String getOwner(){
	   return owner;
	 }
	 public void setOwner(String owner) {
	   this.owner = owner;
	 }
	 
	 public int getNoOfSeasons(){
	   return noOfseasons;
	 }
	 public void setNoOfSeasons(int noOfseasons) {
	   this.noOfseasons = noOfseasons;
	 }
	 
	 public void aboutIpl(){
		 
		 System.out.println("The ipl is indian domicle cricket ");
	 }
	 
	 
}