package week9.design_patterns.practice.p3;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();

        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        } else {
            return "I don't have the book";
        }
    }

    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
