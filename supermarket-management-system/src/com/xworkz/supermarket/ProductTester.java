package com.xworkz.supermarket;

import java.util.Scanner;

import com.xworkz.supermarket.dto.ProductsDTO;

public class ProductTester {
       
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number of products");
		 int size = sc.nextInt();
		 
		 SuperMarket sm = new SuperMarket(size) ;
		 
		 for(int i=0; i<size;i++) {
			 
			 ProductsDTO products = new ProductsDTO();
			 
			 System.out.println("enter the id of the super market");
			 int id = sc.nextInt();
			 System.out.println("enter the name of the super market");
			 String name = sc.next();
			 System.out.println("enter the no of employees in  the the super market");
			 int noOfEmployees = sc.nextInt();
			 System.out.println("enter the product  name");
			 String productName = sc.next();
			 System.out.println("enter the noOfProducts");
			 int noOfProducts = sc.nextInt();
			 System.out.println("enter the product price");
			 double price = sc.nextDouble();
			 System.out.println("enter the product id");
			 int productId = sc.nextInt();
			 
			 products.setId(id);
			 products.setSupermarketName(name);
			 products.setNoOfEmployees(noOfEmployees);
			 products.setProductName(productName);
			 products.setProductId(productId);
			 products.setProductPrice(price);
			 products.setNoOfProducts(noOfProducts);
			 
			 sm.createProduct(products);
		 }
		     sm.getProductDetails();
 
	}
}
