package com.demo;

public class condition 
{
	void ifCondition()
	{
		int pwd = 1212;
		if(pwd==1212)
		{
			System.out.println("Welcome To The Main Function");
		}
	}
	
	void ifElseCondition()
	{
		int age = 20;
		if(age>=20)
		{
			System.out.println("You are eligible for vote : "+age);
		}
		else
		{
			System.out.println("You are not eligible for vote : "+age);
		}
	}
	
	void ifElseLadder()
	{
		boolean status = true; 
		int marks = 35;
		//outer condition
		if(status == true){
			System.out.println("You are present");
			//inner multi condition
			 if(marks<=99 && marks>80){
				System.out.println("Your grade is O... Outstanding");
			}
			else if(marks<=80 && marks>65){
				System.out.println("Your grade is A .... Very good");
			}
			else if(marks<=65 && marks>55){
				System.out.println("Your grade is B ....  Good");
			}
			else if(marks<=55 && marks>45){
				System.out.println("Your grade is C ....  Average");
			}
			else if(marks<=45 && marks>=35){
				System.out.println("Your grade is D .... Poor");
			}
			//inner else
			else {
				System.out.println("Failed.... You score very less....");
			}
		}
		//outer else
		else{
			System.out.println("You was Absent in assessment");
		}
	}
	
	public static void main(String[] args) 
	{
		condition obj = new condition();
		System.out.println("If-Condition");
		obj.ifCondition();
		System.out.println("=======================================");
		System.out.println("If-Else-Condition");
		obj.ifElseCondition();
		System.out.println("=======================================");
		System.out.println("If-Else-Ladder-Condition");
		obj.ifElseLadder();
		System.out.println("=======================================");
	}
}