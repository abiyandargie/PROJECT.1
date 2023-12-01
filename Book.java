import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    String author;
    List<Rental> rentals;
    private String Isbn;

    public Book(String title, String author,String Isbn) {
        this.title = title;
        this.author = author;
        rentals = new ArrayList<>();
        this.Isbn=Isbn;

    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        rental.setBook(this);
    }

    public String getIsbn() {
        return Isbn;
    }
}
