import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void setUp(){
        book1 = new Book("The wild adventures of your Ma", "Your Ma", "Horror");
    }

    @Test
    public void hasName(){
        assertEquals("The wild adventures of your Ma", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Your Ma", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Horror", book1.getGenre());
    }

}
