import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    List<Rental> rentals;
    final private String Isbn;

    public Book(String title, String author,String Isbn) {
        this.title = title;
        this.author = author;
        rentals = new ArrayList<>();
        this.Isbn=Isbn;

    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        rental.setBook(this);
    }

    public String getIsbn() {
        return Isbn;
    }
}
