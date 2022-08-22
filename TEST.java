class test {
    public static void main(String[] args) {
        int arr[] = { 34, -34, 87, 65, 9 };
        ExchangeSort(arr);
    }

    public static void ExchangeSort(int[] num) {
        int i, j, temp; // be sure that the temp variable is the same "type" as the array
        for (i = 0; i < num.length - 1; i++) {
            for (j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) // sorting into descending order
                {
                    temp = num[i]; // swapping
                    num[i] = num[j];
                    num[j] = temp;

                    printArray(num);
                }
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}