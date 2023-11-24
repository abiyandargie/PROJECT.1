public class Student extends Person {
    private Classroom classroom;

    public Student(String name, int age, boolean parentPermission, String classroom) {
        super(name, age);
        this.classroom = new Classroom(classroom);
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
        classroom.addStudent(this);
    }
}
