import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> booksOut;

    public Borrower(String name) {
        this.name = name;
        this.booksOut = new ArrayList<Book>();
    }

//  Get total books in borrowers collection
    public int getTotalBooksOut() {
        return booksOut.size();
    }

//  Get method for borrower name
    public String getName() {
        return name;
    }

//  Working basic takeBookFromLibrary, doesn't actually interact with Library
    public void takeBookFromLibrary(Book book) {
        booksOut.add(book);
    }

//  Working basic returnBookToLibrary, doesn't actually interact with Library
    public Book returnBookToLibrary(Book book) {
        return booksOut.remove(0);
    }
}

/*

//  Checks for borrowing, can't get to work (can't resolve book?)
    public void getBook(Library library) {
        this.booksOut.add(library.removeBook(book));
    }

*/


/*

//  ROUGH WORK

//  Non-working more complex takeBookFromLibrary
    public Book takeBookFromLibrary(Library library){
        library.removeBook(book);
        return booksOut.add(book);
    }

//  Non-working more complex returnBookToLibrary
    public Book returnBookToLibrary(Library library){
        library.addBook(book);
        return booksOut.remove(book);
    }

 */

