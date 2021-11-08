package com.polymorphism.methodoverloading;

public class overloading {

	public static void main(String[] args)
	{
		Sum sum = new Sum();
		System.out.println("sum: "+sum.Add(1, 2));
		System.out.println("sum: "+sum.Add(1, 2, 3));
		System.out.println("sum: "+sum.Add(1, 2, 3, 4));
	}

}
