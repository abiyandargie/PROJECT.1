public class Rental {
    // Date of the rental
    String date;

    // Book associated with the rental
    Book book;

    // Person who rented the book
    Person person;

    // Constructor for Rental class
    public Rental(String date, Book book, Person person) {
        this.date = date;
        this.book = book;
        this.person = person;


        book.addRental(this);
        person.addRental();
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for associated book
    public Book getBook() {
        return book;
    }

    // Getter for the person who rented the book
    public Person getPerson() {
        return person;
    }


    public void setBook(Book book) {
        this.book=book;
    }
}