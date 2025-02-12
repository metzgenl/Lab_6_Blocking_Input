//Import Scanner
import java.util.Scanner;

//Import Math
import static java.lang.Math.pow;

public class RectangleInfo {

    double width = 0;
    double height = 0;
    double area = 0;
    double perimeter = 0;
    double diagonal = 0;
    String trash = "";
    Boolean widthDone = Boolean.FALSE;
    Boolean heightDone = Boolean.FALSE;
    public void getRectangleInfo() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                heightDone = Boolean.TRUE;
            } else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid height, please try again.");
            }

        } while (!heightDone);

        do {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                widthDone = Boolean.TRUE;
            } else {
                trash = in.nextLine();
                System.out.println("\n" + trash + " is not a valid width, please try again.");
            }

        } while (!widthDone);

        area = width * height;
        perimeter = (2 * width) + (2 * height);
        diagonal = pow((width * width) + (height * height), 0.5);

        System.out.println("The area of the rectangle is " + area + " square units.");
        System.out.println("The perimeter of the rectangle is " + perimeter + " units.");
        System.out.println("The diagonal of the rectangle is " + diagonal + " units.");
    }





}
