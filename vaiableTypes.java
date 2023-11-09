package com.demo;

public class vaiableTypes 
{
	int num = 23;//instance variable
	
	void show()
	{
		int num2 = 34;//local variable
		System.out.println("Number is : "+num2);
		System.out.println("Number is : "+num);
	}
	
	public static void main(String[] args) 
	{
		vaiableTypes obj = new vaiableTypes();
		obj.show();
		System.out.println("Number is : "+obj.num);
	}
}