package week6.inheritance.thursday.exercise.ArrayLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        //addFirst
        list.addFirst("Viet Nam");
        list.addFirst("from");
        list.addFirst("I'm");
        list.addFirst("World");
        list.addFirst("Hello");

        System.out.println("List now: ");
        printList(list);

        //addLast
        list.addLast("Ha Noi");
        System.out.println("List after addLast: ");
        printList(list);

        //get index
        System.out.println("get index 2 : " + list.get(2));

        //remove
        System.out.println("remove index 2 : " + list.remove(2));
        System.out.println("List after remove: ");
        printList(list);

        // contains anh indexOf
        System.out.println("the array have 'Viet Nam' ? " + list.contains("Viet Nam"));
        System.out.println("the position of world is : " + list.indexOf("World"));

        // clone
        MyLinkedList<String> cloned = list.clone();
        System.out.println("Danh sách sau khi clone:");
        printList(cloned);

        //clear
        list.clear();
        System.out.println("List after clear: ");
        printList(list);
    }

    public static <T> void printList(MyLinkedList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}