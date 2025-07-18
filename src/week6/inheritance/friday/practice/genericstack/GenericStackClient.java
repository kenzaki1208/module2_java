package week6.inheritance.friday.practice.genericstack;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("1.3 Size of stack after pop operations: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: " + stack.size());
        System.out.println("2.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("2.3 Size of stack after pop operations: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of strings:");
        stackOfStrings();
        System.out.println();
        System.out.println("Stack of integers:");
        stackOfIntegers();
    }
}
