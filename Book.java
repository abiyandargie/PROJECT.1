import java.util.ArrayList;


public class Book {
   private String title;
  private String author;

    final private String Isbn;

    public Book(String title, String author,String Isbn) {
        this.title =title.toUpperCase();
        this.author = author.toUpperCase();

        this.Isbn=Isbn;

    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }



    public String getIsbn() {
        return Isbn;
    }
}
