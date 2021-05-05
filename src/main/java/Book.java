public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

//  Get method for Title
    public String getTitle(){ return title; }

//  Set method for Title
    public void setTitle(String title) {
        this.title = title;
    }

//  Get method for Author
    public String getAuthor(){ return author; }

//  Set method for Author
    public void setAuthor(String author) {
        this.author = author;
    }

//  Get method for Genre (needed for genre check)
    public String getGenre(){
        return genre;
    }

//  Set method for Genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
