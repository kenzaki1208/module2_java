package week7.search_algorithm.practice.p1;

import static week7.search_algorithm.practice.p1.BinarySearch.binarySearch;
import static week7.search_algorithm.practice.p1.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
