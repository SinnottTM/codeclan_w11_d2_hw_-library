import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void setUp(){
        book1 = new Book("The wild adventures of your Ma", "Your Ma", "Horror");
        book2 = new Book("Your Ma rides again", "Your Da", "Drama");
        book3 = new Book("Does your Ma ever stop?", "Your Uncle", "Romance");
        book4 = new Book("Black Beauty", "Anna Sewell", "Children's literature");
        book5 = new Book("Just kidding, it's your Ma again (Bestseller!)", "Your new Da", "Drama");
        book6 = new Book("Just kidding, it's your Ma again (Bestseller!)", "Your new Da", "Drama");

        library = new Library(10);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, library.getTotalBooks());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        assertEquals(1, library.getTotalBooks());
    }

    @Test
    public void cannotAddBooksPastCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book5);
        library.addBook(book5);
        library.addBook(book5);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(10, library.getTotalBooks());
        library.addBook(book5);
        assertEquals(10, library.getTotalBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(1, library.getTotalBooks());

    }

}
