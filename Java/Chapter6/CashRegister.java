import java.text.DecimalFormat;

public class CashRegister
{
	double total;
	int amt;
	private RetailItem candybar;

	public CashRegister(int amt, RetailItem ri)
	{
		this.amt = amt;
		candybar = new RetailItem(ri.getWholesale(), ri.getRetail());

	}

	public double getSubtotal()
	{
		return amt * candybar.getRetail();
	}

	public double getTax()
	{
		return getSubtotal() * .06;
	}

	public double getTotal()
	{
		return getSubtotal() + getTax();
	}

 public String toString()
   {
      String str;

      DecimalFormat dollar = new DecimalFormat("##0.00");

      str = "Subtotal: $" + dollar.format(getSubtotal())
          + "\nSales Tax: $" + dollar.format(getTax())
          + "\nTotal: $" + dollar.format(getTotal());
      return str;
   }
}