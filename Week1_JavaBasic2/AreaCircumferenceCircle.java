
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Scanner;

public class AreaCircumferenceCircle {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Input radius of circle: ");
        double r = input.nextDouble();
        input.close();

        double area = (pi * (r * r));
        double circumference = ((2 * pi) * r);

        System.out.println("Area\t\t: " + area + "\nCircumference\t: " + circumference + "\n");
    }
}
