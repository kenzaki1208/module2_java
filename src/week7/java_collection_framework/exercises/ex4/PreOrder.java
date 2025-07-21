package week7.java_collection_framework.exercises.ex4;

public class PreOrder {
    Node root;

    public void preOrderTraversal(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
