/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class SortingAlgorithm_Lorenzo {
    public String bubbleSort(int num[]) {
        return "";
    }

    public String insertionSort(int num[]) {
        int key;
        int j;
        String str = "";

        for (int i = 1; i < num.length; i++) {
            key = num[i];
            j = i - 1;

            while (j >= 0 && key < num[j]) {
                num[j + 1] = num[j];
                --j;
            }

            num[j + 1] = key;
        }

        for (int x = 0; x < num.length; x++) {
            str += Integer.toString(num[x]) + " ";
        }

        return str;
    }

    public String quickSort(int num[]) {
        return "";
    }

    public void processTimes() {

    }
}
