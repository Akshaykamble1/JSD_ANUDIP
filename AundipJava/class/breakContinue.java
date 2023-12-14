package com.demo;

public class breakContinue 
{
	void Break()
	{
		for(int i=21;i<30;i++)
		{
			if(i==28)
			{
				break;
			}
			System.out.println("The value of i is : "+i);
		}
	}
	void Continue()
	{
		for(int i=21;i<=30;i++)
		{
			if(i==28)
			{
				continue;
			}
			System.out.println("The value of i is : "+i);
		}
	}
	public static void main(String[] args)
	{
		breakContinue obj = new breakContinue();
		System.out.println("Break-Statement");
		obj.Break();
		System.out.println("============================");
		System.out.println("Continue-Statement");
		obj.Continue();
	}
}