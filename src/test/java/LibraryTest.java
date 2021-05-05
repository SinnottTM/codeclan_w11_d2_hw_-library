import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library1;

    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    private Borrower borrower1;

    private ArrayList<Book> books1;

    private HashMap<String, Integer> genreCollection1;

    @Before
    public void setUp(){
        book1 = new Book("The wild adventures of your Ma", "Your Ma", "Horror");
        book2 = new Book("Your Ma rides again", "Your Da", "Drama");
        book3 = new Book("Does your Ma ever stop?", "Your Uncle", "Romance");
        book4 = new Book("Black Beauty", "Anna Sewell", "Children's literature");
        book5 = new Book("Just kidding, it's your Ma again (Bestseller!)", "Your new Da", "Drama");

        library1 = new Library(10);

        borrower1 = new Borrower("Tim");

        books1 = new ArrayList<Book>();

        genreCollection1 = new HashMap<>();

    }

    @Test
    public void hasCapacity(){
        assertEquals(10, library1.getCapacity());
    }

    @Test
    public void canSetCapacity(){
        library1.setCapacity(15);
        assertEquals(15, library1.getCapacity());
    }

    @Test
    public void hasBooks() {
        library1.addBook(book1);
        assertEquals(book1, library1.getBooks().get(0));
    }

    @Test
    public void canSetBooks(){
        library1.setBooks(books1);
        assertEquals(books1, library1.getBooks());
    }

    @Test
    public void hasGenreCollection() {
        assertEquals(genreCollection1, library1.getGenreCollection());
    }

    @Test
    public void canSetGenreCollection(){
        genreCollection1.put("Choose your own adventure", 3);
        library1.setGenreCollection(genreCollection1);
        assertEquals(genreCollection1, library1.getGenreCollection());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, library1.getBookCount());
    }

    @Test
    public void canAddBooks(){
        library1.addBook(book1);
        assertEquals(1, library1.getBookCount());
    }

    @Test
    public void cannotAddBooksPastCapacity(){
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library1.addBook(book5);
        library1.addBook(book5);
        library1.addBook(book5);
        library1.addBook(book5);
        library1.addBook(book5);
        library1.addBook(book4);
        assertEquals(10, library1.getBookCount());
        library1.addBook(book5);
        assertEquals(10, library1.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library1.addBook(book1);
        library1.addBook(book1);
        library1.loanBook(book1, borrower1);
        assertEquals(1, library1.getBookCount());

    }

    @Test
    public void checkBookAvailable() {
        assertEquals(false, library1.checkInStock(book1));
    }

    @Test
    public void checkBookAvailable__true() {
        library1.addBook(book1);
        assertEquals(true, library1.checkInStock(book1));
    }

    @Test
    public void testCanLendBook() {
        // arrange
        library1.addBook(book1);

        // act
        library1.loanBook(book1, borrower1);

        // assert
        assertEquals(1, borrower1.getBookCount());
        assertEquals(0, library1.getBookCount());
        assertEquals(false, library1.checkInStock(book1));
    }

    @Test
    public void updatesGenreHashMap__whenBookAdded(){
        //arrange
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book5);

        assertEquals(1, library1.checkGenreFrequency("Horror"));
        assertEquals(2, library1.checkGenreFrequency("Drama"));

    }

}
