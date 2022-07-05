class WeaponsTester{

     public static void main(String a[]){
		 
		 Weapons weapons = new Weapons();
		 weapons.setName("SLR");
		 weapons.setId("5412gfdrtd");
		 weapons.setType("Long range");
		 weapons.setPrice(12000);
		 weapons.setNoOfBullets(6);
		 System.out.println(weapons.getName()+" "+weapons.getId()+" "+ weapons.getType() +" "+weapons.getPrice()+"  "+weapons.getNoOfBullets());
		 weapons.useOfWeapon();
		 
	 }


}