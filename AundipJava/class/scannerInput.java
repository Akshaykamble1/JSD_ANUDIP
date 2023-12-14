package com.demo;

import java.util.Scanner;

public class scannerInput 
{
	public static void main(String[] args)
	{
		System.out.println("Scanner-Input");
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter your Name : ");
		name=sc.next();
//		System.out.println("Enter your Name : "+name);
		int rollno;
		System.out.println("Enter your Roll Number : ");
		rollno=sc.nextInt();
		System.out.println("Your name is : "+name+" and Roll number is : "+rollno+".");
	}
}