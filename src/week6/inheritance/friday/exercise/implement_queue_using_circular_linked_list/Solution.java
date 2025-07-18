package week6.inheritance.friday.exercise.implement_queue_using_circular_linked_list;

public class Solution {
    Queue q = new Queue();

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (q.front == null) {
            q.front = newNode;
            q.rear = newNode;
            newNode.link = newNode;
        } else {
            newNode.link = q.front;
            q.rear.link = newNode;
            q.rear = newNode;
        }
    }

    public void deQueue() {
        if (q.front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        if (q.front == q.rear) {
            System.out.println("Removing " + q.front.data);
            q.front = q.rear = null;
        } else {
            System.out.println("Removing " + q.front.data);
            q.front = q.front.link;
            q.rear.link = q.front;
        }
    }

    public void displayQueue() {
        if (q.front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = q.front;
        System.out.print("Elements in Circular Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != q.front);
        System.out.println();
    }
}
