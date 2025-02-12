//Import Scanner
import java.util.Scanner;

//Import Random
import java.util.Random;

public class HighorLow {

    //Use Random
    Random rng = new Random();
    int random = rng.nextInt(10) + 1;
    int guess = 0;
    String trash = "";
    Boolean done = Boolean.FALSE;
    public void randomChance() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Guess the random number [1-10]: ");

            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10) {
                    done = Boolean.TRUE;
                } else {
                    System.out.println("\n" + guess + " is not a valid guess, please try again.");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid guess, please try again.");
            }

        } while (!done);

        // Too high
        if (guess > random){
            System.out.println ("Your guess of " + guess + " was larger than the random number " + random + ".");
        }
        // Too low
        if (guess < random){
            System.out.println ("Your guess of " + guess + " was smaller than the random number " + random + ".");
        }
        // Correct!
        if (guess == random){
            System.out.println ("Your guess of " + guess + " was exactly the random number " + random + "!");
        }
    }
}
