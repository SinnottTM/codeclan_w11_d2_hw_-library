import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    HashMap<String, Integer> genreCollection;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
        this.genreCollection = new HashMap<>();

    }

//  Get total books, needed for capacity check etc.
    public int getTotalBooks(){
        return books.size();
    }

//  Add book checks for capacity first
    public void addBook(Book book){
        if (capacity > getTotalBooks()){
            books.add(book);}
    }

//   Remove Book method, needed to be Boolean as it removes the book given, also needed to return else null
     public Boolean removeBook(Book book) {
        if (getTotalBooks() > 0){
            return books.remove(book);
        } else {
        return null;
        }
    }
}
