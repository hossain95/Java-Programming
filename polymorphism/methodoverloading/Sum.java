package com.polymorphism.methodoverloading;

public class Sum
{
	private float a;
	private float b;
	private float c;
	private float d;
	public float Add(float a, float b)
	{
		System.out.print("two parameter ");
		return a+b;
	}
	public float Add(float a, float b, float c)
	{
		System.out.print("three parameter ");
		return a+b+c;
	}
	public float Add(float a, float b, float c, float d)
	{
		System.out.print("four parameter ");
		return a+b+c+d;
	}
}
