public class LinearSearching {
    public static void main(String[] args) {
        // int num[] = { 20, 30, 50, 100, 70, 30, 90, 15, 30, 40, 70, 150, 500, 1000, 1,
        // 8, 350 };
        int num[] = new int[2000000];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        System.out.println("Found\t\t: " + LinearSearching.search(1, num));
    } // end of main

    public static boolean search(int find, int num[]) {
        long start = System.nanoTime();
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            if (find == num[i]) {
                found = true;
                break;
            } // end of if
        } // end of for
        long end = System.nanoTime();
        System.out.println("Processing time\t: " + (end - start) + "d units");
        return found;
    }// end of method
}// end of class
