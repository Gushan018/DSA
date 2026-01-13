public class BubbleSortBasic {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Bubble Sort (Basic) - All scenarios ===\n");

        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Before: ");
        printArray(arr1);
        bubbleSort(arr1);
        System.out.print("After:  ");
        printArray(arr1);

        int[] arr2 = {1, 3, 5, 7, 9};
        System.out.print("\nAlready sorted: ");
        printArray(arr2);
        bubbleSort(arr2);
        System.out.print("After:           ");
        printArray(arr2);

        int[] arr3 = {50, 40, 30, 20, 10};
        System.out.print("\nReverse: ");
        printArray(arr3);
        bubbleSort(arr3);
        System.out.print("After:   ");
        printArray(arr3);

        int[] arr4 = {5, 2, 8, 5, 1, 5, 3};
        System.out.print("\nWith duplicates: ");
        printArray(arr4);
        bubbleSort(arr4);
        System.out.print("After:           ");
        printArray(arr4);
    }
}