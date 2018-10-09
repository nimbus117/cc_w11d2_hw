import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> bookCollection;
    private HashMap<String, Integer> genres;
    private int capacity;

    public Library(int capacity) {
        bookCollection = new ArrayList<>();
        genres = new HashMap<>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return bookCollection.size();
    }

    public void addBook(Book book) {
        if (countBooks() < capacity) {
            bookCollection.add(book);
            updateGenres(book.getGenre());
        }
    }

    private void updateGenres(String genre) {
        int count = genres.getOrDefault(genre, 0);
        genres.put(genre, (count + 1));
    }

    public boolean removeBook(Book book) {
        return bookCollection.remove(book);
    }

    public int countGenre(String genre) {
        return genres.getOrDefault(genre, 0);
    }
}