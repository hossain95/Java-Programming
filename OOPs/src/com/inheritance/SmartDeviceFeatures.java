package com.inheritance;

public class SmartDeviceFeatures extends Product
{
	//String processor;
	private String ram;
	private String storage;
	public SmartDeviceFeatures()
	{
		System.out.println("Smart Device Features called!");
	}
	
	public void setRam(String ram)
	{
		this.ram = ram;
	}
	public String getRam()
	{
		return ram;
	}
	public void setStorage(String storage)
	{
		this.storage = storage;
	}
	public String getStorage()
	{
		return storage;
	}
}
