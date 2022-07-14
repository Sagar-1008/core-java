class Hospital{
     
	 // Has many patients
     PatientDTO dtos[] ;
	 
	 int index;
	 
	 public Hospital(int size){
		 dtos = new PatientDTO[size];
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
	 
	 public boolean updatePatientAddressById(int id, String address){
		 
		 System.out.println("Inside updatePatientAddressById ");
		 boolean updateAddress = false;
		 for(int i=0; i<dtos.length;i++){
			 if(dtos[i].getId() == id ){
				 dtos[i].setAddress(address);
				 updateAddress = true;
				 
			 }
			 else{
				 System.out.println("The patient id is not found");
			 }
		 }
		 return updateAddress;
	 }
	 
	 
	 public boolean updatePatientContactNoByName(String name, long contactNo){
		 
		 System.out.println("Inside updatePatientContactNoByName ");
		 boolean updateContactNo = false;
		 for(int i=0; i<dtos.length;i++){
			 if(dtos[i].getName().equals(name)){
				 dtos[i].setContactNo(contactNo);
				 updateContactNo = true;
				 
			 }
			 else{
				 System.out.println("The patient name is not found");
			 }
		 }
		 return updateContactNo;
	 }
	 
	 public void deletePatientDetails(int id){
		 for(int i=0;i<dtos.length;i++){
			 if(dtos[i].getId()==id){
				 dtos[i]=null;
				 System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"  "+dtos[i].getAddress()+"  "+dtos[i].getGender()+"  "+dtos[i].getContactNo());
				 
				System.out.println("the patient details is deleted");
			 }
			 else{
				 //dtos[i]=dtos[i-1];
				 
				 System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"  "+dtos[i].getAddress()+"  "+dtos[i].getGender()+"  "+dtos[i].getContactNo());
			 }
		 }
	 }
	 







}