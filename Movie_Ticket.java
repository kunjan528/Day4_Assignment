/*
Write a Java program to determine the price of a movie ticket based on 
the age of the person and the time of the movie. Implement the following 
pricing rules:
Children (age 0-12): Rs 5.00
Adults (age 13-59): Rs 10.00
Seniors (age 60 and above): Rs 7.50
 Additionally, if the movie is scheduled between 3:00 PM and 6:00 PM, 
there is a Rs 2.00 discount on the ticket price. If the movie is scheduled after 
6:00 PM, there is a Rs 3.00 discount.
The program should take the age and time of the movie in 24 hr (integer
value) as input and print the final ticket price.
*/


import java.util.Scanner ;
public class Movie_Ticket
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int age= sc.nextInt();
		System.out.println("Enter the  time between  24 hr  :");
		int time = sc.nextInt(); 
		
		double final_ticket_price = 0;
		double ticket_Price = 0;

		if(age<13)
		{
			ticket_Price = 5.0 ;
			
			
		}
		else if(age>12 && age<60)
		{
			ticket_Price = 10.00 ;
		}
		else if(age>59)
		{
			ticket_Price = 7.50;
		}
		
		if(time >= 15 && time <= 18)
		{
			 final_ticket_price = ticket_Price - 2.00;
			 
		}
		if(time > 18)
		{
			 final_ticket_price = ticket_Price - 3.00;
			
		}
		System.out.print("Final_Ticket_Price :"+final_ticket_price);
				
	}
}