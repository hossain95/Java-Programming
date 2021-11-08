package com.polymorphism.methodOverriding;

public class Overriding
{
	public static void main(String arg[])
	{
		System.out.println("Laptop Information");
		Product laptop = new Laptop();
		int laptopid = laptop.getProductId();
		String laptopname = laptop.getProductName();
		System.out.println("Laptop Id: "+laptopid);
		System.out.println("Laptop Namae: "+laptopname);
		
		
		System.out.println("\n\nPhone information");
		Phone phone = new Phone();
		int phoneid = phone.getProductId(11);
		String phonename = phone.getProductName("Redmi note 6 pro");
		
		System.out.println("Phone Id: "+ phoneid);
		System.out.println("Phone Name: "+ phonename);
		
	}
}
