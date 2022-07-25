package com.xworkz.supermarket;

import java.util.Arrays;

import com.xworkz.supermarket.dto.ProductsDTO;

public class SuperMarket {
      
	ProductsDTO[] products ;
	int index = 0;
	

	public SuperMarket() {
		System.out.println("Supermarket constructor is created");
	}



	public SuperMarket(int size) {
		
		this();
		products = new ProductsDTO[size];
	}
	
	
	public boolean createProduct(ProductsDTO product) {
		
		boolean isAdded = false;
		
		if(product != null && product.getProductName()!=null ) {
			this.products[index++] = product ;
			isAdded = true ;
			System.out.println("The product is saved");
		}
		else {
			System.out.println("the product is not saved");
		}
		return isAdded;
	}
	
	public void getProductDetails() {
		for(int i=0; i<products.length;i++) {
			System.out.println(products[i]);
		}
	}
	
	public boolean updateproductNamebyId(int productId, double productPrice) {
		boolean updateProductPrice = false;
		for(int i=0; i<products.length;i++) {
			if(products[i].getProductId()==productId) {
				products[i].setProductPrice(productPrice);
				updateProductPrice=true;
				System.out.println("the product price is changed");
			}else{
				System.out.println("the product id is not found");
			}
		}
		return updateProductPrice;
	}
	
	public boolean deleteProductById(int id) {
		 boolean deleteProduct = false;
		 int i, j ;
		 for(j=0, i=0; j<products.length;j++) {
			 if(products[j].getProductId() != id) {
				 products[i++]=products[j];
				 deleteProduct = true;
			 }
			 else {
				 System.out.println("the product is not deleted");
			 }
		 }
		 products = Arrays.copyOf(products, i);
		 return deleteProduct; 
	}
	
}
