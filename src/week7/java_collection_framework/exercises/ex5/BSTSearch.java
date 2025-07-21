package week7.java_collection_framework.exercises.ex5;

public class BSTSearch {
    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else {
            root.right = insertRecursive(root.right, data);
        }
        return root;
    }

    public boolean search(int key) {
        Node current = root;

        while (current != null) {
            if (key < current.data) {
                current = current.left;
            } else if (key > current.data) {
                current = current.right;
            } else {
                return true;
            }
        }

        return false;
    }
}
