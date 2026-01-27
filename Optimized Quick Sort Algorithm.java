public class OptimizedQuickSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null || array.length < 2) return;
        quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        // Optimization: Use Insertion Sort for small subarrays (e.g., size < 10)
        if (low + 10 > high) {
            insertionSort(array, low, high);
            return;
        }

        int pivotIndex = partition(array, low, high);
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }

    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        // Median-of-Three logic
        if (array[mid].compareTo(array[low]) < 0) swap(array, low, mid);
        if (array[high].compareTo(array[low]) < 0) swap(array, low, high);
        if (array[high].compareTo(array[mid]) < 0) swap(array, mid, high);

        T pivot = array[mid];
        swap(array, mid, high - 1); // Hide pivot
        
        int i = low, j = high - 1;
        while (true) {
            while (array[++i].compareTo(pivot) < 0);
            while (array[--j].compareTo(pivot) > 0);
            if (i >= j) break;
            swap(array, i, j);
        }
        swap(array, i, high - 1); // Restore pivot
        return i;
    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <T extends Comparable<T>> void insertionSort(T[] a, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            T temp = a[i];
            int j = i;
            for (; j > low && temp.compareTo(a[j - 1]) < 0; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }
}
