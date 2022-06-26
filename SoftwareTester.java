class SoftwareTester{



    public static void main(String []a){
	
	
	Infosys info = new Infosys();
	info.location = "Electronic city";
	info.noOfEmployees  = 1000;
	info.turnOver  = "2000crores";
	info.founder = "Narayana Murthy";
	
	System.out.println("The company is located in "+ info.location +" the no of employees are "+ info.noOfEmployees +" The annual turn over is "+ info.turnOver);
	System.out.println("The founder of the infosys company is "+ info.founder);
	info.getCompany();
	
	
	
	}






}