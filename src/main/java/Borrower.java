import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public int countBooks() {
        return borrowedBooks.size();
    }

    public void takeBook(Library library, Book book) {
        if (library.removeBook(book)) {
            borrowedBooks.add(book);
        }
    }
}
