package Example;

import java.util.Scanner;

public class Customer 
{
	public static void main(String[] args) 
	{
		Hotel h = new Hotel();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Choice: \n1:Idly \n2:Dosa \n3:Vada \n4:Puri");

		int choice =scan.nextInt();

		Food obj = h.orderFood(choice);
		

		if ( obj instanceof Idly) 
		{
			System.out.println("Ordered Idly");
		}
		else if ( obj instanceof Dosa) 
		{
			System.out.println("Ordered Dosa");
		}
		else if ( obj instanceof Vada) 
		{
			System.out.println("Ordered Vada");
		}
		else
		{
			System.out.println("Orederd Puri");
		}
		scan.close();
	}
}
