
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int column;
        int row;
        int selection;


            System.out.println("Welcome to Tapestry");
            System.out.println("What size would you like your tapestry?");
            System.out.println("Enter 1 for an 8x3 or 2 for a 6 x 8");
            selection = keyboard.nextInt();
            if(selection != 1){
                row = 6;
                column = 8;

            }else{
                row = 8;
                column = 3;
            }

            System.out.println("\n");

            BlockyBaublePattern bbp = new BlockyBaublePattern();
            bbp.pattern(row, column);
            System.out.println("\n");


            CrossStitchWigglePattern cswp = new CrossStitchWigglePattern();
            cswp.pattern(row, column);

            System.out.println("\n");

            ZigZagLinesPattern zzlp = new ZigZagLinesPattern();
            zzlp.pattern(row, column);

    }
}

//So later.  We're going to make it so if user input is "A" then row has value of x and col of y and if user input = B then it's the other
