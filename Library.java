
interface Library{
     
	 boolean createBook(BooksDTO book);
	 void getBookDetails();
	 boolean updatePublicationByName(String name, String publication);
	 boolean deleteByName(String name);
	 boolean deleteByAuthor(String author);
	 String getBookNameById(int id);
	 String[] getAllBooksName();
	  




}