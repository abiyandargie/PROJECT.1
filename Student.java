public class Student extends Person {
      String classroom;

    public Student(int id, String name, boolean parent_permission, String classroom,int age) {
        super(id, name, parent_permission,age);
        this.classroom = classroom;
    }

   