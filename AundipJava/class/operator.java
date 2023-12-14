package com.demo;

public class operator 
{
	void arithmatic()
	{
		int num1 = 20,num2 = 5;
		
		System.out.println("Addition is : "+(num1+num2));
		System.out.println("Subtraction is : "+(num1-num2));
		System.out.println("Multiplication is : "+(num1*num2));
		System.out.println("Division is : "+(num1/num2));
		System.out.println("Reminder is : "+(num1%num2));
	}
	void comparison()
	{
		int a = 20,b = 5;
		
		System.out.println("Lessthan is : "+(a<b));
		System.out.println("LessThanEqualTo is : "+(a<=b));
		System.out.println("GreaterThan is : "+(a>b));
		System.out.println("GreaterThanEqualTo is : "+(a>=b));
		System.out.println("EqualTo is : "+(a==b));
		System.out.println("NotEqualTo is : "+(a!=b));
	}
	void logical()
	{
		System.out.println("Logical_AND -Operater");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		System.out.println("Logical_OR -Operater");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		System.out.println("Logical_NOT-Operator");
		System.out.println(!(true));
		System.out.println(!(false));
	}
	void assignment()
	{
		int z = 5;
		System.out.println("+Assignment is :"+(z+=2));
		System.out.println("-Assignment is :"+(z-=2));
		System.out.println("*Assignment is :"+(z*=2));
		System.out.println("/Assignment is :"+(z/=2));
		System.out.println("%Assignment is :"+(z%=2));
	}
	public static void main(String[] args)
	{
		System.out.println("Operator in java");
		System.out.println("Arithematic-Operator in java");
		operator obj = new operator();
		obj.arithmatic();
		System.out.println("=====================================");
		System.out.println("Comparison-Operator in java");
		obj.comparison();
		System.out.println("=====================================");
		System.out.println("Logical-Operator in java");
		obj.logical();
		System.out.println("=====================================");
		System.out.println("Assignment-Operator in java");
		obj.assignment();
	}
}