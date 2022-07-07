class IplTester{


     public static void main(String a[]){
		 
		 IplDTO ipl = new IplDTO();
		 ipl.setTeamName("RCB");
		 ipl.setTotalNoTeams(9);
		 ipl.setNoOfTrophies(0);
		 ipl.setOwner("UUnited Spirits");
		 ipl.setNoOfSeasons(12);
		 System.out.println(ipl.getTeamName()+" "+ipl.getTotalNoTeams()+" "+ipl.getNoOfTrophies()+" "+ ipl.getOwner() +" "+ipl.getNoOfSeasons());
		
		 
	 }


}