package com.inheritance;

public class SmartPhone extends SmartDeviceFeatures
{
	private String fontCamera;
	private String rearCamera;
	public SmartPhone() {
		System.out.println("Smart Phone is called!");
	}
	
	public void setFontCamera(String fontCamera)
	{
		this.fontCamera = fontCamera;
	}
	public String getFontCamera()
	{
		return fontCamera;
	}
	public void setRearCamera(String rearCamera)
	{
		this.rearCamera = rearCamera;
	}
	public String getRearCamera()
	{
		return rearCamera;
	}
	void setSmartPhoneDetails(int productId, String productName, String productOperatingSystem, String fontCamera, String rearCamera, String ram, String storage)
	{
		setProductId(productId);
		setProductName(productName);
		setProductOperatingSystem(productOperatingSystem);
		setFontCamera(fontCamera);
		setRearCamera(rearCamera);
		setRam(ram);
		setStorage(storage);
	}
	void displaySmartPhoneDetails()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Product ID: "+ getProductId());
		System.out.println("Product Name: "+ getProductName());
		System.out.println("Operating System: "+getProductOperatingSystem());
		System.out.println("font Camera: "+getFontCamera());
		System.out.println("Rear Camera: "+getRearCamera());
		System.out.println("Ram: "+ getRam());
		System.out.println("Storage: "+ getStorage());
		System.out.println("--------------------------------------------------------");
	}
}
