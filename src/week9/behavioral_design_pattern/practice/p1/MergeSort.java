package week9.behavioral_design_pattern.practice.p1;

import java.util.List;

public class MergeSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Merge sort");
    }
}
