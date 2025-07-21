package week7.java_collection_framework.practices.p4;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {}

    public BST(E[] object) {
        for (int i = 0; i < object.length; i++)
            insert(object[i]);
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if (root != null) {return;}
        inOrder(root.left);
        System.out.println(root.element + " ");
        inOrder(root.right);
    }
}
