import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args) {

        // Array for months
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        // Array for average monthly temperatures
        double[] temperatures = {
                30.5, 32.0, 45.3, 55.6,
                65.1, 74.8, 80.2, 78.9,
                70.4, 58.7, 45.9, 33.6
        };

        Scanner input = new Scanner(System.in);
        String userInput = "";

        // Keep asking until user types "end"
        while (!userInput.equalsIgnoreCase("end")) {

            System.out.print("\nEnter a month, type 'year' for all data, or type 'end' to quit: ");
            userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("year")) {
                double total = 0;
                double highest = temperatures[0];
                double lowest = temperatures[0];
                String highestMonth = months[0];
                String lowestMonth = months[0];

                System.out.println("\nMonthly Temperatures:");

                for (int i = 0; i < months.length; i++) {
                    System.out.println(months[i] + ": " + temperatures[i] + "°F");

                    total += temperatures[i];

                    if (temperatures[i] > highest) {
                        highest = temperatures[i];
                        highestMonth = months[i];
                    }

                    if (temperatures[i] < lowest) {
                        lowest = temperatures[i];
                        lowestMonth = months[i];
                    }
                }

                double yearlyAverage = total / temperatures.length;

                System.out.println("\nYearly Average: " + yearlyAverage + "°F");
                System.out.println("Highest: " + highest + "°F in " + highestMonth);
                System.out.println("Lowest: " + lowest + "°F in " + lowestMonth);

            } else if (!userInput.equalsIgnoreCase("end")) {
                boolean found = false;

                for (int i = 0; i < months.length; i++) {
                    if (months[i].equalsIgnoreCase(userInput)) {
                        System.out.println(months[i] + ": " + temperatures[i] + "°F");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Invalid month entered.");
                }
            }
        }

        System.out.println("Program ended.");
        input.close();
    }
}