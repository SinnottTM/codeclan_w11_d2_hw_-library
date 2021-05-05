import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Borrower borrower2;
    private Book book1;
    private Library library;
    private ArrayList<Book> books;


    @Before
    public void setUp() {
        borrower1 = new Borrower("Tim");
        borrower2 = new Borrower("Stu");

        book1 = new Book("The wild adventures of your Ma", "Your Ma", "Horror");

        library = new Library(10);

        books = new ArrayList<Book>();

    }

    @Test
    public void hasName(){
        assertEquals("Tim", borrower1.getName());
    }

    @Test
    public void canSetName(){
        borrower1.setName("Jael");
        assertEquals("Jael", borrower1.getName());
    }

    @Test
    public void hasBooksOut() {
        assertEquals(books, borrower1.getBooksOut());
    }

    @Test
    public void canSetBooksOut(){
        books.add(book1);
        assertEquals(book1, books.get(0));
    }

    @Test
    public void canBookCount() {
        assertEquals(0, borrower1.getBookCount());
    }

    @Test
    public void canTakeOutBook() {
        library.addBook(book1);
        borrower1.takeBookFromLibrary(book1);
        assertEquals(1, borrower1.getBookCount());
    }

//    Original Test for returning via Borrower (later moved Library)
//    @Test
//    public void canReturnBook(){
//        library.addBook(book1);
//        borrower1.takeBookFromLibrary(book1);
//        borrower1.returnBookToLibrary(book1);
//        assertEquals(0, borrower1.getBookCount());}
//
}
