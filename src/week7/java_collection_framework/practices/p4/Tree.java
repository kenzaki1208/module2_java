package week7.java_collection_framework.practices.p4;

public interface Tree<E> {
    boolean insert(E e);
    void inOrder();
    int getSize();
}
