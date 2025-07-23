package week7.sorting_algorithm.practice.p3;

import static week7.sorting_algorithm.practice.p3.SelectionSort.list;
import static week7.sorting_algorithm.practice.p3.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        selectionSort(list);
        for (double d : list) {
            System.out.print(d + " ");
        }
    }
}
