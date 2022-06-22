class BookMyMovieTester{

   public static void main(String a[])
   {
      String movies[] = {"Om", "A", "upendra", "Yajamana", "Gaalipata", "Paramatma", "Rakta Kanneru"};
	  String snacks[] = {"Kurukure", "Colddrinks","Bisuuts","PopCorn","SweetCorn"};
      BookMyMovie bookMyMovie = new BookMyMovie("Prasanna", 250, movies, 100, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie.theaterName);
	  bookMyMovie.showTime(15, "gagan", "Om");
	  bookMyMovie.buySnacks("Colddrinks", 60);
	  System.out.println("-----------------------------------------------------------");
	  
	  BookMyMovie bookMyMovie1 = new BookMyMovie("Veeresh", 300, movies, 150, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie1.theaterName);
	  bookMyMovie1.showTime(7, "devraj", "Paramatma");
	  bookMyMovie1.buySnacks("PopCorn", 20);
	  System.out.println("==========================================================");
	  
	  BookMyMovie bookMyMovie2 = new BookMyMovie("PVR", 350, movies, 200, snacks);
	  System.out.println("The name of the theater is "+ bookMyMovie2.theaterName);
	  bookMyMovie2.showTime(6, "Devi", "Gaalipata");
	  bookMyMovie2.buySnacks("SweetCorn", 7);
	  
	  
	  
   
   
   }



}