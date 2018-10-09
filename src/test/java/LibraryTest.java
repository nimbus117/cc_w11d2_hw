import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("LOTR", "J. R. R. Tolkien", "Fantasy");
        book2 = new Book("Dragonriders of Pern", "Anne McCaffrey", "Fantasy");
        book3 = new Book("The Dreaming Void", "Peter F. Hamilton", "Sci-Fi");
    }

    @Test
    public void hasEmptyColletion() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }
    @Test

    public void cantAddBookWhenCapacityFull() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.countBooks());
    }
}
