class Institutes{


     int id;
	 String name;
	 int noOfStudents;
	 int noOfTrainers;
	 String location;
	 static String course = "Java development course";
	 
	 public Institutes(int id, String name, int noOfStudents, int noOfTrainers, String location){
	 
	     System.out.println("The institute object is created");
		 this.id = id;
		 this.name = name;
		 this.noOfStudents = noOfStudents;
		 this.noOfTrainers = noOfTrainers;
		 this.location = location;
	 }
		 public static void main(String a[])
		 {
		     
			 Institutes institute = new Institutes(34561, "Xworkz",200, 15, "Rajajinagar" );
			 System.out.println("The name of the institute is "+ institute.name+" Id is "+ institute.id +" The number of students and trainers are  "+ institute.noOfStudents +", "+ institute.noOfTrainers);
			 System.out.println(" The course offred by "+ institute.name +" is "+ Institutes.course);
			 System.out.println("-----------------------------------------------------------------");
			 
			 Institutes institute1 = new Institutes(48512, "kcent",100, 10, "jayanagar" );
			 System.out.println("The name of the institute is "+ institute1.name+" Id is "+ institute1.id +" The number of students and trainers are  "+ institute1.noOfStudents +", "+ institute1.noOfTrainers);
			 System.out.println(" The course offred by "+ institute1.name +" is "+ Institutes.course);
			 System.out.println("-----------------------------------------------------------------");
			 
			  Institutes institute2 = new Institutes(51245, "ABC",50, 12, "RPC Layout" );
			 System.out.println("The name of the institute is "+ institute2.name+" Id is "+ institute2.id +" The number of students and trainers are  "+ institute2.noOfStudents +", "+ institute2.noOfTrainers);
			 System.out.println(" The course offred by "+ institute2.name +" is "+ Institutes.course);
			 System.out.println("-----------------------------------------------------------------");
			 
			 Institutes institute3 = new Institutes(54685, "Q Spider",300, 20, "Rajajinagar" );
			 System.out.println("The name of the institute is "+ institute3.name+" Id is "+ institute3.id +" The number of students and trainers are  "+ institute3.noOfStudents +", "+ institute3.noOfTrainers);
			 System.out.println(" The course offred by "+ institute3.name +" is "+ Institutes.course);
			 System.out.println("-----------------------------------------------------------------");
		 }
	 
	 
	 


}