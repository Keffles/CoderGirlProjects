import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int actualForBurgers;
        int actualForVeggies;
        int actualForSoups;
        int actualForSubs;
        boolean VeggieMet;
        boolean BurgerMet;
        boolean SubMet;
        boolean SoupMet;

        out.println("Checking sales goals.");
        out.println("The sales goals for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        actualForVeggies = keyboard.nextInt();
        if (actualForVeggies >= goalForVeggies) {
            out.println("Made goal for veggies. Yay");
            VeggieMet = true;
        } else {
            out.println("Fell Short");
            VeggieMet = false;
        }

        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        actualForBurgers = keyboard.nextInt();
        if (actualForBurgers >= goalForBurgers) {
            out.println("Made goal for burgers! Yay!");
            BurgerMet = true;
        } else {
            out.println("Fell short");
            BurgerMet = false;
        }
        out.println("The sales goals for subs is" + goalForSubs);
        out.println("How many subs were sold today?");
        actualForSubs = keyboard.nextInt();
        if (actualForSubs >= goalForSubs) {
            out.println("Made goal for subs! I'll 'sub'scribe to that success");
            SubMet = true;
        } else {
            out.println("The results were 'sub' par...");
            SubMet = false;
        }

        out.println("The sales goal for soup is" + goalForSoup);
        out.println("How many soups were sold today?");
        actualForSoups = keyboard.nextInt();

        if (actualForSoups >= goalForSoup) {
            out.println("You did a 'Soup'perb job, we met our goal");
            SoupMet = true;
        } else {

            out.println("Goal not met for soups");
            SoupMet = false;
        }

        if (VeggieMet == true && BurgerMet == true && SubMet == true && SoupMet == true) {
            out.println("Made goals for everything!  Way to crush it today!");
        }
        }

            }


// use boolean and && to determine to print all goals met message












