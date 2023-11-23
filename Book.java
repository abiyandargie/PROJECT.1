import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private List<Rental> rentals;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.rentals = new ArrayList<>();
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
    }
}