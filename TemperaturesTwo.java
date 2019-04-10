import static java.lang.System.out;

public class TemperaturesTwo {
    public static void main(String[] args) {
        System.out.println("------Temperature Calculator--------");
        out.println();
        System.out.println("The data provided are: ");
        out.println();
        int[][] temps =  {{68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}};

        for (int row = 0; row < 4; row++) {
            String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
            System.out.print(times[row] + " ");
            for (int column = 0; column < 7; column++) {
                System.out.print(temps[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        out.println("----------------------------------------------------------------------------------------------");
        out.println();

        System.out.println("Based on that data, the following are the average temperatures for the week.");

        int sum;
        for (int column = 0; column < temps[0].length; column++) {
            String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};
            System.out.print(days[column]);
            sum = 0;
            for (int row = 0; row < temps.length; row++) {
                sum += (temps[row][column]);
            }
            int average = sum / temps.length;
            System.out.println(average);
        }
        System.out.println();
        out.println("----------------------------------------------------------------------------------------------");
        out.println();

        for (int row = 0; row < temps.length; row++) {
            String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
            System.out.print(times[row]);
            sum = 0;
            for (int column = 0; column < temps.length; column++) {
                sum += (temps[row][column]);
            }
            int average = sum / temps.length;
            System.out.println(average);

        }
        out.println();
        out.println("-----------------------------------------------------------------------------------------------");
        out.println();
        sum = 0;
        int indexCounter = 0;
        for(int column = 0; column < temps.length; column++){
            for(int row = 0; row < temps[column].length; row++) {
                sum += temps[column][row];
                indexCounter++;
            }
        }
        int avg = sum / indexCounter;
        out.println("The average is " + avg);
        // omg omg holy coooow!!!!   I did it!!!!  I just need to make sure I realize and know how and why this worked oh god yes!!!!

    }
    }




