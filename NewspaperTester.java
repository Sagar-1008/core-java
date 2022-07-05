class NewspaperTester{


     public static void main(String a[]){
		 
		 Newspaper news = new Newspaper();
		 news.setName("Udayavani");
		 news.setId("589agfrst");
		 news.setPrice(3.50);
		 news.setType("Daily");
		 news.setLanguage("Kannada");
		 System.out.println("The name of the newspaper is "+news.getName()+"\nThe id is "+news.getId()+" \nThe price of the newspaper is "+news.getPrice()+" "+ news.getType() +"\nThe languege of the newspaper "+news.getLanguage());
		 news.infoNewspaper();
		 
	 }


}