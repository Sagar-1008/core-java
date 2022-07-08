class HospitalTester{

     public static void main(String a[]){
	 
	     
		 Hospital hos = new Hospital();
		 PatientDTO dto = new PatientDTO();
		 dto.setGender(Gender.male); 
		 dto.setId(1);
		 dto.setName("Baba");
		 dto.setAddress("Vijayanagr");
		 dto.setContactNo(987466321l);

	
		 PatientDTO dto1 = new PatientDTO();
		 dto1.setGender(Gender.female); 
		 dto1.setId(2);
		 dto1.setName("Devi");
		 dto1.setAddress("Rajajinagar");
		 dto1.setContactNo(8974563268l);
		 
		 PatientDTO dto2 = new PatientDTO();
		 dto2.setGender(Gender.male); 
		 dto2.setId(3);
		 dto2.setName("Raja");
		 dto2.setAddress("Yeshavanthpura");
		 dto2.setContactNo(985473215l);
		 
		 PatientDTO dto3 = new PatientDTO();
		 dto3.setGender(Gender.female); 
		 dto3.setId(4);
		 dto3.setName("Rani");
		 dto3.setAddress("Yeshavanthpura");
		 dto3.setContactNo(9264875688l);
		 
		 
		 PatientDTO dto4 = new PatientDTO();
		 dto4.setGender(Gender.male); 
		 dto4.setId(5);
		 dto4.setName("Gaja");
		 dto4.setAddress("Attiguppe");
		 dto4.setContactNo(6984514578l);
		 
		 
		 hos.createPatient(dto);
		 hos.createPatient(dto1);
		 hos.createPatient(dto2);
		 hos.createPatient(dto3);
		 hos.createPatient(dto4);
		 
		 hos.getPatientDetails();
	 
	 
	 }


}