import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        out.println("Hi Welcome to Multiplication Tables");
        out.println("What size multiplication table would you like?");
        out.println("Please note, that multiplication tables for this program cannot exceed 20");
        out.println();
        out.println("How large of a table would you like to see?");
        Scanner keyboard = new Scanner(System.in);

        int timesTableSize;
        int counter;
        int total;

        timesTableSize = keyboard.nextInt();
        counter = timesTableSize;
        for (int x = 0; x <= counter ; x++) {
            for (int i = 0; i <= counter; i++) {
                total = x * i;
                out.println( x + " x " + i + " = " + total);
            }

        }
    }
}
