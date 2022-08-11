public class Eldest_Lorenzo {
    public static void main(String[] args) {
        Ownership.Introduction();
    }

    public static void isEldest(int[] arr, int age) {

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
