package Week5.access_modifier_and_static_method_and_static_property;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean borrowed;
    private static int totalBooks;

    public Book() {
        totalBooks++;
    }

//    public Book(String title, String author, String isbn) {
//        this.title = title;
//        this.author = author;
//        this.isbn = isbn;
//        this.borrowed = false;
//    }

    public Book(String title, String author, String isbn, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = borrowed;
        totalBooks++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void setTotalBooks(int totalBooks) {
        Book.totalBooks = totalBooks;
    }

    public void borrowBook() {
        if (!this.borrowed) {
            this.borrowed = true;
            totalBooks--;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book is already borrowed");
        }
    }

    public void returnBook() {
        if (this.borrowed) {
            this.borrowed = false;
            totalBooks++;
        } else {
            System.out.println("Book is not borrowed");
        }
    }
}

