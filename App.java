import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App{
    private List<Book> books;
    private List<Person> people;
    private List<Rental> rentals;
    private int personIdCounter;
    private int id;

    public App() {
        this.books = new ArrayList<>();
        this.people = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.personIdCounter = 1;
    }

    public void listAllBooks() {
        System.out.println("List of Books:");

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }

    }


    public void listAllPeople() {
        System.out.println("List of People:");
        for (Person person : people) {
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println();
        }
    }

    public void createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person name: ");
        String name = scanner.nextLine();
        System.out.println("Enter person age: ");
        int age = scanner.nextInt();
         // Consume newline character
        System.out.println("Choose person type:");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.print("Enter option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Person person;
        if (option == 1) {
            System.out.println("Enter teacher specialization: ");
            String specialization = scanner.nextLine();
            person = new Teacher(id,name, Person.parent_permission,specialization,age);
        } else if (option == 2) {
            System.out.println("Enter student classroom: ");
            String classroom = scanner.nextLine();
            String s=Integer.toString(Integer.parseInt(String.valueOf(id)));

            person = new Student(id,name,Person.parent_permission,classroom,age);
        } else {
            System.out.println("Invalid option. Person creation canceled.");
            return;
        }

        person.setId(personIdCounter++);
        people.add(person);
        System.out.println("Person created successfully. ID: " + person.getId());

    }

    public void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String Isbn = scanner.nextLine();
        Book book = new Book(title, author ,Isbn);
        books.add(book);
        System.out.println("Book created successfully.");
    }

    public void createRental() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rental date: ");
       int date = scanner.nextInt();

        System.out.println("Available people:");
        listAllPeople();
        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found. Rental creation canceled.");
            return;
        }

        System.out.println("Available books:");
        listAllBooks();
        System.out.print("Enter book ISBN: ");
        scanner.nextLine(); // Consume newline character
        String isbn = scanner.nextLine();
        Book book = findBookByIsbn(isbn);
        if (book == null) {
            System.out.println("Book not found. Rental creation canceled.");
            return;
        }

        Rental rental = new Rental(date, book, person);
        rentals.add(rental);
        System.out.println("Rental created successfully.");
    }

    public void listRentalsByPersonId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person ID: ");
        int personId = scanner.nextInt();
        Person person = findPersonById(personId);
        if (person == null) {
            System.out.println("Person not found.");
            return;
        }

        System.out.println("Rentals for person " + person.getName() + ":");
        for (Rental rental : rentals) {
            int id = rental.getPerson().getId();
            if (personId==rental.getPerson().getId()) {
                System.out.println("Rental Date: " + rental.getDate());
                System.out.println("Book Title: " + rental.getBook().getTitle());
                System.out.println();
            }
        }
    }

    public void quitApp() {
        System.out.println("Exiting the app. Goodbye!");
        System.exit(0);
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
