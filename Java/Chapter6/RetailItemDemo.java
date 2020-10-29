import java.util.Scanner;

public class RetailItemDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Adam Karrer  04/21/2013");

      RetailItem item = new RetailItem("Candy bar", 17789, 0.75, 1.5);
      System.out.println(item);

      System.out.print("New wholesale cost: ");
      item.setWholesale(keyboard.nextDouble());
      System.out.print("New retail price: ");
      item.setRetail(keyboard.nextDouble());

      System.out.println(item);
   }
}
