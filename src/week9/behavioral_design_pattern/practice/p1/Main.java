package week9.behavioral_design_pattern.practice.p1;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");

        sortedList.setSortedList(new QuickSort());
        sortedList.sort();

        sortedList.setSortedList(new MergeSort());
        sortedList.sort();

        sortedList.setSortedList(new SelectionSort());
        sortedList.sort();
    }
}
