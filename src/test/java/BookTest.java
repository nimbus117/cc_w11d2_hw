import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;
    @Before
    public void before() {
        Book book1 = new Book("LOTR", "J. R. R. Tolkien", "Fantasy")
    }

    @Test
    public void hasTitle() {
        assertEquals("LOTR", book1.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("J. R. R. Tolkien", book1.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Fantasy", book1.getGenre());
    }
}
