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

//  Get method for Author
    public String getAuthor(){ return author; }

//  Get method for Genre (needed for genre check)
    public String getGenre(){
        return genre;
    }

}
