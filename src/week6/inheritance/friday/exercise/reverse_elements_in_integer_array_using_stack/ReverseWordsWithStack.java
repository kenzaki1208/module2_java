package week6.inheritance.friday.exercise.reverse_elements_in_integer_array_using_stack;

import java.util.Stack;

public class ReverseWordsWithStack {
    public static String reverseWords(String input) {
        Stack<String> wordStack  = new Stack<>();
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            wordStack .push(word);
        }

        StringBuilder reversed  = new StringBuilder();
        while (!wordStack.isEmpty()) {
            reversed.append(wordStack.pop());
            if (!wordStack.isEmpty()) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = " học lập  trình   Java  rất thú vị  !!!";

        System.out.println("Before reversing: " + str);

        String reversed = reverseWords(str);

        System.out.println("After reversing: " + reversed);
    }
}
