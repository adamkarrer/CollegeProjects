import java.text.*;

public class RoomCarpet
{
	private double carpetCost; //Total cost per sq ft
	private RoomDimension size; //Variable to hold RoomDimension area.

	RoomCarpet(RoomDimension dim, double cost)
	{
		carpetCost = cost;
		size = new RoomDimension(dim.getLength(), dim.getWidth());
	}

	public double getTotalCost()
	{
		return carpetCost * size.getArea();
	}

	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("$###,###.00");
		String str = "Carpet cost: " + dollar.format(getTotalCost());
		return str;
	}
}