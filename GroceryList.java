
import java.util.Scanner;
import static java.lang.System.out;
public class GroceryList {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String ItemOne;
        String ItemTwo;
        String ItemThree;
        int QuantityFirst;
        int QuantitySecond;
        int QuantityThird;
        float PriceOne;
        float PriceTwo;
        float PriceThree;
        float GroceryTotal;
        out.println("Please list three items on your grocery list.");
        out.println("Item one?");
        ItemOne = keyboard.nextLine();

        out.println("Item Two?");
        ItemTwo = keyboard.nextLine();

        out.println("Item Three?");
        ItemThree = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item. ");
        out.println("How many" +ItemOne+ " ?");
        QuantityFirst = keyboard.nextInt();

        out.println("How many" +ItemTwo+ "? ");
        QuantitySecond = keyboard.nextInt();

        out.println("How many" +ItemThree+ "? ");
        QuantityThird = keyboard.nextInt();

        out.print("Now please enter the price of each item.");
        out.println("How much does one" +ItemOne+ " cost? ");
        PriceOne = keyboard.nextFloat();

        out.println("How much does one" +ItemTwo+ " cost? ");
        PriceTwo = keyboard.nextFloat();

        out.println("How much does one " +ItemThree+ " cost? ");
        PriceThree = keyboard.nextFloat();

        out.println("Calculating your grocery bill...");
        GroceryTotal = (PriceOne*QuantityFirst) + (PriceTwo*QuantitySecond) + (PriceThree*QuantityThird);
        out.println("Please remember this does not include tax.");
        out.println("Your total grocery cost is " +GroceryTotal+ "");









    }
}


