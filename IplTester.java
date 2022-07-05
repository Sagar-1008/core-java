class IplTester{


     public static void main(String a[]){
		 
		 Ipl ipl = new Ipl();
		 ipl.setTeamName("RCB");
		 ipl.setTotalNoTeams(9);
		 ipl.setNoOfTrophies(0);
		 ipl.setOwner("UUnited Spirits");
		 ipl.setNoOfSeasons(12);
		 System.out.println(ipl.getTeamName()+" "+ipl.getTotalNoTeams()+" "+ipl.getNoOfTrophies()+" "+ ipl.getOwner() +" "+ipl.getNoOfSeasons());
		 ipl.aboutIpl();
		 
	 }


}