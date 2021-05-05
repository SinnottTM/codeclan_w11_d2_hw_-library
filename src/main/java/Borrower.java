import java.util.ArrayList;
import java.util.Set;

public class Borrower {

    private String name;
    private ArrayList<Book> booksOut;

    public Borrower(String name) {
        this.name = name;
        this.booksOut = new ArrayList<Book>();
    }

//  Get method for borrower name
    public String getName() {
        return name;
    }

//  Set method for borrower name
    public void setName(String newName){
        name = newName;
    }

//  Get method for booksOut
    public ArrayList<Book> getBooksOut() {
        return booksOut;
    }

//  Set method for borrower name
    public void setBooksOut(ArrayList<Book> newBooks){
        booksOut = newBooks;
    }

//  Get total books in borrowers collection
    public int getBookCount() {
        return booksOut.size();
    }

//  Working basic takeBookFromLibrary, doesn't actually interact with Library
    public void takeBookFromLibrary(Book book) {
        booksOut.add(book);
    }

//  Working basic returnBookToLibrary, doesn't actually interact with Library
//    public Book returnBookToLibrary(Book book) {
//        return booksOut.remove(0);
//    }

}



