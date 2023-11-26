public class Student extends Person {
      String classroom;
    public Student(int id, String name, boolean parent_permission, String classroom) {
        super(id, name, parent_permission);
        this.classroom = classroom;
    }

    public Student(String id, String name, boolean parentPermission) {
        super(Integer.parseInt(id),name,parentPermission);
    }

    public void setClassroom(Classroom classroom) {
    }
}