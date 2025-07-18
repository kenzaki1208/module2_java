package week6.inheritance.friday.exercise.implement_queue_using_circular_linked_list;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.enqueue(14);
        solution.enqueue(22);
        solution.enqueue(-6);
        solution.displayQueue();

        solution.deQueue();
        solution.deQueue();
        solution.displayQueue();

        solution.enqueue(9);
        solution.enqueue(20);
        solution.displayQueue();
    }
}
