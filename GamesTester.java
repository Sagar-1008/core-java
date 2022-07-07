class GamesTester{


     public static void main(String a[]){
		 
		 GamesDTO game = new GamesDTO();
		 game.setName("FootBall");
		 game.setId("Fdr5489");
		 game.setType("OutDoor");
		 game.setNoOfPlayer(12);
		 System.out.println(game.getName()+" "+game.getId()+" "+ game.getType() +" "+game.getNoOfPlayer());
		 
		 
	 }


}