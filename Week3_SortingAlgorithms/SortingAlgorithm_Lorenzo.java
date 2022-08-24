/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class SortingAlgorithm_Lorenzo {
    public String bubbleSort(int num[], int choice) {
        int temp;
        String str = "";

        switch (choice) {
            case 0: // Ascending
                for (int i = 0; i < num.length - 1; i++) {
                    for (int j = 0; j < num.length - i - 1; j++) {
                        if (num[j] > num[j + 1]) {
                            temp = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = temp;
                        }
                    }

                    for (int x = 0; x < num.length; x++) {
                        if (x == 0) {
                            str = str + "\n" + Integer.toString(i + 1) + ". ";
                        }
                        str += Integer.toString(num[x]) + " ";
                    }
                }

                break;

            case 1: // Descending
                for (int i = 0; i < num.length - 1; i++) {
                    for (int j = 0; j < num.length - i - 1; j++) {
                        if (num[j] < num[j + 1]) {
                            temp = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = temp;
                        }
                    }

                    for (int x = 0; x < num.length; x++) {
                        if (x == 0) {
                            str = str + "\n" + Integer.toString(i + 1) + ". ";
                        }
                        str += Integer.toString(num[x]) + " ";
                    }
                }

                break;
        }

        return str;
    }

    public String insertionSort(int num[], int choice) {
        int key;
        int j;
        String str = "\n1. ";

        for (int x = 0; x < num.length; x++) {
            str += Integer.toString(num[x]) + " ";
        }

        switch (choice) {
            case 0: // Ascending
                for (int i = 1; i < num.length; i++) {
                    key = num[i];
                    j = i - 1;

                    while (j >= 0 && key < num[j]) {
                        num[j + 1] = num[j];
                        --j;
                    }

                    num[j + 1] = key;

                    for (int x = 0; x < num.length; x++) {
                        if (x == 0) {
                            str = str + "\n" + Integer.toString(i + 1) + ". ";
                        }
                        str += Integer.toString(num[x]) + " ";
                    }
                }

                break;

            case 1: // Descending
                for (int i = 1; i < num.length; i++) {
                    key = num[i];
                    j = i - 1;

                    while (j >= 0 && key > num[j]) {
                        num[j + 1] = num[j];
                        --j;
                    }

                    num[j + 1] = key;

                    for (int x = 0; x < num.length; x++) {
                        if (x == 0) {
                            str = str + "\n" + Integer.toString(i) + ". ";
                        }
                        str += Integer.toString(num[x]) + " ";
                    }
                }

                break;
        }

        return str;
    }

    public String selectionSort(int num[], int choice) {
        int temp;
        int min;
        String str = "\n1. ";

        for (int x = 0; x < num.length; x++) {
            str += Integer.toString(num[x]) + " ";
        }

        switch (choice) {
            case 0: // Ascending
                for (int i = 0; i < num.length; i++) {
                    min = i;
                    for (int j = i + 1; j < num.length; j++) {
                        if (num[j] < num[min]) {
                            min = j;
                        }
                    }

                    temp = num[min];
                    num[min] = num[i];
                    num[i] = temp;

                    for (int x = 0; x < num.length; x++) {
                        if (x == 0) {
                            str = str + "\n" + Integer.toString(i + 1) + ". ";
                        }
                        str += Integer.toString(num[x]) + " ";
                    }
                }

                break;

            case 1: // Descending
                for (int i = 0; i < num.length; i++) {
                    min = i;
                    for (int j = i + 1; j < num.length; j++) {
                        if (num[j] > num[min]) {
                            min = j;
                        }
                    }

                    temp = num[min];
                    num[min] = num[i];
                    num[i] = temp;

                    for (int x = 0; x < num.length; x++) {
                        if (x == 0) {
                            str = str + "\n" + Integer.toString(i + 1) + ". ";
                        }
                        str += Integer.toString(num[x]) + " ";
                    }
                }

                break;
        }

        return str;
    }

    public void processTimes() {

    }
}
