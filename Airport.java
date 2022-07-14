<<<<<<< HEAD
class Airport{


    TerminalDTO[] terminals ;
	int index;
	
	public Airport(int size){
	  terminals = new TerminalDTO[size];
      System.out.println("The Airport constructor is created");	  
	
	}
	public boolean createTerminal(TerminalDTO terminal){
	
	
	    System.out.println("Inside the createTerminal()");
		boolean isAdded = false;
		
		if(terminal != null && terminal.getId() != 0) {
		    
			this.terminals[index++] = terminal;
			isAdded = true;
			System.out.println("The terminals detail are saved");
		} else {
		   System.out.println("The terminals are not saved");
		
		}
	       System.out.println("the createTerminal() is ended");
	   return isAdded;
	}
	
	public void getTerminalDetails(){
	
	     
		 for(int i=0; i<terminals.length; i++){
		    
			  System.out.println(terminals[i].getId()+"  "+terminals[i].getName()+"  "+terminals[i].getNoOfLoadingBridges()+"  "+terminals[i].getNoOfDepartureGates()+"  "+terminals[i].getNoOfCheckinCounters());
		 
		 }
	     
	}
	
	 public boolean updateLoadingBridgeById(int id, int noOfLoadingBridges){
		 
		 System.out.println("Inside updateLoadingBridgeById ");
		 boolean updateNoOfLoadingBridge = false;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getId() == id ){
				 terminals[i].setNoOfLoadingBridges(noOfLoadingBridges);
				 updateNoOfLoadingBridge = true;
				 
			 }
			 else{
				 System.out.println("The terminal id is not found");
			 }
		 }
		 return updateNoOfLoadingBridge;
	 }
	 
	 public boolean updateNoOfCheckInCoountersByName(String name, int noOfCheckIncounters){
		 
		 System.out.println("Inside updatePatientContactNoByName ");
		 boolean updateCheckInCounters = false;
		 for(int i=0; i<terminals.length;i++){
			 if(terminals[i].getName().equals(name)){
				 terminals[i].setNoOfCheckinCounters(noOfCheckIncounters);
				 updateCheckInCounters = true;
				 
			 }
			 else{
				 System.out.println("The terminal name is not found");
			 }
		 }
		 return updateCheckInCounters;
	 }
	 




=======
class Airport{


    TerminalDTO[] terminals ;
	int index;
	
	public Airport(int size){
	  terminals = new TerminalDTO[size];
      System.out.println("The Airport constructor is created");	  
	
	}
	public boolean createTerminal(TerminalDTO terminal){
	
	
	    System.out.println("Inside the createTerminal()");
		boolean isAdded = false;
		
		if(terminal != null && terminal.getId() != 0) {
		    
			this.terminals[index++] = terminal;
			isAdded = true;
			System.out.println("The terminals detail are saved");
		} else {
		   System.out.println("The terminals are not saved");
		
		}
	       System.out.println("the createTerminal() is ended");
	   return isAdded;
	}
	
	public void getTerminalDetails(){
	
	     
		 for(int i=0; i<terminals.length; i++){
		    
			  System.out.println(terminals[i].getId()+"  "+terminals[i].getName()+"  "+terminals[i].getNoOfLoadingBridges()+"  "+terminals[i].getNoOfDepartureGates()+"  "+terminals[i].getNoOfCheckinCounters());
		 
		 }
	     
	}



>>>>>>> d09fbfea06445d75a0b0ed212c040bedaa1b843a
}