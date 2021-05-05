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

    public int getTotalBooks(){
        return books.size();
    }

    public void addBook(Book book){
        if (capacity > getTotalBooks()){
            books.add(book);}
    }

    public Book removeBook(Book book){
        books.remove(book);
        return book;
    }

    /*

    public Book checkForBookGenre(Book book) {
        return books.contains();
    }

     */

}
