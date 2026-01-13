public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Insertion Sort - All scenarios ===\n");

        int[] arr1 = {12, 11, 13, 5, 6};
        System.out.print("Before: ");
        printArray(arr1);
        insertionSort(arr1);
        System.out.print("After:  ");
        printArray(arr1);

        int[] arr2 = {20, 18, 15, 12, 8, 5};
        System.out.print("\nReverse: ");
        printArray(arr2);
        insertionSort(arr2);
        System.out.print("After:   ");
        printArray(arr2);

        int[] arr3 = {1, 3, 5, 7, 9};
        System.out.print("\nSorted: ");
        printArray(arr3);
        insertionSort(arr3);
        System.out.print("After:  ");
        printArray(arr3);

        int[] arr4 = {7, 7, 7, 7, 7};
        System.out.print("\nAll same: ");
        printArray(arr4);
        insertionSort(arr4);
        System.out.print("After:    ");
        printArray(arr4);
    }
}