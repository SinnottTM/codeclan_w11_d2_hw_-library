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
    public void hasTitle(){
        assertEquals("The wild adventures of your Ma", book1.getTitle());
    }

    @Test
    public void canSetTitle(){
        book1.setTitle("Your Ma rides again");
        assertEquals("Your Ma rides again", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Your Ma", book1.getAuthor());
    }

    @Test
    public void canSetAuthor(){
        book1.setAuthor("Your Da");
        assertEquals("Your Da", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Horror", book1.getGenre());
    }

    @Test
    public void canSetGenre(){
        book1.setGenre("Comedy");
        assertEquals("Comedy", book1.getGenre());
    }

}
