public class SelectionSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null) return;

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}