package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		int total_cust = scan.nextInt();
		String first_name = scan.nextLine();
		String last_name = scan.nextLine();
		int total_items = scan.nextInt();
		
		double amt_spent = 0.0;
				
		for (int i = 0; i < total_items; i++) 
		{
			int item_quantity = scan.nextInt();
			String item_name = scan.nextLine();
			double item_price = scan.nextDouble();
			
			amt_spent = amt_spent + (item_quantity * item_price);
		}
		
		System.out.println(first_name.charAt(0) + ". " + last_name + ": " + amt_spent);
	}
}
