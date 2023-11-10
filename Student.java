public class Student extends Person {
    private final String classroom;//

    public Student (String name, int age, boolean parentPermission, String classroom) {
        super(name, age);
        this.classroom = classroom;
    }

    public String getClassroom() {

        return classroom;
    }
}