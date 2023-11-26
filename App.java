
    import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class App {
        private static List<Book> books = new ArrayList<>();
        private static List<Person> people = new ArrayList<>();
        private static List<Rental> rentals = new ArrayList<>();



        private static void listAllBooks() {
            System.out.println("All Books:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }

        private static void listAllPeople() {
            System.out.println("All People:");
            for (Person person : people) {
                System.out.println(person.getName() + " (" + person.getId() + ")");
            }
        }

        private static void createStudent() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Is parent permission granted? (true/false): ");
            boolean parentPermission = scanner.nextBoolean();
            scanner.nextLine(); // Consume newline
            Student student = new Student(id, name, parentPermission);
            people.add(student);
            System.out.println("Student created successfully.");
        }

        private static void createTeacher() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter teacher ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter teacher name: ");
            String name = scanner.nextLine();
            System.out.print("Enter teacher department: ");
            String department = scanner.nextLine();
            Teacher teacher = new Teacher(id, name, department);
            people.add(teacher);
            System.out.println("Teacher created successfully.");
        }

        private static void createBook() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            Book book = new Book(title, author);
            books.add(book);
            System.out.println("Book created successfully.");
        }

        private static void createRental() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter person ID: ");
            String personId = scanner.nextLine();
            Person person = findPersonById(personId);
            if (person == null) {
                System.out.println("Person not found.");
                return;
            }
            System.out.print("Enter book title: ");
            String bookTitle = scanner.nextLine();
            Book book = findBookByTitle(bookTitle);
            if (book == null) {
                System.out.println("Book not found.");
                return;
            }
            Rental rental = new Rental(person, book);
            rentals.add(rental);
            System.out.println("Rental created successfully.");
        }

        private static void listRentalsForPerson() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter person ID: ");
            String personId = scanner.nextLine();
            Person person = findPersonById(personId);
            if (person == null) {
                System.out.println("Person not found.");
                return;
            }
            List<Rental> personRentals = findRentalsByPerson(person);
            if (personRentals.isEmpty()) {
                System.out.println("No rentals found for this person.");
                return;
            }
            System.out.println("Rentals for " + person.getName() + " (" + person.getId() + "):");
            for (Rental rental : personRentals) {
                Book book = rental.getBook();
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }

        private static Person findPersonById(String id) {
            for (Person person : people) {
                if (person.getId().equals(id)) {
                    return person;
                }
            }
            return null;
        }

        private static Book findBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    return book;
                }
            }
            return null;
        }

        private static List<Rental> findRentalsByPerson(Person person) {
            List<Rental> personRentals = new ArrayList<>();
            for (Rental rental : rentals) {
                if (rental.getPerson().equals(person)) {
                    personRentals.add(rental);
                }
            }
            return personRentals;
        }

}