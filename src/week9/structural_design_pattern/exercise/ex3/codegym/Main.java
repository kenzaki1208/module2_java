package week9.structural_design_pattern.exercise.ex3.codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(9);
        numbers.add(27);

        //tạo adapter với thư viện có sẵn
        CollectionUtilsAdapter adapter = new CollectionUtilsAdapter();

        //tạo client và gọi
        Client client = new Client(adapter);
        client.printMaxValue(numbers);
    }
}
