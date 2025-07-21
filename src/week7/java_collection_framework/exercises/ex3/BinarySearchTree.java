package week7.java_collection_framework.exercises.ex3;

public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else {
            node.right = insertRecursive(node.right, data);
        }
        return node;
    }

    public void postOrderTraversal() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = null;

        while (current != null && current.data != key) {
            parent = current;
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false;
        }

        //TH1:
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else if (parent.left == current) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }//TH2:
        else if (current.right == null) {
            if (parent == null) {
                root = current.left;
            } else if (parent.left == current) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } //TH3:
        else {
            Node rightMost = current.left;
            Node parentOfRightMost = current;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.data = rightMost.data;

            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                parentOfRightMost.left = rightMost.left;
            }
        }
        return true;
    }
}
