import java.util.ArrayList;

import java.util.Scanner;
import static java.lang.System.*;
public class App{
     ArrayList<Book> books;
     ArrayList<Person> people;
   ArrayList<Rental> rentals;
     int personIdCounter;
     int id;

    public App() {
        this.books= new ArrayList<>();
        this.people = new ArrayList<>();
        this.rentals= new ArrayList<>();
        this.personIdCounter = 1;
    }


    public void createBook() {
        Scanner scanner = new Scanner(System.in);
        out.print("Enter book title: ");
        String title = scanner.nextLine();
       out.print("Enter book author: ");
        String author = scanner.nextLine();
      out.print("Enter book ISBN: ");
        String Isbn = scanner.nextLine();
        Book book = new Book(title, author ,Isbn);
        books.add(book);

       out.println("Book created successfully.");
    }
    public void listAllBooks() {
        out.println("List of Books: ");

        for (Book book : books) {

            System.out.println("Title: " + book.getTitle());
            out.println("Author: " + book.getAuthor());
            out.println("ISBN: " + book.getIsbn());
            out.println();
        }

    }
    public void createPerson() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter person name: ");
        String name = scanner.nextLine();
        out.println("Enter person age: ");
        int age = scanner.nextInt();
        // Consume newline character
        out.println("Choose person type:");
        out.println("1. Teacher");
        out.println("2. Student");
        out.print("Enter option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Person person;
        if (option == 1) {
            System.out.println("Enter teacher specialization: ");
            String specialization = scanner.nextLine();
            person = new Teacher(id,name, Person.parent_permission,specialization,age);
        } else if (option == 2) {
            out.println("Enter student classroom: ");
            String classroom = scanner.nextLine();

           //String s= String.valueOf(id);

            person = new Student(id,name,Person.parent_permission,classroom,age);
        } else {
            System.out.println("Invalid option. Person creation canceled.");
            return;
        }
        person.setId(personIdCounter++);
        people.add(person);
        System.out.println("Person created successfully. ID: " + person.getId());

    }

    public void listAllPeople() {
        out.println("List of People:");
        for (Person person : people) {

            System.out.println("ID: " + person.getId());
            out.println("Name: " + person.getName());
            out.println("Age: " + person.getAge());
            out.println();
        }
    }

    public void createRental() {
        Scanner scanner = new Scanner(System.in);
   out.print("Enter rental date: ");
       int date = scanner.nextInt();
    out.println("Available people:");
    //to list all people

        listAllPeople();

       out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        Person person = findPersonById(personId);

        if (person == null) {
            System.out.println("Person not found. Rental creation canceled.");
            return;
        }

        out.println("Available books:");
        listAllBooks();
        out.print("Enter book ISBN: ");
         scanner.nextLine(); // Consume newline character
        String isbn = scanner.nextLine();

        Book book = findBookByIsbn(isbn);

        if (book == null) {
            System.out.println("Book not found. Rental creation canceled.");
            return;
        }
        Rental rental = new Rental(date, book, person);
        rentals.add(rental);
        out.println("Rental created successfully.");


    }

    public void listRentalsByPersonId() {
        Scanner scanner = new Scanner(System.in);
         out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        out.println("Rentals for person " + person.getName() + ":");
        for (Rental rental : rentals) {
            //int id = rental.getPerson().getId();
            if (personId==rental.getPerson().getId()) {
               out.println("Rental Date: " + rental.getDate());
                out.println("Book Title: " + rental.getBook().getTitle());
                out.println();
            }
        }
    }

    public void quitApp() {
         out.println("Exiting the app. Goodbye!");
      exit(0);
    }

   public Person findPersonById(int personId) {
        for (Person person : people) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }

     public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }


}
