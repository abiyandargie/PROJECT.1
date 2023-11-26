import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String label;
    private List<Student> students;

    public Classroom(String label) {
        this.label = label;
        students = new ArrayList<>();
    }

    // Setter and getter for label
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    // Relationship methods for students
    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setClassroom(this);
    }
}
