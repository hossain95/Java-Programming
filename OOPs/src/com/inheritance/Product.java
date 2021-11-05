package com.inheritance;

public class Product
{
	private int productId;
	private String productName;
	//double productPrice;
	//double productDisplaySize;
	//int productBattaryCapacity;
	private String productOperatinSystem;
	public Product()
	{
		System.out.println("Product class is called!");
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public int getProductId()
	{
		return productId;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductOperatingSystem(String productOperatingSystem)
	{
		this.productOperatinSystem = productOperatingSystem;
	}
	public String getProductOperatingSystem()
	{
		return productOperatinSystem;
	}
	/*public void setProductDetails(int productId, String productName, double productPrice, double productDisplaySize, int productBattaryCapacity, String productOperatingSystem)
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDisplaySize = productDisplaySize;
		this.productBattaryCapacity = productBattaryCapacity;
		this.productOperatinSystem = productOperatinSystem;
	}
	public void getProductDetails()
	{
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: "+ productPrice);
		System.out.println("Product Display Size: "+ productDisplaySize);
		System.out.println("Product Battay Capacity: "+ productBattaryCapacity);
		System.out.println("Product Operating System: "+ productOperatinSystem);
	}
	*/
}
