public class Rental {
    // Date of the rental
    int date;

    // Book associated with the rental
    Book book;

    // Person who rented the book
    Person person;

    // Constructor for Rental class
    public Rental(int date, Book book, Person person) {
        this.date = date;
        this.book = book;
        this.person = person;

//        book.addRental(this);
//        person.addRental(this);  // Pass the current rental to the addRental method
    }
    // Getter for date
    public int getDate() {
        return date;
    }

    // Getter for associated book
    public Book getBook() {
        return book;
    }

    // Getter for the person who rented the book
    public Person getPerson() {
        return person;
    }

//    public void setBook(Book book) {
//        this.book = book;
//    }
}

