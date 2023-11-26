import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("NSR/1666/14", "mengaw wubetu", false);
        System.out.println(person.correct_name());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correct_name());

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correct_name());
    }

}