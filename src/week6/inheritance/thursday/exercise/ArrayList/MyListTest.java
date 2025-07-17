package week6.inheritance.thursday.exercise.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        //test add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("element 1: " + list.get(0));
        System.out.println("element 2: " + list.get(1));
        System.out.println("element 3: " + list.get(2));
        System.out.println("element 4: " + list.get(3));
        System.out.println("element 5: " + list.get(4));

        //test remove
        Integer removed = list.remove(2);
        System.out.println("removed element: " + removed);
        System.out.println("After remove, size = " + list.size());
        System.out.println("List now: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //test contains(E) và indexOf(E)
        System.out.println("Contains 4 ? " + list.contains(4));
        System.out.println("IndexOf 5 ? " + list.indexOf(5));

        //test clear
        list.clear();
        System.out.println("After clear, size = " + list.size());
    }
}