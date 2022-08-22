/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class NumberManipulation {
    private static long sortTime;
    private static long maxTime;
    private static long maxEvenTime;
    private static long maxOddTime;
    private static long minTime;
    private static long minEvenTime;
    private static long minOddTime;

    public static double max(double arr[]) {
        long startTime = System.nanoTime();

        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        long endTime = System.nanoTime();
        maxTime = endTime - startTime;

        return max;
    }

    public static double min(double arr[]) {
        long startTime = System.nanoTime();

        double min = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        long endTime = System.nanoTime();
        minTime = endTime - startTime;

        return min;
    }

    public static double maxOdd(double arr[]) {
        long startTime = System.nanoTime();

        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && arr[i] % 2 == 1) {
                max = arr[i];
            }
        }

        long endTime = System.nanoTime();
        maxOddTime = endTime - startTime;

        return max;
    }

    public static double maxEven(double arr[]) {
        long startTime = System.nanoTime();

        double max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i] && arr[i] % 2 == 0) {
                max = arr[i];
            }
        }

        long endTime = System.nanoTime();
        maxEvenTime = endTime - startTime;

        return max;
    }

    public static double minOdd(double arr[]) {
        long startTime = System.nanoTime();

        double min = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] && arr[i] % 2 == 1) {
                min = arr[i];
            }
        }

        long endTime = System.nanoTime();
        minOddTime = endTime - startTime;

        return min;
    }

    public static double minEven(double arr[]) {
        long startTime = System.nanoTime();

        double min = max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i] && arr[i] % 2 == 0) {
                min = arr[i];
            }
        }

        long endTime = System.nanoTime();
        minEvenTime = endTime - startTime;

        return min;
    }

    public static double[] sort(double arr[]) {
        long startTime = System.nanoTime();

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

        long endTime = System.nanoTime();
        sortTime = endTime - startTime;

        return arr;
    }

    public static void executionTimes() {
        System.out.println("sort Time\t: " + sortTime);
        System.out.println("max Time\t: " + maxTime);
        System.out.println("maxEven Time\t: " + maxEvenTime);
        System.out.println("maxOdd Time\t: " + maxOddTime);
        System.out.println("min Time\t: " + minTime);
        System.out.println("minEven Time\t: " + minEvenTime);
        System.out.println("minOdd Time\t: " + minOddTime);
        System.out.println("\n");
    }
}
