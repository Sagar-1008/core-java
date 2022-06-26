class InstituteTester{

        public static void main(String a[]){
		
		Xworkz xworkz = new Xworkz();
		xworkz.location= "Rajajinagar";
	    xworkz.noOfTrainees = 200 ;
	    xworkz.noOfTrainers= 20;
	    xworkz.noOfBranches = 2;
		
		System.out.println(" The institute is located in "+ xworkz.location +" The no of trainees are "+ xworkz.noOfTrainees +" the no of traners are "+ xworkz.noOfTrainers);
		System.out.println("the no of branches in the bangalore "+ xworkz.noOfBranches);
		xworkz.getExpertise();
}


}