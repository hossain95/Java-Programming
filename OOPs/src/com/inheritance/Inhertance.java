package com.inheritance;

import java.util.Scanner;

public class Inhertance
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		SmartPhone smartphone[] = new SmartPhone[2];
		/*--------------------------------------------------------*/
		int id = 1;
		String name = "Redmi note 7 pro";
		String os = "Android";
		String font = "20px";
		String rear = "48px";
		String ram = "4gb";
		String storage = "64gb";
		
		
		smartphone[0] = new SmartPhone();
		smartphone[0].setSmartPhoneDetails(id, name, os, font, rear, ram, storage);
		
		
		smartphone[0].displaySmartPhoneDetails();
		/*--------------------------------------------------------*/
		
		
		Laptop laptop[] = new Laptop[2];
		
		/*----------------------------------------------------*/
		id = 2;
		name = "Dell inspiron";
		os = "Linux Mint";
		String camera = "10px";
		ram = "8gb";
		storage = "128gb ssd, 1tb hdd";
		String graphics = "NVidia";
		
		
		laptop[0] = new Laptop();
		laptop[0].setLaptopDetails(id, name, ram, ram, storage, camera, graphics);
		laptop[0].displayLaptopFeatures();
	}

}
