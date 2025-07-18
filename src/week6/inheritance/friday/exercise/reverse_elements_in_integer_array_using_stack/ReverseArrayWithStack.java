package week6.inheritance.friday.exercise.reverse_elements_in_integer_array_using_stack;

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Before reversing: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        reverseArray(array);

        System.out.println();
        System.out.println("After reversing: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
