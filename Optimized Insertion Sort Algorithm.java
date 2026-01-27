public class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null || array.length < 2) return;

        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;

            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}