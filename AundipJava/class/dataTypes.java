package com.demo;

public class dataTypes 
{
	void result()
	{
		byte b = 1;
		System.out.println("The value of byte is : "+b);
		
		int rollno = 23;
		System.out.println("Roll number is : "+rollno);
		
		String name  = "Akshay_Kamble";
		System.out.println("Name is : "+name);
		
		char initial = 'A';
		System.out.println("Initial character is : "+initial);
		
		float mark = 78.78f;
		System.out.println("Marks is  : "+mark);
		
		double mobileno = 787878787878d;
		System.out.println("Phone number is  : "+mobileno);
		
		boolean result = true;
		System.out.println("Result is Pass/Fail : "+result);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Data-Types");
		dataTypes obj = new dataTypes();
		obj.result();
	}
}