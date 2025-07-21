package week7.java_collection_framework.exercises.ex5;

public class Main {
    public static void main(String[] args) {
        BSTSearch bst = new BSTSearch();

        int[] array = {27, 14, 35, 10, 19, 31, 42};

        for (int a : array) {
            bst.insert(a);
        }

        System.out.println("Tìm 19: " + bst.search(19));
        System.out.println("Tìm 31: " + bst.search(31));
        System.out.println("Tìm 50: " + bst.search(50));
    }
}
