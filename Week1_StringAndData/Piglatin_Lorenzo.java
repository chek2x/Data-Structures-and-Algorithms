
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.Scanner;

public class Piglatin_Lorenzo {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter word\t: ");
        String word = input.nextLine();
        input.close();
        invalidCheck(word);
        System.out.println("\nPig Latin\t: " + pigLatin(word));
    }

    public static boolean isVowel(char x) {
        char vowel[] = { 'a', 'e', 'i', 'o', 'u' };
        boolean output = false;

        for (char element : vowel) {
            if (element == x) {
                output = true;
                break;
            }
        }

        return output;
    }

    public static String pigLatin(String word) {
        if (isVowel(word.charAt(0))) {
            word += "ay";
        } else {
            char firstLetter = word.charAt(0);
            word += (Character.toString(firstLetter) + "ay");
            word = word.substring(1);
        }
        return word;
    }

    public static void invalidCheck(String word) {
        char[] ch = word.toCharArray();
        char[] specialChar = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', '@', '#', '$', '%', '^', '&', '*',
                '(', ')', '_', '+', '-', '=', '[', ']', '{', '}', '|', '\\', ':', '"', ';', ',', '.', '/', '<', '>',
                '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z' };

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

        if (word.length() < 3 || word.length() > 10) {
            System.out.println("\nError. Invalid input. Minimum of 3 letters and maximum of 10.\n");
            System.exit(0);
        }

    }
}
