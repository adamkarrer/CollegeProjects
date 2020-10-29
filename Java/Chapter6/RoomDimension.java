public class RoomDimension
{
	private static double length;
	private static double width;


	public RoomDimension(double len, double w)
	{
		length = len;
		width = w;
	}

	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}

	public static double getArea()
	{
		return length * width;
	}

	public String toString()
	{
		String str = "Length: " + length
		+ "  Width: " + width + "  Area: " + getArea();
		return str;
	}
}