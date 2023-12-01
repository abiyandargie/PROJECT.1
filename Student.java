public class Student extends Person {
      String classroom;

    public Student(int id, String name, boolean parent_permission, String classroom,int age) {
        super(id, name, parent_permission,age);
        this.classroom = classroom;
    }

    public Student(String id, String name, boolean parentPermission,int age) {
        super(Integer.parseInt(id),name,parentPermission,age );
    }

    public void setClassroom(Classroom classroom) {
    }
}