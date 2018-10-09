import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;

    public Library() {
        bookCollection = new ArrayList<>();
    }

    public int countBooks() {
        return bookCollection.size();
    }
}
