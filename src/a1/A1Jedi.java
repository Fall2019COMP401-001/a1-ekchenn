package a1;

import java.util.Scanner;

public class A1Jedi {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Initial declarations of arrays
		int store_count = scan.nextInt();
		String[] item_name = new String[store_count];   //initial store inventory array
		double[] item_price = new double[store_count];  //initial store inventory array
		int[] total_item_count = new int[store_count];  //final quantity of each item count
		int[] cust_per_item = new int[store_count];     //final customers per item count
		
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
		int[] cust_total_items = new int[total_cust];
		boolean[] cust_bought = new boolean[store_count];
		
		//# customers loop
		for (int i = 0; i < total_cust; i++)
		{
			first_name[i] = scan.next();
			last_name[i] = scan.next();
			cust_total_items[i] = scan.nextInt();
			
			//# items per customer loop
			for (int j = 0; j < cust_total_items[i]; j++) 
			{
				int item_quantity = scan.nextInt();         //quantity in customer's list
				String inputted_item_name = scan.next();    //item in customer's list
				
				//identifying item's place in array loop
				for(int k = 0; k < item_name.length; k++)
				{
					
					if(inputted_item_name.equals(item_name[k])) 
					{
						total_item_count[k] = total_item_count[k] + item_quantity;
						cust_bought[k] = true;
					}
				}
			}
			
			//counting customers per item 
			for(int l = 0; l < item_name.length; l++) 
			{
				if (cust_bought[l] == true) 
				{
					cust_per_item[l]++;
				}
			}
			
			//reset array
			for (int pls = 0; pls < item_name.length; pls++) 
			{
				cust_bought[pls] = false;
			}
		}
		
		//Printing output based on whether or not an item type was purchased
		for (int b = 0; b < store_count; b++)
		{
			if (total_item_count[b] == 0) 
			{
				System.out.println("No customers bought " + item_name[b]);
			} else {
				System.out.println(cust_per_item[b] + " customers bought " + 
						total_item_count[b] + " " + item_name[b]);
			}
		
		}
		scan.close();	
	}
}



