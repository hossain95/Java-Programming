package com.polymorphism.methodOverriding;

public class Laptop extends Product
{
	private int laptopId = 10;
	private String laptopName = "Dell Inspiron";
	@override
	public int getProductId()
	{
		return laptopId;
	}
	@override
	public String getProductName()
	{
		return laptopName;
	}
}
