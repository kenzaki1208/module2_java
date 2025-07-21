package week7.java_collection_framework.exercises.ex3;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {20, 10, 40, 5, 16, 30, 80, 14, 27, 50, 90};

        System.out.println("Thêm phần tử: ");
        for (int v: values) {
            System.out.print(v + " ");
            bst.insert(v);
        }

        System.out.println("\n\nDuyệt hậu tự ban đầu: ");
        bst.postOrderTraversal();

        System.out.println("\nXóa node 16 (node ko có con trái): ");
        bst.delete(16);
        bst.postOrderTraversal();

        System.out.println("\nXóa node 10 (node có con trái): ");
        bst.delete(10);
        bst.postOrderTraversal();

        System.out.println("\nXoas node 20 (node có cả 2 con): ");
        bst.delete(20);
        bst.postOrderTraversal();
    }
}
