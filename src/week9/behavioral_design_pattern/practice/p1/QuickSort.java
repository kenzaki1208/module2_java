package week9.behavioral_design_pattern.practice.p1;

import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort");
    }
}
