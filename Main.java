import java.util.Scanner;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        while (true) {
             out.println("Welcome to the School Library App!");
         out.println("===================================================================");
           out.println("=====Choose an option:                                            ");
            out.println("=====>1. Create books                                            ");
            out.println("=====>2. List all books                                            ");
            out.println("=====>3. Create a person                                           ");
             out.println("=====>4. List all people                                           ");
           out.println("=====>5. Create a rental                                         ");
            out.println("=====>6. List rentals by person ID                              ");
            out.println("=====>7. Quit app                                                ");
            out.println("=====Enter option:                                           ");
           out.print("=====================================================================\n\n");
            int option = scanner.nextInt();

            scanner.nextLine(); // Consume newline character
            switch (option) {
                case 1:
                    app.createBook();

                    break;
                case 2:
                    app.listAllBooks();
                    break;
                case 3:
                    app.createPerson();
                    break;
                case 4:
                    app.listAllPeople();
                    break;
                case 5:
                    app.createRental();
                    break;
                case 6:
                    app.listRentalsByPersonId();
                    break;
                case 7:
                    app.quitApp();
                    break;
                default:
              out.println("Invalid option. Please try again....");
            }
        }
    }
}