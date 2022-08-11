
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Scanner;

public class Palindrome_Lorenzo {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String\t: ");
        String word = input.nextLine();
        input.close();
        invalidCheck(word);
        System.out.println("Palindrome\t: " + isPalindrome(word) + "\n");
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt((word.length() - 1) - i)) {
                return false;
            }
        }

        return true;
    }

    public static void invalidCheck(String word) {
        char[] ch = word.toCharArray();
        char[] specialChar = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '^', '&', '*',
                '(', ')', '_', '+', '-', '=', '[', ']', '{', '}', '|', '\\', ':', '"', ';', ',', '.', '/', '<', '>',
                '?' };

        if (word.contains(" ")) {
            System.out.println("\nError. Invalid input. Input only one word.\n");
            System.exit(0);
        }

        for (char x : ch) {
            for (char y : specialChar) {
                if (x == y) {
                    System.out.println("\nError. Invalid input. Remove special character or uppercase letter.\n");
                    System.exit(0);
                }
            }
        }
    }
}
