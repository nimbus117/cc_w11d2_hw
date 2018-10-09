import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("LOTR", "J. R. R. Tolkien", "Fantasy");
        book2 = new Book("Dragonriders of Pern", "Anne McCaffrey", "Fantasy");
        book3 = new Book("The Dreaming Void", "Peter F. Hamilton", "Sci-Fi");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void hasEmptyCollection() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canTakeBook() {
        borrower.takeBook(library, book2);
        assertEquals(1, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void cantTakeBookWhenNotInCollection() {
        borrower.takeBook(library, book3);
        assertEquals(2, library.countBooks());
        assertEquals(0, borrower.countBooks());
    }
}

