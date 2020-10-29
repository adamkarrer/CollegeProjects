import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;



public class SalesReceiptDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Adam Karrer  04/26/2013\n\n");

		System.out.print("How many candy bars are you buying? ");

		int amount = keyboard.nextInt();

		RetailItem item = new RetailItem("Candy bar", 17789, 0.75, 1.5);

		CashRegister cr = new CashRegister(amount, item);

		try
		{
			DecimalFormat dollar = new DecimalFormat("##0.00");

			PrintWriter receipt = new PrintWriter("Receipt.txt");
			receipt.println("Adam Karrer  04/26/2013\n");
			receipt.println("SALES RECEIPT");
			receipt.println("Unit Price: " + dollar.format(item.getRetail()));
			receipt.println("Quantity: " + amount);
			receipt.println("\nSubtotal: $" + dollar.format(cr.getSubtotal()));
			receipt.println("\nnSales Tax: $" + dollar.format(cr.getTax()));
			receipt.println("\nTotal: $" + dollar.format(cr.getTotal()));

			receipt.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error!");
		}
	}
}