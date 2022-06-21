class Theater{

    String name;
    String address;
    long contactNo;
    String ownerName;
    String runningMovies[] = new String[3];
	
	public Theater(){
		
		System.out.println("theater is created");
	}

   
   public static void main(String a[])
   {
	   
	  Theater theater = new Theater();
      theater.name = "Veeresh";
	  theater.address = "Magadi Road";
	  theater.contactNo = 8956214584L;
	  theater.ownerName = "Darshan";
	  theater.runningMovies[0] = "Charlie 777";
      theater.runningMovies[1] = "vikram";
	  theater.runningMovies[2] = "Jaurasic World";
	  
	  
	  System.out.println("The name of the theater is "+ theater.name);
	  System.out.println("The address of the theater is "+ theater.address);
	  System.out.println(" The contact number of the Theater is "+ theater.contactNo);
	  System.out.println("The owner name of the theater "+ theater.ownerName);
	  System.out.println("the Running movies are ");
	  theater.getRunningMovies();
	  
	  Theater theater1 = new Theater();
	  theater1.name = "Urvasi";
	  theater1.address = "Sudam Nagar";
	  theater1.contactNo = 589745856L;
	  theater1.ownerName = "Ravishankar KR";
	  theater1.runningMovies[0] = "Vikram";
	  theater1.runningMovies[1] = "charlie 777";
	  System.out.println("The Name of The Theater is "+ theater1.name);
	  System.out.println("The address of the Urvasi theater is "+ theater1.address);
	  System.out.println("The contact number of the theater "+ theater1.contactNo);
	  System.out.println("The Owner name of thew Urvasi Theater is "+ theater1.ownerName);
	  System.out.println("-------The running movies in the Urvasi Theater-----------");
	  theater1.getRunningMovies();
	  
	  
	  Theater theater2 = new Theater();
	  theater2.name = "Prasnna";
	  theater2.address = "Magadi Road";
	  theater2.contactNo = 9805894575L;
	  theater2.ownerName = "G Prasanna";
	  theater2.runningMovies[0] = "Vikram";
	  theater2.runningMovies[1] = "charlie 777";
	  theater2.runningMovies[3] = "Juarasic world";
	  System.out.println("The Name of the Theater is "+ theater2.name);
	  System.out.println("The Address of the prasanna theater is "+ theater2.address);
	  System.out.println("The contact number of the theater "+ theater2.contactNo);
	  System.out.println("The Owner name of the prasanna theater is "+ theater2.ownerName);
	  System.out.println("The Running movies in the prasanna========");
	  theater2.getRunningMovies();
	  
	  
	  
	  Theater theater3 = new Theater();
	  theater3.name = "Inox Mantri Square";
	  theater3.address = "Malleswaram";
	  theater3.contactNo = 8658657892L;
	  theater3.ownerName = "pavan jain";
	  theater3.runningMovies[0] = "Vikram";
	  theater3.runningMovies[3] = "Juarasic world";
	  theater3.runningMovies[1] = "charlie 777";
	  System.out.println("The Name of the Theater is "+ theater3.name);
	  System.out.println("The Address of the Inox Mantri square theater is "+ theater2.address);
	  System.out.println("The contact number of the theater "+ theater2.contactNo);
	  System.out.println("The Owner name of the Inox theater is "+ theater2.ownerName);
	  System.out.println("The Running movies in the Inox Mantri square========");
	  theater3.getRunningMovies();
	  
	  
	  
	  
	  
   }
   
   public void getRunningMovies()
   {  
      for(int i=0; i< runningMovies.length;i++)
	  {
	       System.out.println(runningMovies[i]);
	  }
   }
   
   
	   
   
   
}