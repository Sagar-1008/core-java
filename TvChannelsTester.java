class TvChannelsTester{


     public static void main(String a[]){
		 
		 TvChannelsDTO tv = new TvChannelsDTO();
		 tv.setName("Star Sports");
		 tv.setId(589);
		 tv.setType("Sports");
		 tv.setLanguage("Kannada");
		 System.out.println("The name of the TvChannel is "+tv.getName()+"\nid is "+tv.getId()+"\ntype is  "+ tv.getType() +"\nThe languege of the tvChannel is "+tv.getLanguage());
		 tv.infoTv();
		 
	 }


}