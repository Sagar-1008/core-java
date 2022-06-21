class MoviesHub {
	
	
static String movies[] = {"Charlie 777", "Vikram", "Bhool bhulayaa 2", "KGF 2", "Avatar purush", "Prathviraj"};
static String movieName;
public static void main(String a[])
{
 getMovie("KGF 2");
 System.out.println("Come.... Watch movie "+ movieName);
}

public static String getMovie(String movie)
{
  
  for(int i=0; i< movies.length;i++)
  {
      if(movies[i] == movie){
		  movieName = movies[i];
	  }
  }
  return movieName;
}
}