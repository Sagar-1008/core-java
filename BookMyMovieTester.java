class BookMyMovieTester{

   public static void main(String a[])
   {
      String movies[] = {"Om", "A", "upendra", "Yajamana", "Gaalipata", "Paramatma", "Rakta Kanneru"};
	  String snacks[] = {"Kurukure", "Colddrinks","Bisuuts","PopCorn","SweetCorn"};
      BookMyMovie bookMyMovie = new BookMyMovie("Prasanna", 250, movies, 100,20, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie.theaterName);
	  bookMyMovie.showTime(15, "gagan", "Om");
	  bookMyMovie.buySnacks("Colddrinks", 60);
	  System.out.println("-----------------------------------------------------------");
	  
	  BookMyMovie bookMyMovie1 = new BookMyMovie("Veeresh", 300, movies, 150,25, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie1.theaterName);
	  bookMyMovie.showTime(7, "devraj", "Paramatma");
	  bookMyMovie.buySnacks("PopCorn", 20);
	  System.out.println("==========================================================");
	  
	  BookMyMovie bookMyMovie2 = new BookMyMovie("PVR", 350, movies, 200,45, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie2.theaterName);
	  bookMyMovie.showTime(6, "Devi", "Gaalipata");
	  bookMyMovie.buySnacks("SweetCorn", 7);
	  
	  
	  
   
   
   }



}