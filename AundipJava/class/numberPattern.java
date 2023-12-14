package com.demo;

public class numberPattern 
{
	void square()
	{
		int num=6;
		for(int row=1;row<=num;row++)
		{
			for(int column=1;column<=num;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println(" ");
		}
	}
	void increaseTriangle()
	{
		int num=6;
		for(int row=1;row<=num;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println(" ");
		}
	}
	void decreaseTriangle()
	{
		int num=6;
		for(int row=1;row<=num;row++)
		{
			for(int column=row;column<=num;column++)
			{
				System.out.print(column+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) 
	{
		numberPattern obj = new numberPattern();
		System.out.println("Square triangle");
		obj.square();
		System.out.println("=========================");
		System.out.println("Increase-Triangle");
		obj.increaseTriangle();
		System.out.println("=========================");
		System.out.println("Descrease-Triangle");
		obj.decreaseTriangle();
	}
}