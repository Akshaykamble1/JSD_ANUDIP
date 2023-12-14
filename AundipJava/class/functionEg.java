package com.demo;

public class functionEg
{
	int add() 
	{
		int a=23;int b=23;
		int result = a+b;
		return result;
	}
	
	public static void main(String[] args) 
	{
		functionEg obj = new functionEg();
		System.out.println("Addition is :"+obj.add());
	}
}