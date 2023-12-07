/*
Write a Java program that calculates the Body Mass Index (BMI) based 
on the user's weight (in kilograms) and height (in meters). The program 
should then categorize the BMI into different ranges (Underweight, 
Normal, Overweight, and Obese) using an if-else-if ladder
*/

import java.util.Scanner;
public class BMI
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in Kg:");
		double weight = sc.nextDouble();
		System.out.println("Enter Height in in Meters:");
		double height = sc.nextDouble();
		double bmi =  weight/(height *height) ;
		System.out.printf("BMI :" ,bmi);

		if(bmi <=18.5)
		{
			System.out.println("Underweight");
		} else if(bmi >=18.5 && bmi <=24.9)
		{
			System.out.println("Normal");
		}else if(bmi >=25.0 && bmi <=29.9)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		
		}
		
		
	}
}
