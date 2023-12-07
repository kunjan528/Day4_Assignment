/*
5) Write a Java program for a bookstore that calculates the total cost of a 
purchase based on the number of books bought and whether the customer 
is a member. The bookstore offers the following discounts:
If the customer is a member, they get a 10% discount on the total cost.
If the customer buys more than 5 books, they get an additional 5% 
discount on the already discounted price.
If the customer buys 10 or more books, they get a flat Rs100 off in 
addition to the other discounts.
The program should take as input the number of books and whether the 
customer is a member. It should then calculate and print the total cost 
after applying the appropriate discounts.
*/ 

import java.util.Scanner;
public class Book_Store
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Books_No:");
		int book_no = sc . nextInt();
		System.out.println("Enter the Books prise by coustomer :" );
		int bought = sc.nextInt();
		int  total_cost = bought * book_no ;
		System.out.println("Total Cost :" + total_cost);
		System.out.println("The Customer is a member or not : (Y/N) :");
		char ch = sc.next().charAt(0);
		double discount = total_cost / 100 *10;
		System.out.println("discount :" + discount);
		
		double discounted_price =0.0;
		
		if(ch == 'Y' || ch == 'y')
		{
			discount = bought  - ((10 /100)  * bought);
			System.out.println("discount :" + discount);
				if(book_no>=5)
				{
				 
				 discounted_price=discount - (5 / 100)*discount;
					if( book_no>10)
					{
							  discounted_price=discounted_price - 100;
					}
			
				}
			System.out.println("Discount _price : "+discounted_price);
		
		}
		else if(ch == 'N' || ch == 'n')
		{
			System.out.println("He/She is not a member");
		}
		
		
		

		
		
	}
}