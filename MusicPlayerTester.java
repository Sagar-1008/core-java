class MusicPlayerTester{

     public static void main(String a[]){
		 
		 MusicPlayerDTO music = new MusicPlayerDTO();
		 music.setName("Wynk Music");
		 music.setId("124hj");
		 music.setType("audio player");
		 music.setSubcription(299);
		 System.out.println(music.getName()+" "+music.getId()+" "+ music.getType() +" "+music.getSubcription());
		 music.useMusicPlayer();
		 
	 }


}