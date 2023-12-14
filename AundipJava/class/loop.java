package com.demo;

public class loop 
{
	void whileLoop()
	{
		int num = 1;
		while(num<11)
		{
			System.out.println(num);
			num++;
		}
	}
	void doWhileLoop()
	{
		int num = 1;
		do
		{
			System.out.println(num);
			num++;
		}while(num<11);
	}
	void forLoop()
	{
		for(int i=0;i<11;i++)
		{
			System.out.println("The value of i is : "+i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Loop in java");
		loop obj = new loop();
		System.out.println("While-loop");
		obj.whileLoop();
		System.out.println("========================");
		System.out.println("Do-While-loop");
		obj.doWhileLoop();
		System.out.println("========================");
		System.out.println("For-loop");
		obj.forLoop();
		System.out.println("========================");
	}
}