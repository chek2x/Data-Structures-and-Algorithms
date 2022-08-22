/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class NumberManipulation {
    public static double max(double arr[]) {
        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static double min(double arr[]) {
        double min = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static double maxOdd(double arr[]) {
        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && arr[i] % 2 == 1) {
                max = arr[i];
            }
        }

        return max;
    }

    public static double maxEven(double arr[]) {
        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && arr[i] % 2 == 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static double minOdd(double arr[]) {
        double min = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] && arr[i] % 2 == 1) {
                min = arr[i];
            }
        }

        return min;
    }

    public static double minEven(double arr[]) {
        double min = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] && arr[i] % 2 == 0) {
                min = arr[i];
            }
        }

        return min;
    }

    public static double[] sort(double arr[]) {
        double temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
