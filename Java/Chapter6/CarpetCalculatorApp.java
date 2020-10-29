import java.util.Scanner;


public class CarpetCalculatorApp
{
	public static void main(String[] args)
	{
		final double CARPET_COST = 8;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Adam Karrer  04/19/2013\n\n");

		System.out.println("This program will display price to carpet a room. You must input the room's dimensions in feet.");

		System.out.print("Enter the length first: ");
		double length = keyboard.nextDouble();
		System.out.print("Now enter the width: ");
		double width = keyboard.nextDouble();


		RoomDimension dimension = new RoomDimension(length,width);
		RoomCarpet carpet = new RoomCarpet(dimension, CARPET_COST);

		System.out.println(dimension);
		System.out.println(carpet);
	}
}