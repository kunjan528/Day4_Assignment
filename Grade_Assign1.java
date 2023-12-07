//Grade Point Average .

import java.util.Scanner ;
public class Grade_Assign1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade :");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case('A') :     System.out.println("4.0");
					break ;

			case('B') :     System.out.println("3.0");
					break ;

			case('C') :     System.out.println("2.0");
					break ;

			case('D') :     System.out.println("1.0");
					break ;

			case('F') :     System.out.println("0.0");
					break ;

			default  :      System.out.println("Invalid Grade.");
  
		}

		
		
		 
		
	}

}