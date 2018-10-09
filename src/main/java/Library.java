import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity) {
        bookCollection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return bookCollection.size();
    }

    public void addBook(Book book) {
        if (countBooks() < capacity) {
            bookCollection.add(book);
        }
        System.out.println(book.getTitle());
    }

    public boolean removeBook(Book book) {
        return bookCollection.remove(book);
    }
}