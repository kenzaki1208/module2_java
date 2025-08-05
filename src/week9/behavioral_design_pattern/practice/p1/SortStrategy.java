package week9.behavioral_design_pattern.practice.p1;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
