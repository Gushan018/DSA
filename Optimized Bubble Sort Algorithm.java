public class BubbleSortOptimized {

    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println("Array already sorted after pass " + (i + 1));
                break;
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
        System.out.println("=== Optimized Bubble Sort - All scenarios ===\n");

        int[] arr1 = {5, 1, 4, 2, 8};
        System.out.print("Before: ");
        printArray(arr1);
        bubbleSortOptimized(arr1);
        System.out.print("After:  ");
        printArray(arr1);

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("\nAlready sorted: ");
        printArray(arr2);
        bubbleSortOptimized(arr2);
        System.out.print("After:           ");
        printArray(arr2);

        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.print("\nAlmost sorted: ");
        printArray(arr3);
        bubbleSortOptimized(arr3);
        System.out.print("After:         ");
        printArray(arr3);
    }
}