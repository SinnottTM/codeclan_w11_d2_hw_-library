import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Borrower borrower2;
    private Book book1;
    private Library library;


    @Before
    public void setUp() {
        borrower1 = new Borrower("Tim");
        borrower2 = new Borrower("Ali");

        book1 = new Book("The wild adventures of your Ma", "Your Ma", "Horror");

        library = new Library(10);

    }

    @Test
    public void hasName(){
        assertEquals("Tim", borrower1.getName());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, borrower1.getTotalBooksOut());
    }

    @Test
    public void canTakeOutBook() {
        library.addBook(book1);
        borrower1.takeBookFromLibrary(book1);
        assertEquals(1, borrower1.getTotalBooksOut());
    }

    @Test
    public void canReturnBook(){
        library.addBook(book1);
        borrower1.takeBookFromLibrary(book1);
        borrower1.returnBookToLibrary(book1);
        assertEquals(0, borrower1.getTotalBooksOut());}
}
