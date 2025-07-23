package week7.sorting_algorithm.exercise.ex2;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int k;
            for (k = i - 1; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;

            System.out.print("Bước " + i + ": ");
            for (int v : array) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
