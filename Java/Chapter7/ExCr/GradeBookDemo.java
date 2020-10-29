import java.util.Scanner;
import java.io.*;

public class GradeBookDemo
{
	public static void main(String[] args)
	{
		System.out.println("Adam Karrer  04/28/2013\n");
		GradeBook gb = new GradeBook();

		try
		{
			File students = new File("Students.txt");
			Scanner loadInfo = new Scanner (students);

			gb.joanne.setName(loadInfo.next() + " " + loadInfo.next());
			gb.joanne.setScores(loadInfo.nextDouble(),loadInfo.nextDouble(),loadInfo.nextDouble(),loadInfo.nextDouble());
			gb.will.setName(loadInfo.next() + " " + loadInfo.next());
			gb.will.setScores(loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt());
			gb.sam.setName(loadInfo.next() + " " + loadInfo.next());
			gb.sam.setScores(loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt());
			gb.kerry.setName(loadInfo.next() + " " + loadInfo.next());
			gb.kerry.setScores(loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt());
			gb.jill.setName(loadInfo.next() + " " + loadInfo.next());
			gb.jill.setScores(loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt(),loadInfo.nextInt());
			loadInfo.close();

		}
		catch (IOException e)
		{
			System.out.println("Error!");
		}

		gb.getInfo();

	}
}