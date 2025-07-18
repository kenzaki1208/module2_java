package week6.inheritance.friday.exercise.using_stack_check_special_characters;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char sym : expr.toCharArray()) {
            if (sym == '(' || sym == '{' || sym == '[') {
                stack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char left = stack.pop();
                if(!isMatchingPair(left, sym)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter expression: ");
        String inp = input.nextLine();

        if (isBalanced(inp)) {
            System.out.println("-> The expression uses parentheses CORRECTLY.");
        } else {
            System.out.println("-> The expression uses parentheses INCORRECTLY.");
        }
    }
}
