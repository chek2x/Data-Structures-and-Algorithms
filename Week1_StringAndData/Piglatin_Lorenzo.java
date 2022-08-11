public class Piglatin_Lorenzo {
    public static void main(String[] args) {
        String x = "hello";
        System.out.println(addAy(x));
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

    public static String addAy(String word) {
        if (isVowel(word.charAt(0))) {
            word += "ay";
        } else {

        }
        return word;
    }
}
