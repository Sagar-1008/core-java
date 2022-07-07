class NovelTester{


     public static void main(String a[]){
		 
		 NovelDTO novel = new NovelDTO();
		 novel.setName("Jugari Cross");
		 novel.setId("adcaf5865o");
		 novel.setPrice(216.00);
		 novel.setAuthor("PurnaChandra Tejaswi");
		 novel.setPublication("Pustaka Prakashana");
		 System.out.println("The name of the novel is "+novel.getName()+"\nThe id is "+novel.getId()+" \nThe price of the novell is "+novel.getPrice()+"\nThe author of the novel is "+ novel.getAuthor() +"\nThe novel is published by "+novel.getPublication());
		 novel.storyOfBook();
		 
	 }


}