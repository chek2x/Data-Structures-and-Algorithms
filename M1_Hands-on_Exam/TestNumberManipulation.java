
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Scanner;

public class TestNumberManipulation {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);
        double arr[];
        int i;

        while (true) {
            i = 0;

            System.out.print("Enter array length: ");
            int len = input.nextInt();

            if (len < 5 || len > 100) {
                System.out.println("Invalid length. Try again.\n");
                continue;
            }

            arr = new double[len];

            while (i < len) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = input.nextDouble();

                if (arr[i] < 0 || arr[i] > 1000) {
                    System.out.println("Invalid element. Try again.\n");
                    continue;
                }

                i++;
            }

            System.out.print("\n\nYour array sorted: ");
            NumberManipulation.sort(arr);
            for (i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n\nHighest Value\t\t: " + NumberManipulation.max(arr));
            System.out.println("Highest Even Value\t: " + NumberManipulation.maxEven(arr));
            System.out.println("Highest Odd Value\t: " + NumberManipulation.maxOdd(arr));
            System.out.println("Lowest Value\t\t: " + NumberManipulation.min(arr));
            System.out.println("Lowest Even Value\t: " + NumberManipulation.minEven(arr));
            System.out.println("Lowest Odd Value\t: " + NumberManipulation.minOdd(arr) + "\n");

            NumberManipulation.executionTimes();

            input.close();
            break;
        }
    }
}