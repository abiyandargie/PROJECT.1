public class Student extends Person {
    private String classroom;
    
    public Student(String id, String name, boolean parent_permission, String classroom) {
        super(id, name, parent_permission);
        this.classroom = classroom;
    }
}