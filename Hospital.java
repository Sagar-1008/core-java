class Hospital{
     
	 // Has many patients
     PatientDTO dtos[] = new PatientDTO[5];
	 
	 int index;
	 
	 public Hospital(){
	    System.out.println("The Hospital object is created");
	 }
	 
	 public boolean createPatient(PatientDTO dto){
		  
		  System.out.println("The inside createPatient()");
		  boolean isAdded = false;
		  if(dto != null && dto.getName()!= null){
			  this.dtos[index++] = dto;
			  isAdded = true;
			  System.out.println("The patient details is saved");
		  }
		  
		  else{
			  System.out.println("Please Enter patient correct details");
		  }
		 
		 return isAdded;
	 }
	 
	 public void getPatientDetails(){
		 
		 System.out.println("Inside the getPatientDetails()");
		 for(int i=0; i<dtos.length; i++){
			 
			System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"  "+dtos[i].getAddress()+"  "+dtos[i].getGender()+"  "+dtos[i].getContactNo());
		 }
	 }
	 







}