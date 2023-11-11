
public class Main {
    public static void main(String[] args) {
        Nameable person = new Person("John Doe", 24);
        System.out.println(person.correctName());

        Nameable capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correctName());

        Nameable trimmedPerson = new TrimmerDecorator(person);
        System.out.println(trimmedPerson.correctName());

        Nameable capitalizedAndTrimmedPerson = new CapitalizeDecorator(new TrimmerDecorator(person));
        System.out.println(capitalizedAndTrimmedPerson.correctName());
    }
}