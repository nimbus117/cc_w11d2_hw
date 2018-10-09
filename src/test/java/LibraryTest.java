import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    @Before
    public void before() {
        library = new Library();
        book1 = new Book("LOTR", "J. R. R. Tolkien", "Fantasy");
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
}
