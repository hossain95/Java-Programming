package com.polymorphism.methodOverriding;

public class Phone extends Product
{
	private int phoneId = 12;
	private String phoneName = "redmi note 7 pro";
	@override
	public int getProductId(int phoneId)
	{
		return this.phoneId = phoneId;
	}
	@override
	public String getProductName(String phoneName)
	{
		return this.phoneName = phoneName;
	}
}
