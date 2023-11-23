//person class
import java.util.ArrayList;
import java.util.List;
public class Person implements Nameable {
    int id;
    String name;
    int age;
    boolean parentPermission;
    List<Rental> rentals;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.parentPermission = true;
        this.rentals = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge() || parentPermission;
    }

    @Override
    public String correctName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }
}