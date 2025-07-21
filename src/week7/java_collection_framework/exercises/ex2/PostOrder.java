package week7.java_collection_framework.exercises.ex2;

public class PostOrder {
    public static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(27);
        root.left = new Node(14);
        root.right = new Node(35);

        root.left.left = new Node(10);
        root.left.right = new Node(19);

        root.right.left = new Node(31);
        root.right.right = new Node(42);

        System.out.println("Post-order traversal of binary tree is: ");
        postOrder(root);
    }
}
