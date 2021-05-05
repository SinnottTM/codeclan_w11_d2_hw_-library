import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
//  For HashMap, you must give the type of the key and the value pair (think dictionary in Python)
    HashMap<String, String> genreCollection;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genreCollection = new HashMap<>();
    }

//  Get total books, needed for capacity check etc.
    public int getTotalBooks(){
        return books.size();
    }

//  Get capacity
    public int getCapacity(){return capacity;}

//  Has capacity
    public boolean hasCapacity(){ return capacity > books.size();}

//  Add book checks for capacity first using hasCapacity
    public void addBook(Book book){
        if (hasCapacity()){
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
