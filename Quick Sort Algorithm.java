import java.util.Random;

public class QuickSort {
    private static final Random random = new Random();

    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null || array.length < 2) return;
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        // Optimization: Random Pivot to prevent O(n^2)
        int pivotIdx = low + random.nextInt(high - low + 1);
        swap(array, pivotIdx, high);
        
        T pivot = array[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }
}