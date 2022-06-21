class Hotstar
{
   static String kannadaMovies[] = {"James", "KGF", "Yuvarathna", "Love Mocktail", "Madagaja", "Ugram", "Kottigobba", "Dia", "Kuruksetra", "Rathavara", "Pailwan", "Mungarumale", "Gultoo", "The villian", "Ayogya"};
   static String hindiMovies[] = {"Prithiviraj", "Runway 34", "Dhaakad", "Heropanti", "Bachapan Pandey", "Jersey", "anthim", "Gangabul", "Tadap", "Radhe Shyam", "Jhund", "The phuspa", "Sooryavanshi", "Attack", "Raazi", "Uri"};
   static String hollywoodMovies[] = {"The Lost city", "Spider Man-No way home", "The Exorcist", "Uncharted", "Dune", "Morbius", "The Batman", "ambulance", "No time to Die", "Inception", "Tenet", "Death on the Nile", "La La Land", "Bloodshot", "Fantastic Four"};   
   static String teluguMovies[] = {"RRR", "Acharya", "Ala Vaikuntapuaramulo", "Bangarraju", "Bheemla Nayak", "Bhemla Nayak", "Seetimar", "Most Eligible Bachelor", "Khiladi", "Rangastalam", "Republic", "Rang de", "Love Story", "Hit", "Jersey", "Mahanati", "Uppena", "Akhanda"};
   static String tamilMovies[] = {"Beast", "Veeramae vagai soodum", "Master", "FIR", "Valimai", "Bigil", "Maaran", "Hey Sinamika", "Maanaadu", "Jai Bhim", "sultan", "Doctor", "Mahhan", "Karnana", "Theal", "Kaithi", "16 Extreames", "Mersal"};
   
   public static void main(String a[])
   {
	   getKannadaMovies();
	   getHindiMovies();
	   getTeluguMovies();
	   getTamilMovies();
	   getHollywoodMovies();
   }
   
   public static void getKannadaMovies(){
       System.out.println("The list of Kannada movies available in the hotstar ");
	   System.out.println("---------------------------------------------------- ");
	   
	   for( int i=0 ; i<kannadaMovies.length ; i++)
	   {
	      System.out.println(kannadaMovies[i]);
	   
	   }
   }
   
   public static void getHindiMovies(){
       System.out.println(" The list of Hindi movies available in the hotstar ");
	   System.out.println("-------------------------------------------------- ");
	   
	   for(int i=0 ; i<hindiMovies.length ; i++)
	   {
		   System.out.println(hindiMovies[i]);
		   
	   }
   }
   public static void getHollywoodMovies()
   {
       System.out.println("The list of hollywood movies available in the Hotstar");
	   System.out.println("----------------------------------------------------- ");
	   
	   for(int i=0 ; i<hollywoodMovies.length; i++)
	   {
		   
		   System.out.println(hollywoodMovies[i]);
		   
	   }
   }
   public static void getTeluguMovies(){
	   
	   System.out.println("The list of telugu movies available in the hotstar");
	   System.out.println("----------------------------------------------------");
	   
	   for(int i=0 ; i<teluguMovies.length ; i++)
	   {
		   System.out.println(teluguMovies[i]);  
	   }
   }
   public static void getTamilMovies()
   {
	   System.out.println("The list of tamil movies available in the hotstar");
	   System.out.println("-------------------------------------------------");
	   
	   for(int i=0; i<tamilMovies.length ; i++)
	   {
		   
		   System.out.println(tamilMovies[i]);
		   
	   }
	   
	   
   }



}