package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//initial declarations
		double max_price = 0.00;
		double min_price = 10000000.00;
		double total_price = 0.00;
		double avg_price = 0.00;
		String min_spender = null;
		String max_spender = null;
		
		//Creating an array of item + price
		int store_count = scan.nextInt();
		String[] item_name = new String[store_count];
		double[] item_price = new double[store_count];
		 
		for (int a = 0; a < store_count; a++) 
		{
			item_name[a] = scan.next();
			item_price[a] = scan.nextDouble();
			//System.out.println(item_name[a] + " " + item_price[a]);
		}
		
		//Creating arrays for customer info
		int total_cust = scan.nextInt();
		String[] first_name = new String[total_cust];
		String[] last_name = new String[total_cust];
		int[] total_items = new int[total_cust];
		double[] amt_spent = new double[total_cust];
		
		//Finding amount spent per customer
		for (int i = 0; i < total_cust; i++)
		{
			first_name[i] = scan.next();
			last_name[i] = scan.next();
			total_items[i] = scan.nextInt();
		
			amt_spent[i] = 0.00;
			 
			for (int j = 0; j < total_items[i]; j++) 
			{
				int item_quantity = scan.nextInt();
				String item_name2 = scan.next();
				double item_price2 = 0.00;
				 
				//For loop to determine price based on inputted item name
				for (int x = 0; x < item_name.length; x++)
				{
					if(item_name2.equals(item_name[x])) 
					{
						item_price2 = item_price[x];
						break;
					}
				}
				
				amt_spent[i] = amt_spent[i] + (item_quantity * item_price2);
				
			}
			
			total_price = (total_price + amt_spent[i]);
			
			//Finding biggest/smallest spenders
			if (amt_spent[i] > max_price)
			{
				max_price = amt_spent[i];
				String something = new String(first_name[i] + " " + last_name[i]);
				max_spender = something;
				//System.out.println(max_price + " " + max_spender);
			}
			
			if (amt_spent[i] < min_price)
			{
				min_price = amt_spent[i];
				String something_else = new String(first_name[i] + " " + last_name[i]);
				min_spender = something_else;
				//System.out.println(min_price + " " + min_spender);
			}
			
			//Average price
			avg_price = (total_price / total_cust);
			
		}
		
		String max_price2 = String.format("%.02f" , max_price);
		String min_price2 = String.format("%.02f" , min_price);
		String avg_price2 = String.format("%.02f" , avg_price);
		
		System.out.println ("Biggest: " + max_spender + " (" + max_price2 + ") \nSmallest: " +
			min_spender + " (" + min_price2 + ") \nAverage: " + avg_price2);
		scan.close();
		
	}
}
