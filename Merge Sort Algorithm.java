public class MergeSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null || array.length < 2) return;
        sort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            sort(array, left, mid);
            sort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] array, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays (Java doesn't allow generic array creation easily, 
        // so we use Object and cast or use Arrays.copyOf)
        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        System.arraycopy(array, left, L, 0, n1);
        System.arraycopy(array, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }
}