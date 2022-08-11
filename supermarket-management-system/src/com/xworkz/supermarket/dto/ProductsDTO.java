package com.xworkz.supermarket.dto;

public class ProductsDTO {
         
	private int id;
	private String supermarketName;
	private int noOfEmployees;
	private int noOfProducts;
	private String ProductName;
	private double productPrice;
	private int productId;
	
	
	public ProductsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the supermarketName
	 */
	public String getSupermarketName() {
		return supermarketName;
	}

	/**
	 * @param supermarketName the supermarketName to set
	 */
	public void setSupermarketName(String supermarketName) {
		this.supermarketName = supermarketName;
	}

	/**
	 * @return the noOfEmployees
	 */
	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * @param noOfEmployees the noOfEmployees to set
	 */
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	/**
	 * @return the noOfProducts
	 */
	public int getNoOfProducts() {
		return noOfProducts;
	}

	/**
	 * @param noOfProducts the noOfProducts to set
	 */
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return ProductName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		ProductName = productName;
	}

	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductsDTO [id=" + id + ", supermarketName=" + supermarketName + ", noOfEmployees=" + noOfEmployees
				+ ", noOfProducts=" + noOfProducts + ", ProductName=" + ProductName + ", productPrice=" + productPrice
				+ ", productId=" + productId + "]";
	}
	
	
}
