import java.util.Scanner;

public class CashRegisterDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Adam Karrer  04/26/2013\n\n");

		System.out.print("How many candy bars are you buying? ");

		int amount = keyboard.nextInt();

		RetailItem item = new RetailItem("Candy bar", 17789, 0.75, 1.5);

		CashRegister cr = new CashRegister(amount, item);

		System.out.println(cr);

	}
}