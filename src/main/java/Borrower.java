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

    public void takeBookFromLibrary(Book book){
        booksOut.add(book);
    }

//    public Book returnBookToLibrary(Book book){
//        return booksOut.remove(book);
//    }

    public String getName() {
        return name;
    }
}
