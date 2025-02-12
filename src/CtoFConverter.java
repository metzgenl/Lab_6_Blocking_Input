//Import Scanner
import java.util.Scanner;

public class CtoFConverter {
    double celsius = 0;
    String trash = "";
    Boolean done = Boolean.FALSE;
    double fahrenheit = 0;
    public void convertToF(){
        Scanner in = new Scanner(System.in);

        //Get Valid Input
        do {
            System.out.print("Enter the temperature in Celsius you wish to convert to Fahrenheit: ");

            if (in.hasNextDouble()){
                celsius = in.nextDouble();
                done = Boolean.TRUE;
            }
            else{
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid temperature, please try again.");
            }

        } while (!done);

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("The temperature " + celsius + " C fahrenheit is " + fahrenheit + " F.");

    }
}

