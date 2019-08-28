package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		int total_cust = scan.nextInt();
		for (int i = 0; i < total_cust; i++)
		{
			String first_name = scan.next();
			String last_name = scan.next();
			int total_items = scan.nextInt();
		
			double amt_spent = 0.0;
				
			for (int j = 0; j < total_items; j++) 
			{
				int item_quantity = scan.nextInt();
				String item_name = scan.next();
				double item_price = scan.nextDouble();
			
				amt_spent = amt_spent + (item_quantity * item_price);
			}
			String amt_spent_2 = String.format("%.02f" , amt_spent);
			System.out.println(first_name.charAt(0) + ". " + last_name + ": " + amt_spent_2);
	
		}
		scan.close();
	}
}
