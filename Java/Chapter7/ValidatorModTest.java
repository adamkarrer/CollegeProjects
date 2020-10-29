import java.util.Scanner;

public class ValidatorModTest
{
	public static void main(String[] args)
	{
		int accountNumber;

		Scanner keyboard = new Scanner(System.in);
		Validator val = new Validator();

		System.out.println("Adam Karrer  04/28/2013\n\n");

		System.out.print("Enter your charge account number: ");
		accountNumber = keyboard.nextInt();

		if (val.isValid(accountNumber))
			System.out.println("That's a valid account number.");
		else
			System.out.println("That's an INVALID account number.");
	}
}