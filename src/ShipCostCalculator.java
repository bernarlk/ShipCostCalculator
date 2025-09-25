import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {

        double itemPrice = 0.0;
        final double SHIPPING_RATE = 0.02;
        final double FREE_SHIP_THRESHOLD = 100.0;
        double shippingCost = 0.0;
        double totalCost = 0.0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the item price: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the newline character from the input buffer

            if (itemPrice >= FREE_SHIP_THRESHOLD)
            {
                shippingCost = 0.0;
                totalCost = itemPrice;
            }
            else
            {
                shippingCost = itemPrice * SHIPPING_RATE;
                totalCost = itemPrice + shippingCost;
            }
            System.out.printf("Item Price: $%.2f\n", itemPrice);
            System.out.printf("Shipping Cost: $%.2f\n", shippingCost);
            System.out.printf("Total Cost: $%.2f\n", totalCost);

        }
        else
        {
            trash = in.nextLine();
            System.out.println("Error: Invalid item price input: " + trash);
            System.out.println("Exiting... Run the program again");
            System.exit(0);
        }



    }
}


