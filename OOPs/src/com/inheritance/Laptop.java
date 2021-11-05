package com.inheritance;

public class Laptop extends SmartDeviceFeatures
{
	private String graphics;
	private String camera;
	public Laptop() {
		System.out.println("Laptop is called!");
	}
	
	
	public void setCamera(String camera)
	{
		this.camera = camera;
	}
	public String getCamera()
	{
		return camera;
	}
	public void setGraphics(String graphics)
	{
		this.graphics = graphics;
	}
	public String getGraphics()
	{
		return graphics;
	}
	void setLaptopDetails(int productId, String productName, String productOperatingSystem, String ram, String storage, String camera, String graphics)
	{
		setProductId(productId);
		setProductName(productName);
		setCamera(camera);
		setRam(ram);
		setStorage(storage);
		setProductOperatingSystem(productOperatingSystem);
		setGraphics(ram);
		setGraphics(graphics);
	}
	void displayLaptopFeatures()
	{
		System.out.println("Product Id: "+ getProductId());
		System.out.println("Product Name: "+ getProductName());
		System.out.println("Camera: "+getCamera());
		System.out.println("Operating System: "+getProductOperatingSystem());
		System.out.println("Ram: "+ getRam());
		System.out.println("Storag: "+ getStorage());
		System.out.println("Graphics: "+getGraphics());
	}
}
