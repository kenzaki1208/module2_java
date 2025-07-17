package week6.inheritance.thursday.exercise.ArrayLinkedList;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes = 0;

    public MyLinkedList() {
        head = null;
    }

    public static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    public void add(int index, E elememt) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(elememt);
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> newNode = new Node<>(elememt);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E elememt) {
        Node<E> newNode = new Node<>(elememt);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E elememt) {
        if (head == null) {
            addFirst(elememt);
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<>(elememt);
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removed = temp.next;
            temp.next = temp.next.next;
        }
        numNodes--;
        return removed.data;
    }

    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }

        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    @SuppressWarnings("Unchecked")
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node<E> temp = head;
        while (temp != null) {
            clonedList.addLast(temp.data);
            temp = temp.next;
        }
        return clonedList;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity) {
//        if (minCapacity > numNodes) {
//            int newCapacity = Math.max(numNodes * 2, minCapacity);
//            Node<E>[] newNodes = (Node<E>[]) new Node[newCapacity];
//            int index = 0;
//            Node<E> temp = head;
//            while (temp != null) {
//                newNodes[index++] = temp;
//                temp = temp.next;
//            }
//        }
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E getFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
        return head.data;
    }

    public E getLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}
