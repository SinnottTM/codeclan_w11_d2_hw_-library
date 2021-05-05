import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> booksOut;

    public Borrower(String name){
        this.name = name;
        this.booksOut = new ArrayList<Book>();
    }

    public int getTotalBooksOut(){
        return booksOut.size();
    }

    public String getName() { return name; }

//  Working basic takeBookFromLibrary
    public void takeBookFromLibrary(Book book){
        booksOut.add(book);
    }

//  Working basic returnBookToLibrary
    public Book returnBookToLibrary(Book book){
        return booksOut.remove(0);
    }

    /*

    Non-working more complex takeBookFromLibrary
    public Book takeBookFromLibrary(Library library){
        library.removeBook(book);
        return booksOut.add(book);
    }

    Non-working more complex returnBookToLibrary
    public Book returnBookToLibrary(Library library){
        library.addBook(book);
        return booksOut.remove(book);
    }

    Checks for borrowing, can't get to work
    public void borrowBook(Book book, Library library) {
        if (library.checkForBookGenre(book)) {
            books.add(library.removeBook(book));
        }
    }

     */
}
