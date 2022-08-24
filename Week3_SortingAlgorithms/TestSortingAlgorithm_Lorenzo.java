
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Scanner;

public class TestSortingAlgorithm_Lorenzo {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);
        String next;
        int size, choice;
        int array[];
        SortingAlgorithm_Lorenzo sort = new SortingAlgorithm_Lorenzo();

        while (true) {
            System.out.print("Enter array size\t: ");
            next = input.next();
            try {
                size = Integer.parseInt(next);
                array = new int[size];
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error. Please input integer.\n");
                continue;
            }
        }

        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Enter element " + (i + 1) + "\t: ");
                next = input.next();
                try {
                    array[i] = Integer.parseInt(next);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error. Please input integer.\n");
                    continue;
                }
            }
        }

        while (true) {
            System.out.println("""

                    Please select sorting algorithm:
                    0 - Bubble Sort
                    1 - Insertion Sort
                    2 - Selection Sort
                    """);
            System.out.print("Choice\t: ");
            next = input.next();
            try {
                choice = Integer.parseInt(next);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error. Please input integer.\n");
                continue;
            }
        }

        switch (choice) {
            case 0:
                while (true) {
                    System.out.println("""

                            Please select order:
                            0 - Ascending
                            1 - Descending
                            """);
                    System.out.print("Choice\t: ");
                    next = input.next();
                    try {
                        System.out.println("\nBubble Sort: " + sort.bubbleSort(array, Integer.parseInt(next)) + "\n");
                        sort.processTimes();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error. Please input integer.\n");
                        continue;
                    }
                }

                break;

            case 1:
                while (true) {
                    System.out.println("""

                            Please select order:
                            0 - Ascending
                            1 - Descending
                            """);
                    System.out.print("Choice\t: ");
                    next = input.next();
                    try {
                        System.out.println(
                                "\nInsertion Sort: " + sort.insertionSort(array, Integer.parseInt(next)) + "\n");
                        sort.processTimes();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error. Please input integer.\n");
                        continue;
                    }
                }

                break;

            case 2:
                while (true) {
                    System.out.println("""

                            Please select order:
                            0 - Ascending
                            1 - Descending
                            """);
                    System.out.print("Choice\t: ");
                    next = input.next();
                    try {
                        System.out.println(
                                "\nSelection Sort: " + sort.selectionSort(array, Integer.parseInt(next)) + "\n");
                        sort.processTimes();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error. Please input integer.\n");
                        continue;
                    }
                }

                break;
        }

        input.close();
    }
}
