import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
//  For HashMap, you must give the type of the key and the value pair (think dictionary in Python)
    HashMap<String, Integer> genreCollection;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.genreCollection = new HashMap<>();
    }

//  Get capacity
    public int getCapacity(){return capacity;}

//  Set capacity
    public void setCapacity(int newCapacity){
        capacity = newCapacity;
    }

    //  Get books
    public ArrayList<Book> getBooks(){return books;}

    //  Set books
    public void setBooks(ArrayList<Book> newBooks){
        books = newBooks;
    }

    //  Get genreCollection
    public HashMap<String, Integer> getGenreCollection(){return genreCollection;}

    //  Set genreCollection
    public void setGenreCollection(HashMap<String, Integer> newGenreCollection){
        genreCollection = newGenreCollection;
    }

//  Has capacity
    public boolean hasCapacity(){ return capacity > books.size();}

//  Get total books, needed for capacity check etc.
    public int getBookCount(){
        return books.size();
    }

    public void addBook(Book book) {
        if(hasCapacity()){
            this.books.add(book);
            this.addToGenreHashmap(book);
        }
    }

    public void addToGenreHashmap(Book book){

        String genre = book.getGenre();

        //if the genre already exists in the hashmap, extract the existing count and assign it to the variable 'counter'
        if(this.genreCollection.containsKey(genre)){
            int counter = genreCollection.get(genre);

            // add one to the counter
            counter++;

            //put the key and new value back into the hashmap
            this.genreCollection.put(genre, counter);

        } else {

            this.genreCollection.put(genre, 1);
        }
    }

    public void loanBook(Book book, Borrower borrower) {
        // check if book in book collection
        if(this.books.contains(book)){
            // if it is, remove book from collection
            this.books.remove(book);

            // add to borrower
            borrower.takeBookFromLibrary(book);
        }
    }

    public boolean checkInStock(Book book) {
//        return this.collection.contains(book);
        for(Book individualBook:this.books){
            if(individualBook == book){
                return true;
            }
        }
        return false;
    }

    public int checkGenreFrequency(String genre) {
        return this.genreCollection.get(genre);
    }
}
