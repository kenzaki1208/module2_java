package week7.java_collection_framework.practices.p4;

import static org.junit.jupiter.api.Assertions.*;

public class TestBST {
    public static void main(String[] args) {
        BST<String> bst = new BST<>();
        bst.insert("George");
        bst.insert("Michael");
        bst.insert("Tom");
        bst.insert("Adam");
        bst.insert("Jones");
        bst.insert("Peter");
        bst.insert("Daniel");

        System.out.println("Inorder (sorted): ");
        bst.inOrder();
        System.out.println("The number of nodes is: " + bst.getSize());
    }
}