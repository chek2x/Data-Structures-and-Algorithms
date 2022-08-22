
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Random;

public class LinearSearching {
    public static void main(String[] args) {
        Ownership.Introduction();

        long startTime = System.nanoTime();

        int num[] = LinearSearching.addElements();
        System.out.println("The highest value within the generated random array is " + MAX(num) + ".\n");

        long endTime = System.nanoTime();
        System.out.println("Processing Time: " + (endTime - startTime) + " units\n");

    }

    public static int[] addElements() {
        int num[] = new int[Integer.MAX_VALUE / 5];
        Random rnd = new Random();
        int val = 0;

        for (int i = 0; i < num.length; i++) {
            val = rnd.nextInt(num.length - 1) + 1;
            num[i] = val;
        }

        return num;
    }

    public static int MAX(int num[]) {
        int highest = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > highest) {
                highest = num[i];
            }
        }

        return highest;
    }
}
