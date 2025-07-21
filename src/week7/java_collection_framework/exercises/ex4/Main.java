package week7.java_collection_framework.exercises.ex4;

public class Main {
    public static void main(String[] args) {
        PreOrder BST = new PreOrder();

        BST.root = new Node(27);
        BST.root.left = new Node(14);
        BST.root.right = new Node(35);

        BST.root.left.left = new Node(10);
        BST.root.left.right = new Node(19);

        BST.root.right.left = new Node(31);
        BST.root.right.right = new Node(42);

        System.out.println("Pre-order traversal of binary tree is: ");
        BST.preOrderTraversal(BST.root);
    }
}
