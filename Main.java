import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Options:");
            System.out.println("1. List all books");
            System.out.println("2. List all people");
            System.out.println("3. Create a student");
            System.out.println("4. Create a teacher");
            System.out.println("5. Create a book");
            System.out.println("6. Create a rental");
            System.out.println("7. List rentals for a person ID");
            System.out.println("0. Quit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    listAllBooks();
                    break;
                case 2:
                    listAllPeople();
                    break;
                case 3:
                    createStudent();
                    break;
                case 4:
                    createTeacher();
                    break;
                case 5:
                    createBook();
                    break;
                case 6:
                    createRental();
                    break;
                case 7:
                    listRentalsForPerson();
                    break;
                case 0:
                    System.out.println("Quitting the app...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}