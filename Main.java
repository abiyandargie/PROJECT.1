//main class
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 24);
        System.out.println(person.correctName());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correctName());

        TrimmerDecorator trimmedPerson = new TrimmerDecorator(person);
        System.out.println(trimmedPerson.correctName());

        CapitalizeDecorator capitalizedAndTrimmedPerson = new CapitalizeDecorator(new TrimmerDecorator(person));
        System.out.println(capitalizedAndTrimmedPerson.correctName());
    }
}
