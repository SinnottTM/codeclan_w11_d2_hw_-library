import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int getTotalBooks(){
        return books.size();
    }

    public void addBook(Book book){
        if (capacity > getTotalBooks()){
            books.add(book);}
    }

    public void removeBook(){
        books.remove(0);
    }

}
