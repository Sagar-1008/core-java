 	package com.xworkz.blocks;

import com.xworkz.blocks.dto.LanguageDTO;

public class LanguageTester {
       
	public static void main(String[] args) {
		LanguageDTO lang = new LanguageDTO();
		lang.setId(150);
		lang.setContactNo(9632587412L);
		lang.setDNum(2.00);
		lang.setNum((short) 225);
		lang.setCons('g');
		

		//converting to wrapper class - boxing
		Integer id = lang.getId();
		//auto-unboxing
		int id1 = id;
		//Conversion from wrapper to primitive - unboxing
		int id2 = id.intValue();
		//auto-boxing
		Long contactNo = lang.getContactNo();
		//unboxing
		long contactNo1 = contactNo.longValue();
		//auto-boxing
		Double dNum = lang.getDNum();
		//unboxing
		double dNum1 = dNum.doubleValue();
		//auto-boxing
		Short num = lang.getNum();
		//unboxing
		double num1 = num.shortValue();
		

		System.out.println(lang.getId()+ " "+ lang.getContactNo()+" "+lang.getCons()+"  "+lang.getDNum());
		System.out.println(id1+ ""+id2+" "+contactNo1+" "+num);
	}
}
