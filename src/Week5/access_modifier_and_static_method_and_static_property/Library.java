package Week5.access_modifier_and_static_method_and_static_property;

public class Library {
    public static void displayTotalBooks() {
        System.out.println("Total books: " + Book.getTotalBooks());
    }

    public static void main(String[] args) {
        displayTotalBooks();
    }
}
