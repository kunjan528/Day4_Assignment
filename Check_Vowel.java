/*
Write a Java program to check whether a given character is a vowel or a 
consonant.
*/

import java.util.Scanner;

public class Check_Vowel
{
	public static void main(String[] args)
	{
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the Character :");
	      char ch = sc.next().charAt(0);
	      switch(ch)
	     {
		case 'A' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'a' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'E' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'e' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'I' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'i' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'O' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'o' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'U' :	System.out.println(ch +" Is a Vowel");
				break;
		case 'u' :	System.out.println(ch +" Is a Vowel");
				break;

		default  : 
				System.out.println(ch +" Is  Not a consonant.");
             }
		
	      
	}
	
}