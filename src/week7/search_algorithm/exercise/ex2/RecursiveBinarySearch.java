package week7.search_algorithm.exercise.ex2;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) return -1;

        int middle = (left + right) / 2;

        if (array[middle] == value) return middle;
        else if (value > array[middle]) return binarySearch(array, middle + 1, right, value);
        else return binarySearch(array, left, middle - 1, value);
    }
}
