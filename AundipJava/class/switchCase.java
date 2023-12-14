package com.demo;

import java.util.Scanner;

public class switchCase 
{
	public static void main(String[] args)
	{
		System.out.println("Switch-Case");
		Scanner sc = new Scanner(System.in);
		String day;
		System.out.println("Enter day between Sunday to Satursday :");
		day=sc.next();
		
		int ch;
		System.out.println("Enter your choice from 1 to 7 :");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1 : day="Monday";
				System.out.println("Sunday");
				break;
		case 2 : day="Tuesday";
				System.out.println("Monday");
				break;
		case 3 : day="Wednesday";
				System.out.println("Tuesday");
				break;
		case 4 : day="Thursday";
				System.out.println("Wednesday");
				break;
		case 5 : day="Friday";
				System.out.println("Thursday");
				break;
		case 6 : day="Satursday";
				System.out.println("Friday");
				break;
		case 7 : day="Sunday";
				System.out.println("Satursday");
				break;
		default : System.out.println("Your entered day ");
		}
	}
}