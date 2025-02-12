//Import Scanner
import java.util.Scanner;

public class FuelCosts {

    double gallons = 0;
    double efficiency = 0;
    double price = 0;
    double cost100Miles = 0;
    double carDistance = 0;
    String trash = "";
    Boolean gallonsDone = Boolean.FALSE;
    Boolean efficiencyDone = Boolean.FALSE;
    Boolean priceDone = Boolean.FALSE;
    public void getFuelCosts() {
        Scanner in = new Scanner(System.in);
        // Check for valid responses
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                gallonsDone = Boolean.TRUE;
            } else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid number, please try again.");
            }

        } while (!gallonsDone);

        do {
            System.out.print("Enter the fuel efficiency of your car in miles per gallon: ");

            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                efficiencyDone = Boolean.TRUE;
            } else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid efficiency entry, please try again.");
            }

        } while (!efficiencyDone);

        do {
            System.out.print("Enter the price of gas per gallon $");

            if (in.hasNextDouble()) {
                price = in.nextDouble();
                priceDone = Boolean.TRUE;
            } else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid price, please try again.");
            }

        } while (!priceDone);

        cost100Miles = (100 / efficiency) * price;
        carDistance = gallons * efficiency;

        System.out.println("The cost to drive 100 miles is $" + cost100Miles + ".");
        System.out.println("The car will be able to go " + carDistance + " miles with a full tank of gas.");
    }

}
